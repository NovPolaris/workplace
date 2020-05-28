# 列出各个部门MANAGER的最低薪金
select min(sal)
from emp
where job = "MANAGER"
group by deptno;