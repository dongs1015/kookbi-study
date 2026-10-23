select * from student

drop table student

purge recyclebin

create table student -- 학생 테이블 만듬 
(
    name varchar2(20) not null,
    age number(3), 
    address varchar2(20),
    tel varchar2(20)
)

insert into student   -- 학생 정보 입력 
values('홍길동',20,'서울','02-1234-1234') 

insert into student
values('둘리',30,'부천','032-2222-2222')

insert into student
values('하니',40,'부산','051-1234-5678')

select * from student 

delete from student -- 실수로 테이블날려도 transaction 상태 

rollback -- 작업을 되돌림 물리작업전상태로 

commit -- 확정지어서 논리상태를 물리상태로 만듬 

create table book
(
    title varchar2(40),
    auth varchar2(20),
    price number(20)
)

select * from book

commit






