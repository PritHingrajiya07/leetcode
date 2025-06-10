# Write your MySQL query statement below
SELECT activity_date as day, COUNT(distinct user_id) as active_users
FROM activity
where activity_date between date_sub('2019-07-28', Interval 30 day) AND
                    '2019-07-28'
group by 1;