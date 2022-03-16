
select * from emp;

select distinct job from emp;

select * from emp order by sal asc;


select * from emp order by deptno asc, job desc;

select * from emp where job = 'MANAGER';

select * from emp where hiredate<'1981-01-01';

select sal/30 as "Daily Salary" from emp;

select ename,hiredate, extract(year from now())-extract(year from hiredate) as 'Experience' from emp;

-- For Oracle --
select round((sysdate-hiredate)/365) from emp;

select round(datediff(now(),hiredate)/365) from emp;

select * from emp where job = 'CLERK' OR job = 'SALESMAN';

select * from emp where job IN('CLERK','SALESMAN');

-- FIND THE EMPLOYEES WHO ARE GETTING SALARY BETWEEN 1500 AND 2500 --

select * from emp where sal>=1500 AND sal<=2500;

select * from emp where sal between 1500 AND 2500;

-- DEALING WITH NULL VALUES --

select * from emp where comm is not null and comm <> 0;



