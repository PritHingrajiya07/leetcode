# Write your MySQL query statement below
select Distinct l1.num as ConsecutiveNums
from logs l1
LEFT JOIN logs l2
    on l1.id + 1 = l2.id
left join logs l3
    on l2.id + 1 = l3.id
WHERE l1.num = l2.num
AND l2.num = l3.num;