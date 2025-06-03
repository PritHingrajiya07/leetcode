# Write your MySQL query statement below
SELECT st.student_id, st.student_name, sb.subject_name, Count(ex.student_id) as attended_exams
FROM students st 
    CROSS JOIN subjects sb
    LEFT JOIN examinations  ex
ON  st.student_id = ex.student_id AND  sb.subject_name = ex.subject_name
GROUP BY st.student_id, sb.subject_name 
ORDER BY st.student_id, sb.subject_name ASC;