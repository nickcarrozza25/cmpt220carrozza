/* 

Nick Carrozza

CMPT220 Project 2

SQL Script to create database 


*/ 


--drop tables if they exist to avoid unnecessary duplicate creation




DROP TABLE IF EXISTS members; 
DROP TABLE IF EXISTS students; 
DROP TABLE IF EXISTS officers; 




--Begin with student entity supertype with subtypes officers and members 

CREATE TABLE students (

    stuID       int      NOT NULL UNIQUE,
    
    firstname   char(60) NOT NULL,
    
    lastname    char(60) NOT NULL, 
    
    age         int      ,
    
    standing    char(60) ,
    
    PRIMARY KEY(stuID)

);



CREATE TABLE members (

	stuID   int  REFERENCES students(stuID),
    
    yrsatt  int ,
    
        
   PRIMARY KEY(stuID)
   

);



CREATE TABLE officers (

	stuID   int   REFERENCES students(stuID),
    
    title   char(60) NOT NULL,
    
    yrsserv int ,
    
    PRIMARY KEY(stuID)

);









