# Write your MySQL query statement below

select s.product_id, t.first_year, s.quantity, s.price
from sales s
LEFT JOIN
(select product_id, MIN(year) as first_year
from sales
group by 1) T
on s.product_id = t.product_id
where s.year = t.first_year;