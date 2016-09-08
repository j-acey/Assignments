-- create the tables
create table major (
  id int primary key auto_increment,
  name varchar(30),
  sat_score int
);

-- insert majors with min scores
insert major (id, name, sat_score) values (1, 'General Business', 800);
insert major (name, sat_score) values ('Accounting', 1000);
insert major (name, sat_score) values ('Finance', 1100);
insert major (name, sat_score) values ('Math', 1300);
insert major (name, sat_score) values ('Engineering', 1350);
insert major (name, sat_score) values ('Education', 900);
insert major (name, sat_score) values ('General Studies', 500);

-- create instructor table
create table instructor (
  id int primary key not null auto_increment,
  first_name varchar(30) not null,
  last_name varchar(30) not null,
  yrs_exp int not null,
  tenured tinyint(1) not null,
  major_id int not null,
  foreign key (major_id) 
  	references major(id)
  );

-- INSTRUCTOR: Sample data
INSERT instructor VALUES (10,'Joe','Downey',10,1);
INSERT instructor VALUES (20,'Jane','Jones',6,1);
INSERT instructor VALUES (30,'Bill','Tensi',3,0);
INSERT instructor VALUES (40,'Sherry','Nagy',14,1);
INSERT instructor VALUES (50,'Frank','Schell',23,1);
INSERT instructor VALUES (60,'Michelle','Bellman',35,1);
INSERT instructor VALUES (70,'George','Hunt',2,0);
INSERT instructor VALUES (80,'Amy','Brock',7,0);
INSERT instructor VALUES (90,'Larry','Seger',11,1);
INSERT instructor VALUES (100,'Kathy','Miller',21,1);


-- create class table
create table class (
  id int not null primary key auto_increment,
  class_nbr int,
  class_name varchar(30),
  instructor_id int,
  foreign key (instructor_id)
  	references instructor(id)
);

-- -- insert classes
-- insert class (class_name, class_nbr) values ('English', 101);
-- insert class (class_name, class_nbr) values ('English', 102);
-- insert class (class_name, class_nbr) values ('English', 103);
-- insert class (class_name, class_nbr) values ('English', 201);
-- insert class (class_name, class_nbr) values ('English', 202);
-- insert class (class_name, class_nbr) values ('English', 203);
-- insert class (class_name, class_nbr) values ('English', 301);
-- insert class (class_name, class_nbr) values ('English', 302);
-- insert class (class_name, class_nbr) values ('English', 303);
-- insert class (class_name, class_nbr) values ('Math', 201);
-- insert class (class_name, class_nbr) values ('Math', 202);
-- insert class (class_name, class_nbr) values ('Math', 203);
-- insert class (class_name, class_nbr) values ('Math', 204);
-- insert class (class_name, class_nbr) values ('Math', 301);
-- insert class (class_name, class_nbr) values ('Math', 302);
-- insert class (class_name, class_nbr) values ('Math', 303);
-- insert class (class_name, class_nbr) values ('Math', 304);
-- insert class (class_name, class_nbr) values ('History', 101);
-- insert class (class_name, class_nbr) values ('History', 201);
-- insert class (class_name, class_nbr) values ('History', 301);
-- insert class (class_name, class_nbr) values ('Computer Science', 311);
-- insert class (class_name, class_nbr) values ('Computer Science', 312);
-- insert class (class_name, class_nbr) values ('Computer Science', 313);
-- insert class (class_name, class_nbr) values ('Computer Science', 441);
-- insert class (class_name, class_nbr) values ('Computer Science', 442);
-- insert class (class_name, class_nbr) values ('Computer Science', 443);
-- insert class (class_name, class_nbr) values ('Psychology', 101);
-- insert class (class_name, class_nbr) values ('Psychology', 102);
-- insert class (class_name, class_nbr) values ('Psychology', 231);
-- insert class (class_name, class_nbr) values ('Psychology', 232);
-- insert class (class_name, class_nbr) values ('Education', 221);
-- insert class (class_name, class_nbr) values ('Education', 222);
-- insert class (class_name, class_nbr) values ('Education', 223);
-- insert class (class_name, class_nbr) values ('Education', 351);
-- insert class (class_name, class_nbr) values ('Education', 352);
-- insert class (class_name, class_nbr) values ('Education', 353);

-- updated class data
-- English
INSERT class (subject,section,instructor_id) VALUES('English',101,10);
INSERT class (subject,section,instructor_id) VALUES('English',102,NULL);
INSERT class (subject,section,instructor_id) VALUES('English',103,NULL);
INSERT class (subject,section,instructor_id) VALUES('English',201,10);
INSERT class (subject,section,instructor_id) VALUES('English',202,NULL);
INSERT class (subject,section,instructor_id) VALUES('English',203,NULL);
INSERT class (subject,section,instructor_id) VALUES('English',301,10);
INSERT class (subject,section,instructor_id) VALUES('English',302,NULL);
INSERT class (subject,section,instructor_id) VALUES('English',303,NULL);
-- Math
INSERT class (subject,section,instructor_id) VALUES('Math',201,50);
INSERT class (subject,section,instructor_id) VALUES('Math',202,NULL);
INSERT class (subject,section,instructor_id) VALUES('Math',203,NULL);
INSERT class (subject,section,instructor_id) VALUES('Math',204,NULL);
INSERT class (subject,section,instructor_id) VALUES('Math',401,50);
INSERT class (subject,section,instructor_id) VALUES('Math',402,NULL);
INSERT class (subject,section,instructor_id) VALUES('Math',403,NULL);
INSERT class (subject,section,instructor_id) VALUES('Math',404,NULL);
-- History
INSERT class (subject,section,instructor_id) VALUES('History',101,80);
INSERT class (subject,section,instructor_id) VALUES('History',201,80);
INSERT class (subject,section,instructor_id) VALUES('History',301,80);
-- Computer Science
INSERT class (subject,section,instructor_id) VALUES('Computer Science',311,40);
INSERT class (subject,section,instructor_id) VALUES('Computer Science',312,40);
INSERT class (subject,section,instructor_id) VALUES('Computer Science',313,40);
INSERT class (subject,section,instructor_id) VALUES('Computer Science',441,40);
INSERT class (subject,section,instructor_id) VALUES('Computer Science',442,40);
INSERT class (subject,section,instructor_id) VALUES('Computer Science',443,40);
-- Psychology
INSERT class (subject,section,instructor_id) VALUES('Psychology',101,20);
INSERT class (subject,section,instructor_id) VALUES('Psychology',102,20);
INSERT class (subject,section,instructor_id) VALUES('Psychology',231,20);
INSERT class (subject,section,instructor_id) VALUES('Psychology',232,20);
-- Education
INSERT class (subject,section,instructor_id) VALUES('Education',221,60);
INSERT class (subject,section,instructor_id) VALUES('Education',222,60);
INSERT class (subject,section,instructor_id) VALUES('Education',223,60);
INSERT class (subject,section,instructor_id) VALUES('Education',351,70);
INSERT class (subject,section,instructor_id) VALUES('Education',352,70);
INSERT class (subject,section,instructor_id) VALUES('Education',353,70);



-- create major_class_relationship table
create table major_class_relationship (
  id int not null primary key auto_increment,
  major_id int not null,
  foreign key (major_id) 
  	references major(id),
  class_id int not null,
  foreign key (class_id)
    references class(id) 
);


-- major_class_relationship sample data
INSERT major_class_relationship (major_id, class_id) VALUES(1,1); -- Gen bus | Eng 101
INSERT major_class_relationship (major_id, class_id) VALUES(1,2); -- Gen bus | Eng 101
INSERT major_class_relationship (major_id, class_id) VALUES(1,3); -- Gen bus | Eng 101
INSERT major_class_relationship (major_id, class_id) VALUES(1,10); -- Gen bus | Mat 201
INSERT major_class_relationship (major_id, class_id) VALUES(1,11); -- Gen bus | Mat 202
INSERT major_class_relationship (major_id, class_id) VALUES(1,12); -- Gen bus | Mat 203
INSERT major_class_relationship (major_id, class_id) VALUES(1,18); -- Gen bus | His 101


-- create student_class_relationship table
create table student_class_relationship (
  id int not null primary key auto_increment,
  student_id int not null,
  foreign key (student_id) 
  	references student(id),
  class_id int not null,
  foreign key (class_id)
    references class(id) 
);


-- student_class_relationship sample data
INSERT student_class_relationship (student_id, class_id) VALUES(100,1); -- Eric | Eng 101
INSERT student_class_relationship (student_id, class_id) VALUES(200,2); -- Jason | Eng 101
INSERT student_class_relationship (student_id, class_id) VALUES(130,3); -- Howard | Eng 101
INSERT student_class_relationship (student_id, class_id) VALUES(140,10); -- Charles | Mat 201
INSERT student_class_relationship (student_id, class_id) VALUES(150,11); -- James | Mat 202
INSERT student_class_relationship (student_id, class_id) VALUES(160,12); -- Doug | Mat 203
INSERT student_class_relationship (student_id, class_id) VALUES(170,18); -- Kevin | His 101



-- changes to 'student' table
ALTER TABLE student ADD gpa decimal(5.1);
ALTER TABLE student ADD sat int;
ALTER TABLE student ADD major_id int;
ALTER TABLE student add foreign key (major_id) references major(id);
ALTER TABLE student drop year_of_experience;
ALTER TABLE student drop start_date;

-- changes to 'assignment' table
ALTER TABLE assignment ADD class_id int;
ALTER TABLE assignment ADD foreign key (class_id) references class(id);

-- assignment sample data
insert assignment (id, student_id, assignment_nbr, class_id) values (1, 200, 3, 5);
insert assignment (id, student_id, assignment_nbr, class_id) values (2, 120, 2, 23);
insert assignment (id, student_id, assignment_nbr, class_id) values (3, 130, 1, 32);
insert assignment (id, student_id, assignment_nbr, class_id) values (4, 140, 4, 12);
insert assignment (id, student_id, assignment_nbr, class_id) values (5, 150, 3, 27);
insert assignment (id, student_id, assignment_nbr, class_id) values (6, 160, 5, 36);
insert assignment (id, student_id, assignment_nbr, class_id) values (7, 170, 2, 19);
insert assignment (id, student_id, assignment_nbr, class_id) values (8, 180, 4, 2);




-- select & explain statements 
-- major table
mysql> explain major;
+-----------+-------------+------+-----+---------+----------------+
| Field     | Type        | Null | Key | Default | Extra          |
+-----------+-------------+------+-----+---------+----------------+
| id        | int(11)     | NO   | PRI | NULL    | auto_increment |
| name      | varchar(30) | YES  |     | NULL    |                |
| sat_score | int(11)     | YES  |     | NULL    |                |
+-----------+-------------+------+-----+---------+----------------+
3 rows in set (0.00 sec)

mysql> select * from major;
+----+------------------+-----------+
| id | name             | sat_score |
+----+------------------+-----------+
|  1 | General Business |       800 |
|  2 | Accounting       |      1000 |
|  3 | Finance          |      1100 |
|  4 | Math             |      1300 |
|  5 | Engineering      |      1350 |
|  6 | Education        |       900 |
+----+------------------+-----------+
6 rows in set (0.00 sec)



-- instructor table
mysql> explain instructor;
+------------+-------------+------+-----+---------+----------------+
| Field      | Type        | Null | Key | Default | Extra          |
+------------+-------------+------+-----+---------+----------------+
| id         | int(11)     | NO   | PRI | NULL    | auto_increment |
| first_name | varchar(30) | NO   |     | NULL    |                |
| last_name  | varchar(30) | NO   |     | NULL    |                |
| yrs_exp    | int(11)     | NO   |     | NULL    |                |
| tenured    | tinyint(1)  | NO   |     | NULL    |                |
| major_id   | int(11)     | NO   | MUL | NULL    |                |
+------------+-------------+------+-----+---------+----------------+
6 rows in set (0.07 sec)

mysql> select * from instructor;
Empty set (0.00 sec)

-- class table
mysql> explain class;
+---------------+-------------+------+-----+---------+----------------+
| Field         | Type        | Null | Key | Default | Extra          |
+---------------+-------------+------+-----+---------+----------------+
| id            | int(11)     | NO   | PRI | NULL    | auto_increment |
| class_nbr     | int(11)     | YES  |     | NULL    |                |
| class_name    | varchar(30) | YES  |     | NULL    |                |
| instructor_id | int(11)     | YES  | MUL | NULL    |                |
+---------------+-------------+------+-----+---------+----------------+
4 rows in set (0.00 sec)

mysql> select * from class;
+----+-----------+------------------+---------------+
| id | class_nbr | class_name       | instructor_id |
+----+-----------+------------------+---------------+
|  1 |       101 | English          |            10 |
|  2 |       102 | English          |          NULL |
|  3 |       103 | English          |          NULL |
|  4 |       201 | English          |            10 |
|  5 |       202 | English          |          NULL |
|  6 |       203 | English          |          NULL |
|  7 |       301 | English          |            10 |
|  8 |       302 | English          |          NULL |
|  9 |       303 | English          |          NULL |
| 10 |       201 | Math             |            50 |
| 11 |       202 | Math             |          NULL |
| 12 |       203 | Math             |          NULL |
| 13 |       204 | Math             |          NULL |
| 14 |       401 | Math             |            50 |
| 15 |       402 | Math             |          NULL |
| 16 |       403 | Math             |          NULL |
| 17 |       404 | Math             |          NULL |
| 18 |       101 | History          |            80 |
| 19 |       201 | History          |            80 |
| 20 |       301 | History          |            80 |
| 21 |       311 | Computer Science |          NULL |
| 22 |       312 | Computer Science |          NULL |
| 23 |       313 | Computer Science |          NULL |
| 24 |       441 | Computer Science |          NULL |
| 25 |       442 | Computer Science |          NULL |
| 26 |       443 | Computer Science |          NULL |
| 27 |       101 | Psychology       |            20 |
| 28 |       102 | Psychology       |            20 |
| 29 |       231 | Psychology       |            20 |
| 30 |       232 | Psychology       |            20 |
| 31 |       221 | Education        |            60 |
| 32 |       222 | Education        |            60 |
| 33 |       223 | Education        |            60 |
| 34 |       351 | Education        |            70 |
| 35 |       352 | Education        |            70 |
| 36 |       353 | Education        |            70 |
+----+-----------+------------------+---------------+
36 rows in set (0.00 sec)



-- major_class_relationship table
mysql> explain major_class_relationship;
+----------+---------+------+-----+---------+----------------+
| Field    | Type    | Null | Key | Default | Extra          |
+----------+---------+------+-----+---------+----------------+
| id       | int(11) | NO   | PRI | NULL    | auto_increment |
| major_id | int(11) | NO   | MUL | NULL    |                |
| class_id | int(11) | NO   | MUL | NULL    |                |
+----------+---------+------+-----+---------+----------------+
3 rows in set (0.00 sec)


mysql> select * from major_class_relationship;
+----+----------+----------+
| id | major_id | class_id |
+----+----------+----------+
|  1 |        1 |        1 |
|  2 |        1 |        2 |
|  3 |        1 |        3 |
|  4 |        1 |       10 |
|  5 |        1 |       11 |
|  6 |        1 |       12 |
|  7 |        1 |       18 |
+----+----------+----------+
7 rows in set (0.00 sec)



-- student_class_relationship table
mysql> explain student_class_relationship;
+------------+---------+------+-----+---------+----------------+
| Field      | Type    | Null | Key | Default | Extra          |
+------------+---------+------+-----+---------+----------------+
| id         | int(11) | NO   | PRI | NULL    | auto_increment |
| student_id | int(11) | NO   | MUL | NULL    |                |
| class_id   | int(11) | NO   | MUL | NULL    |                |
+------------+---------+------+-----+---------+----------------+
3 rows in set (0.03 sec)


mysql> select * from student_class_relationship;
+----+------------+----------+
| id | student_id | class_id |
+----+------------+----------+
|  1 |        100 |        1 |
|  2 |        200 |        2 |
|  3 |        130 |        3 |
|  4 |        140 |       10 |
|  5 |        150 |       11 |
|  6 |        160 |       12 |
|  7 |        170 |       18 |
+----+------------+----------+
7 rows in set (0.00 sec)


-- student table
mysql> explain student;
+------------+--------------+------+-----+---------+-------+
| Field      | Type         | Null | Key | Default | Extra |
+------------+--------------+------+-----+---------+-------+
| id         | int(11)      | NO   | PRI | NULL    |       |
| first_name | varchar(30)  | NO   |     | NULL    |       |
| last_name  | varchar(30)  | NO   |     | NULL    |       |
| sat        | int(11)      | YES  |     | NULL    |       |
| major_id   | int(11)      | YES  | MUL | NULL    |       |
| gpa        | decimal(5,1) | NO   |     | NULL    |       |
+------------+--------------+------+-----+---------+-------+
6 rows in set (0.00 sec)

mysql> select * from student;
+-----+------------+-----------+------+----------+-----+
| id  | first_name | last_name | sat  | major_id | gpa |
+-----+------------+-----------+------+----------+-----+
| 100 | Eric       | Ephram    | 1050 |        2 | 2.9 |
| 110 | Greg       | Gould     | 1270 |        1 | 3.9 |
| 120 | Adam       | Ant       |  780 |        3 | 3.1 |
| 130 | Howard     | Hess      |  940 |        4 | 2.5 |
| 140 | Charles    | Caldwell  |  470 |        3 | 3.3 |
| 150 | James      | Joyce     |  700 |        5 | 3.7 |
| 160 | Doug       | Dumas     | 1390 |        5 | 2.7 |
| 170 | Kevin      | Kraft     | 1140 |        2 | 1.7 |
| 180 | Frank      | Fountain  |  860 |        6 | 2.9 |
| 190 | Brian      | Biggs     |  630 |        6 | 4.0 |
| 200 | Jason      | Bourne    | 1020 |        5 | 3.0 |
+-----+------------+-----------+------+----------+-----+
11 rows in set (0.00 sec)



-- assignment table
mysql> explain assignment;
+----------------+---------+------+-----+---------+-------+
| Field          | Type    | Null | Key | Default | Extra |
+----------------+---------+------+-----+---------+-------+
| id             | int(11) | NO   | PRI | NULL    |       |
| student_id     | int(11) | NO   | MUL | NULL    |       |
| assignment_nbr | int(11) | NO   |     | NULL    |       |
| grade_id       | int(11) | YES  |     | NULL    |       |
| class_id       | int(11) | YES  | MUL | NULL    |       |
+----------------+---------+------+-----+---------+-------+
5 rows in set (0.00 sec)

mysql> select * from assignment;
+----+------------+----------------+----------+----------+
| id | student_id | assignment_nbr | grade_id | class_id |
+----+------------+----------------+----------+----------+
|  1 |        200 |              3 |     NULL |        5 |
|  2 |        120 |              2 |     NULL |       23 |
|  3 |        130 |              1 |     NULL |       32 |
|  4 |        140 |              4 |     NULL |       12 |
|  5 |        150 |              3 |     NULL |       27 |
|  6 |        160 |              5 |     NULL |       36 |
|  7 |        170 |              2 |     NULL |       19 |
|  8 |        180 |              4 |     NULL |        2 |
+----+------------+----------------+----------+----------+
8 rows in set (0.00 sec)