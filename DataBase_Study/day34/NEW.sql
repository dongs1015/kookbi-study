create table 테이블명
(
    컬럼명 자료형 제약조건 ,
        : 
) 
select * from tab
 
desc student

select * from student

insert into studen(name,age,addr,tel)
values('홍길동',20,'서울','[02-1234-1234')

insert into student
values('둘리', 30,'부천','032-2222-2222')

insert into studen(name,age,addr,tel) -- 실패 자릿수가 안맞아서 
values('하니', 40,'부산')

insert into studen(name,age,addr) -- 성공 
values('하니', 40,'부산')

select * from student

insert into student
values('도우너',50,null,'010-1234-5678')

select * from tab

create table emp03
as(select *from emp where1=0)

select * from emp03

insert into emp03
(select * from emp)

select * from student

update student 
set tel = '02-1234-1234'
where name='홍길동'

create table dept02
as(select * from dept)

select * from dept02
--> 뉴욕을 서울로
update dept02
set loc = '서울'
where deptno=10

select * from emp03
--매니저의 급여 15% 인상  
update emp03
set sal =sal*1.15
where job ='MANAGER'

select * from dept --Dallas

--dallas에서 근무하는 사원들만 급여 5%인상

select deptno from dept where loc='DALLAS' -- 20

update emp03
set sal = sal  * 1.05
where deptno=(select deptno from dept where loc='DALLAS')

select * from emp03 

select * from dept02

update dept02
set dname='SALES',loc='CHICAGO'
where deptno=10

select * from dept02

select from student

delete from student
where name='하니'

select * from emp03

delete from emp03

insert into emp03(select * from emp)

select * from dept02
--emp03의 사원중 research부서의 사원을 삭제하시오
 
 select deptno from dept02 where dname ='RESEARCH'
 
 delete from emp03
 where deptno=(select deptno from dept02 where dname='RESEARCH')
 
 select * from emp03
 
create table const_test(
    col1 varchar2(10) not null,
    col2 varchar2(10)
)

insert into const_test
values('test1', 'test1')

select * from const_test

insert into const_test values(null, 'test2')

insert into const_test values('test2', null)

create table const_test02
(
    col1 varchar2(10),
    col2 varchar2(10) not null,
    col3 varchar2(10) unique
)

select * from const_test02

insert into const_test02
values('test3','test3','test3')

create table const_test03
(
    col1 varchar(10) unique, -- 중복값은 막지만 null에 대한 중복은 막을수 없음 
    col2 varchar(10) unique not null,        -- not null을 같이 넣을수있음 중복되지않으면서 null도 못넣음 
    col3 varchar(10) not null 
)
into const_test03 values(null,'data1','data1')

select * from const_test03

create table const_test04
(
    col1 varchar2(10) primary key, -- unique 와 not null 합쳐놓음 <-- 기본키 유일한 값을 가짐 ex)주민등록번호 
    col2 varchar2(10),
    constraint col2_uniq unique(col2) -- 아웃라인 방식  
) 

insert into const_test04 values('data3',null)

select * from const_test04

create table const_test05(
    col1 varchar2(10) primary key,
    col2 varchar2(10) default 'test'
)

select * from const_test05

insert into const_test05(col1) values('data3')

select * from emp

select * from dept

select * from tab

select * from dept02

insert into emp02
values(00001, '둘리', '매니저', null, sysdate, 1000, null, 50)

select * from emp02

SELECT * from tab

desc dept

create table dept03(
    deptno number(2) primary key,
    danme varchar2(14),
    loc varchar2(13)
)

select * from dept03
desc emp

create table emp04(
    empno number(4) primary key,
    ename varchar2(10),
    job varchar2(9),
    hiredate date,
    sal number(7,2),
    deptno number(2) constraint fk_yong_deptno references dept03(deptno)
)
select * from emp04

insert into emp04
values(2222, '홍길' , '점원' , sysdate, 2000, 50) 

drop table student

delete from const_test

select * from tab

create table student(  -- 학생테이블 생성 
    sname varchar2(10),
    snumber number(10) primary key, -- 프라이머리키사용 
    hiredate date
)

select * from student     

insert into student           -- 학생테이블 입력 
values('길동',2670003, sysdate) 

update student set sname='홍길' where snumber = '2670001' -- 학생테이블 수정 

delete from student where snumber = '2670001' -- 학생 테이블 삭제
 
































