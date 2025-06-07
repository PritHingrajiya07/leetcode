# Write your MySQL query statement below
select s.user_id, Round(
    IFNULL(sum(c.action = 'confirmed')/ count(c.action), 0) ,2) as confirmation_rate
from signups s LEFT JOIN Confirmations c
ON s.user_id = c.user_id
GROUP BY 1;