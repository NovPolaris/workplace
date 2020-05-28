# 求出员工领导的薪水超过3000的员工名称和领导名称
select e1.ename, e2.ename
from emp e1
join emp e2
on e1.mgr = e2.empno and e2.sal > 3000;