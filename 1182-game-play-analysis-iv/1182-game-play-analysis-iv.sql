# Write your MySQL query statement below
    
SELECT round(COUNT(Distinct t.player_id) / COUNT(distinct a.player_id),2) as fraction  
from activity a
LEFT JOIN    
(select player_id, MIN(event_date) as dat
from activity
group by player_id) t
ON a.player_id = t.player_id
AND date_sub(a.event_date, INTERVAL 1 DAY) = t.dat; 