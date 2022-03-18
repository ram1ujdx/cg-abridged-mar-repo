
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

select ename, sal, sal/30 as "daily_salary", round(datediff(now(),hiredate)/365) as 'Experience' from emp where sal/30>=100;

use btc_new_db;

select count(*) as "Total Employees" from emp;

select job,count(*) as "Total Employees" from emp group by job;

select deptno, count(*) as "Total Employees", avg(sal) as "Average Salary" from emp group by deptno;

select deptno, count(*) as "Total Employees", avg(sal) as "Average Salary" from emp where sal>2000 group by deptno;

-- find the average salary of employees where total no of employees>2 and employee salary>2000 dept wise --

select deptno, count(*) as "Total Employees", avg(sal) as "Average Salary" from emp where sal>2000 group by deptno having count(empno)>2;

-- find the employees whose name starts with J--
select * from emp where ename like 'J%';

-- FIND THE EMPLYEES WHO JOINED IN THE MONTH OF JAN--
select * from emp where hiredate like '____-01-__';

-- For Oracle--
select * from emp where hiredate like '__-JAN-____';



select deptno, count(*) as "Total Employees", avg(sal) as "Average Salary" from emp group by deptno order by 3;


-- syntax --
--  where -> group by -> having -> order by

select * from emp where mod(sal,200)=0;

select * from emp order by sal limit 5;


select * from emp where extract(day from hiredate)<=15;

-- List the enames who are retiring after ’2001-12-31’ the max job period is 20Y. --

select ename,hiredate, extract(year from '2001-12-31') - extract(year from hiredate) as "Experience till 2001" from emp where extract(year from '2001-12-31') - extract(year from hiredate)<20;

select deptno from emp group by deptno having count(*)=(select count(*) from emp group by deptno order by 1 desc limit 1) ;

-- PRIMARY KEY --
-- UNIQUE KEY --
-- NOT NULL --
-- DEFAULT --
-- FOREIGN KEY--
-- CHECK CONSTRAINT --


create table stud(roll numeric(3) primary key, student_name varchar(30) not null, score numeric(5,2) default 0.0, phone numeric(11) unique);
desc stud;

alter table emp add primary key(empno);

desc emp;

select * from dept;


select * from dept;

select * from emp;


select empno,ename, emp.deptno, dname, location from emp left join dept on emp.deptno=dept.deptno;

select empno,ename, emp.deptno, dname, location from emp left join dept using(deptno);

select empno,ename, emp.deptno, dname, location from emp right join dept using(deptno);

-- Find the dept which doesn't have any employee --

select d.* from dept d left join emp e on d.deptno=e.deptno where empno is null;

-- Find the Salesman working in Accounts dept --

select ename,job,dname from emp join dept on emp.deptno=dept.deptno where dname='accounts' and job='salesman';

-- Find total employees working in Delhi --

SELECT COUNT(*) as "Total Employees", location FROM EMP,DEPT WHERE EMP.DEPTNO=DEPT.DEPTNO AND location='DELHI' ;


-- Find the CLERK working in Bangalore --

select * from emp where job='CLERK' and deptno=(select deptno from dept where location='Bangalore');

-- Show the employee name along with dept name --

select ename,dname from emp join dept on emp.deptno=dept.deptno;

-- Show the employee name along with manager name --

select e.ename,m.ename from emp e join emp m on e.mgr=m.empno;

select ename,mgr,(select ename from emp where e.mgr=empno) as "Manager" from emp e;

-- Show the details of all the MGRs --

select distinct m.* from emp e join emp m on e.mgr=m.empno;

select * from emp where empno in(select distinct mgr from emp);

-- Find the least earner of SALES dept --

 select * from emp where sal = (select min(sal) from emp where deptno=(select deptno from dept where dname='SALES'));
 
 select e.* from emp e left join dept d on e.deptno=d.deptno where d.dname='Sales' order by sal limit 1;
 
 -- Find the list of manager and total employees working under them --
 
 select m.empno,m.ename,(select count(empno) from emp e where e.mgr=m.empno) as "Total Employees" from emp m where empno in(select mgr from emp);
 
 select e.mgr,m.ename, count(e.mgr) from emp e join emp m on e.mgr=m.empno group by e.mgr,m.empno,m.ename;
 
 -- Create table using subquery --
 
 create table empdept as (select e.empno,e.ename, d.deptno, d.dname from emp e join dept d on e.deptno=d.deptno);
 
 select * from empdept;
 

