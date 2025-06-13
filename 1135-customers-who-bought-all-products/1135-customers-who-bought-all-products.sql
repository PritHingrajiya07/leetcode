# Write your MySQL query statement below
select customer_id
from customer
group by 1 
HAVING count(distinct product_key) = ( SELECT count(product_key) from product);