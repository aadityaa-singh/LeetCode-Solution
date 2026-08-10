1# Write your MySQL query statement below
2select e.name as employee 
3from employee e
4 join employee m
5on e.managerId=m.id
6where e.salary>m.salary;