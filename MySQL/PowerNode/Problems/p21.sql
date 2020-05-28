# 列出在部门“SALES”<销售部>工作的员工的姓名，假定不知道销售部门的部门编号
select ename
from dept d
join emp e
on d.deptno = e.deptno
where d.dname = "SALES";