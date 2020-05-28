# 列出薪金高于在部门30工作的所有员工的薪金的员工姓名和薪金、部门名称
select ename, sal, dname
from emp e
join dept d
on e.deptno = d.deptno
where sal > (
	select max(sal)
	from emp
	where deptno = 30);