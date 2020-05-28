#列出部门名称和这些部门的员工信息，同时列出那些没有员工的部门
select d.dname, e.empno, e.ename, e.job, e.mgr, e.sal, e.comm, e.deptno
from dept d
left join emp e
on e.deptno = d.deptno;