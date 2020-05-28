# 列出薪金等于部门30中员工的薪金的其他员工的姓名和薪金
select ename sal
from emp e
where sal in (
	select sal
	from emp
	where deptno = 30 and sal is not null)
and deptno <> 30;