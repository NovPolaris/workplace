# 列出所有员工的姓名、部门名称和工资
select ename, dname, sal
from emp e
right join dept d
on e.deptno = d.deptno;