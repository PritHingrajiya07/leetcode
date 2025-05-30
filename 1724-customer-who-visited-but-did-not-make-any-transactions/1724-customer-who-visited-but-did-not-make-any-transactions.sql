# Write your MySQL query statement below
select v.customer_id, COUNT(v.visit_id) as count_no_trans
FROM visits as v LEFT JOIN Transactions as t
ON v.visit_id = t.visit_id
where t.transaction_id is null
group by v.customer_id;