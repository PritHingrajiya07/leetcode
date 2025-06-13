# Write your MySQL query statement below
 select e.employee_id, e.department_id
 from employee e
 LEFT JOIN
    (select employee_id, count(department_id) as num
    from employee
    group by 1) s
 ON e.employee_id = s.employee_id 
 where s.num = 1
 OR e.primary_flag = 'Y'
 ;