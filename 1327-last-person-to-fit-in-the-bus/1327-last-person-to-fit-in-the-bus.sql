# Write your MySQL query statement below
WITH hdg AS (
  SELECT *, SUM(weight) OVER (ORDER BY turn) AS mass
  FROM Queue
)
SELECT person_name
FROM hdg
WHERE mass <= 1000
ORDER BY turn DESC
LIMIT 1;