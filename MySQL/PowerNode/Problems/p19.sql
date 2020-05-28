# 列出所有“CLERK”（办事员）的姓名及其部门名称，部门人数
select ename, dname, ecount
from emp e
join dept d
on e.deptno = d.deptno and job = "CLERK"
join (
	select count(deptno) ecount, deptno
	from emp
	group by deptno) t
on d.deptno = t.deptno;