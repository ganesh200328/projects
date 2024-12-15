create schema college;
use college;
create table students(student_id int PRIMARY KEY Auto_Increment,
Student_name varchar(20),
Adhar_NO int Unique,
Age int Not NUll,
DOB date,
Course varchar(30) default 'Unassigned'
);


desc students;

select * from students;



insert into students(Student_name,Adhar_NO,Age,DOB,Course) values("ARUN",0001,21,"2002-11-17","JAVA");
insert into students(Student_name,Adhar_NO,Age,DOB,Course) 
values("ARUN",0001,21,"2002-11-17","JAVA"),
("ARUNKUMAR",0002,21,"2003-05-25","JAVA"),
("ELANGO",0003,21,"2003-06-17","PYTHON"),
("GANESHKUMAR",0004,21,"2003-01-28","JAVA"),
("KANNAN",0005,22,"2002-07-19","PYTHON"),
("MOHAN",0006,21,"2003-09-25","PYTHON"),
("MUTHUKRISHNAN",0007,21,"2002-11-19","C#"),
("LOGANATHAN",0008,21,"2003-11-19","C#"),
("RAVINKUMAR",0009,22,"2002-09-10","C"),
("RAJ",0010,21,"2003-08-15","C");



select * from students;


select Student_id,Student_name,round(datediff(curdate(),DOB)/365) as AGE,Age from students;



select Student_id,Student_name,round(datediff(curdate(),DOB)/365) as AGE from students where age=round(datediff(curdate(),DOB)/365);

select Avg(AGE) from students; 

select count(Student_id) as Count from students;

select * from students where Student_name like '%n%'; 

select * from students where Student_name like '%R';

select * from students where Student_name like 'G%';  

select * from students where Student_name like '__n%';
 
select * from students order by Student_name asc;

select * from students order by DOB ;

select distinct Course from students;

select count(*),Course from students group by Course;


drop table students;
select * from students;

create table course(Student_id int,COURSE_ID int,COURSE_NAME varchar(40),foreign key(Student_id) references students(student_id));
ALTER TABLE course DROP PRIMARY KEY;
desc course;
insert into course(Student_id,COURSE_ID,COURSE_NAME) values(1,1,"JAVA FULSTACK");
insert into course(Student_id,COURSE_ID,COURSE_NAME) values(2,1,"JAVA FULSTACK");
insert into course(Student_id,COURSE_ID,COURSE_NAME) values(4,1,"JAVA FULSTACK");
insert into course(Student_id,COURSE_ID,COURSE_NAME) values(3,1,"PYTHON COURSE");
insert into course(Student_id,COURSE_ID,COURSE_NAME) values(5,2,"PYTHON COURSE");
insert into course(Student_id,COURSE_ID,COURSE_NAME) values(7,3,"C SHARP");
truncate course;

select * from course;
select * from students;
Alter table students drop column adhar_NO;
Alter table students add adhar_NO int;

create table adhar(Student_id int PRIMARY KEY,adhar_NO int,foreign key(Student_id) references students(Student_id));
alter table students modify column adhar_NO varchar(100);
insert into adhar(Student_id,adhar_no) values(1,aa017),(2,ak025),(3,eo025),(4,gk028)(5,kn019),(6,mn025),(7,mk019),(8,lg019),(9,rk010),(10,ra012);
select * from adhar