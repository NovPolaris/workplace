# 列出与“SCOTT”从事相同工作的左右员工及部门名称
select e.ename, d.dname
from emp e
join dept d
on e.deptno = d.deptno
where e.job = (
	select job
	from emp
	where ename = "SCOTT");