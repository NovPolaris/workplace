# 列出薪水比“SMITH”多的所有员工信息
select empno, ename, job, mgr, hiredate, e.sal, comm, deptno
from emp e
join (
	select sal
	from emp
	where ename = "SMITH") t
on e.sal > t.sal;