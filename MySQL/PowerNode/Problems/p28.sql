# 列出所有部门的详细信息和人数
select count(ename), d.deptno, dname, loc
from emp e
right join dept d
on e.deptno = d.deptno
group by d.deptno, dname, loc;