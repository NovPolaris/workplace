# 列出至少有5个员工的所有部门
select d.dname, d.deptno, t.count
from dept d
join (
	select count(deptno) as count, deptno
	from emp
	group by deptno) t
on d.deptno = t.deptno and t.count >= 5;