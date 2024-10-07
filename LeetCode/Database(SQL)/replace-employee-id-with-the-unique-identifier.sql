-- https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier/
select
    unique_id,
    name
from
    employees as emp
    left join employeeUNI as uni on uni.id = emp.id