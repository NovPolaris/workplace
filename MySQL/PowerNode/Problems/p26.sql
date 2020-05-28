# 列出在每个部门的员工数量、平均工资和平均服务期限
select count(ename), avg(sal), avg((to_days(now()) - to_days(hiredate)) / 365) serveYear
from emp
group by deptno;