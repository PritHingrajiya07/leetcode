# Write your MySQL query statement below
select r.contest_id, 
       Round((COUNT(DISTINCT u.user_id) *100)/(select count(distinct user_id) from users),2) as percentage
FROM users u JOIN register r
    ON u.user_id = r.user_id
    
group by contest_id 
order by 2 DESC, 1;