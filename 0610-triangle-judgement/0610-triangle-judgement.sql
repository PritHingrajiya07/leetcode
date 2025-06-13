# Write your MySQL query statement below
SELECT  *, IF(x+y<=z OR y+z<=x OR x+z<=y, "No", "Yes") as triangle
from triangle;