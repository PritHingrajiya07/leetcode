# Write your MySQL query statement below
select ifnull (
    (select num
        from mynumbers 
        group by 1 
        having count(*)  = 1
        order by num DESC LIMIT 1), null) as num ;