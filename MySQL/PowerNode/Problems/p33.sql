# 求部门名称中带“S”字符的部门员工的工资合计、部门人数
select sum(sal), count(ename)
from emp e
join (
	select dname, deptno
	from dept
	where dname like "%S%") t
on e.deptno = t.deptno
group by e.deptno;