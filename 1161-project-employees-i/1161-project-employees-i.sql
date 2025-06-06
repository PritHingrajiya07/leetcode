# Write your MySQL query statement below
select p.project_id , ROUND(sum(e.experience_years )/ count(e.employee_id), 2 ) as average_years
from project p JOIN employee e
ON p.employee_id = e.employee_id 
group by 1;