CREATE DATABASE microservice_students;

use microservice_students;

create table students(
    id int(11) NOT NULL AUTO_INCREMENT,
    name varchar(180) NOT NULL,
    lastname varchar(180) NOT NULL,
    email varchar(255) NOT NULL,
    created_on timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_by varchar(50) NOT NULL,
    updated_on timestamp,
    updated_by varchar(50),
    PRIMARY KEY (`id`),
    UNIQUE KEY `EMAIL_UQ` (`email`)
  ); 
  
  create table courses(
    id int(11) NOT NULL AUTO_INCREMENT,
    `name` varchar(180) NOT NULL,
    created_on timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_by varchar(50) NOT NULL,
    updated_on timestamp,
    updated_by varchar(50),
    PRIMARY KEY (`id`),
    UNIQUE KEY `NAME_UQ` (`name`)
  ); 



insert into students(student_name, lastname, email, created_by) values('Neo', 'Baez', 'neo@mylab.com', 'system');
insert into students(student_name, lastname, email, created_by) values('Adri', 'Fd', 'adri@mylab.com', 'system');

insert into courses(name, created_by) values('Sistemas Operativos', 'system');
insert into courses(name, created_by) values('Lenguajes Formales', 'system');
