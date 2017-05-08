/* 

Nick Carrozza

SQL Script for Project 2 - RDBMS for Club Management 

CMPT220

*/ 


--Drop tables/views if they currently exist in the database to avoid duplicate creation when running script

DROP VIEW IF EXISTS display_all_members; 

DROP TABLE IF EXISTS advisesOn;

DROP TABLE IF EXISTS catersOn; 

DROP TABLE IF EXISTS membMeetings;

DROP TABLE IF EXISTS boardMeetings; 

DROP TABLE IF EXISTS clubMeetings;

DROP TABLE IF EXISTS officerMeetings; 

DROP TABLE IF EXISTS helpsOn; 

DROP TABLE IF EXISTS attends; 

DROP TABLE IF EXISTS members; 

DROP TABLE IF EXISTS advisors; 

DROP TABLE IF EXISTS caterers;

DROP TABLE IF EXISTS officers; 

DROP TABLE IF EXISTS events; 

DROP TABLE IF EXISTS meetings;

DROP TABLE IF EXISTS staff; 

DROP TABLE IF EXISTS students;



--Students table is the entity supertype of members and officers 

CREATE TABLE students (
	
	stu_id		int			not null unique,

	firstName	char(40)	not null,

	lastName	char(40) 	not null,

	status 		char(10)	not null, 

		PRIMARY KEY (stu_id)

); 


CREATE TABLE members ( 

	stu_id		int 		not null unique REFERENCES students(stu_id),

	dateAdded	date 		not null, 

		PRIMARY KEY (stu_id)

); 


CREATE TABLE officers (

	stu_id	 	int 	not null unique REFERENCES students(stu_id), 

	dateAdded 	date 	not null, 

		PRIMARY KEY (stu_id)

);


CREATE TABLE events (

	eid 		int 	not null unique, 

	eventdate	date 	not null, 

	descr 		char(40), 

	totalCost 	int,

		PRIMARY KEY (eid)

);

--staff table is the entity supertype of advisors and caterers 

CREATE TABLE staff ( 

	staff_id 	int 		not null unique, 

	firstName 	char(40) 	not null,

	lastName  	char(40)	not null, 

	yrsWorking 	int, 

	PRIMARY KEY(staff_id)


);


CREATE TABLE advisors (

	staff_id 	int 	not null unique REFERENCES staff(staff_id),

	PRIMARY KEY(staff_id)

);


CREATE TABLE caterers (

	staff_id	int 	not null unique REFERENCES staff(staff_id),  

	PRIMARY KEY(staff_id)

);

--meetings table is the entity supertype of clubMeetings and membMeetings

CREATE TABLE meetings ( 

	mid 		int 	not null unique, 

	meetdate 	date 	not null, 

	location 	char(40), 

		PRIMARY KEY (mid) 

);


CREATE TABLE clubMeetings ( 

	mid 	int 	not null unique REFERENCES meetings(mid),

		PRIMARY KEY (mid)

);


CREATE TABLE officerMeetings ( 

	mid 	int 	not null unique REFERENCES meetings(mid),

		PRIMARY KEY (mid)

);


--associative entity for the members and events table

CREATE TABLE attends ( 

	stu_id 	int 	not null REFERENCES members(stu_id), 

	eid 	int 	not null REFERENCES events(eid), 

		PRIMARY KEY (stu_id, eid)

); 


--"helpsOn" is the associative entity between officers and events table  

CREATE TABLE helpsOn ( 

	stu_id 	int  	not null REFERENCES officers(stu_id), 

	eid 	int 	not null REFERENCES events(eid), 

		PRIMARY KEY (stu_id, eid)

);

--"advisesOn" is the associative entity between advisors and events table 

CREATE TABLE advisesOn (

	eid 		int 	not null REFERENCES events(eid),

	staff_id 	int 	not null REFERENCES advisors(staff_id), 

		PRIMARY KEY (eid, staff_id)

); 

--associative entity between events and caterers 

CREATE TABLE catersOn (

	eid			int 	not null REFERENCES events(eid), 

	staff_id	int 	not null REFERENCES caterers(staff_id), 

	PRIMARY KEY(eid, staff_id)

); 

--associative entity between members and club meetings 

CREATE TABLE membMeetings (

	stu_id	int 	not null REFERENCES members(stu_id), 
	
	mid 	int 	not null REFERENCES meetings(mid),

	PRIMARY KEY(stu_id, mid)

); 


--associative entity between officers and officer meetings 

CREATE TABLE boardMeetings (

	stu_id	int 	not null REFERENCES officers(stu_id), 
	
	mid 	int 	not null REFERENCES officerMeetings(mid),

	PRIMARY KEY(stu_id, mid) 

);


/* TEST DATA */


--students table 
INSERT INTO students (stu_id, firstName, lastName, status)
VALUES (1, 'John', 'Smith', 'senior'); 

INSERT INTO students (stu_id, firstName, lastName, status)
VALUES (2, 'Bob', 'Smith', 'junior'); 

INSERT INTO students (stu_id, firstName, lastName, status)
VALUES (3, 'Bill', 'Cat', 'Sophomore'); 


--officers table 
INSERT INTO officers (stu_id, dateAdded)
VALUES (1, to_date('05/22/1996','MM/DD/YYYY')); 

INSERT INTO officers (stu_id, dateAdded)
VALUES (2, to_date('06/12/1997','MM/DD/YYYY')); 


--members table
INSERT INTO members (stu_id, dateAdded)
VALUES (3, to_date('03/11/1996','MM/DD/YYYY'));


/* VIEWS */

CREATE VIEW display_all_members AS

SELECT  students.firstname, students.lastname, students.status, members.dateAdded

FROM members 

INNER JOIN students ON students.stu_id = members.stu_id; 


/* QUERIES TO DISPLAY TABLES AND MODIFY DATA */ 

--Students Entity Supertype
SELECT * FROM students; 

TRUNCATE TABLE students CASCADE; 

SELECT * FROM officers;

SELECT * FROM members; 

SELECT * FROM boardMeetings; 

SELECT * FROM membMeetings;



--Meetings Entity Supertype 
SELECT * FROM meetings; 

TRUNCATE TABLE meetings CASCADE;

SELECT * FROM officerMeetings; 

SELECT * FROM ClubMeetings;


--Staff Entity Supertype 
SELECT * FROM staff; 

TRUNCATE TABLE staff CASCADE; 

SELECT * FROM caterers;

SELECT * FROM advisors; 


--Event Entity Supertype 
SELECT * FROM events; 

TRUNCATE TABLE events CASCADE; 

SELECT * FROM catersOn;

SELECT * FROM advisesOn; 

SELECT * FROM attends; 







