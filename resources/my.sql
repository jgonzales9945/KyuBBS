DROP DATABASE NINEBBSDB;
CREATE DATABASE NINEBBSDB;

/******************************************************************
*org.mariadb.jdbc.Driver
*jdbc:mysql://localhost:3306, user, password
*<dependency>
*    <groupId>org.mariadb.jdbc</groupId>
*    <artifactId>mariadb-java-client</artifactId>
*    <version>1.1.7</version>
*</dependency>
******************************************************************/
/******************************************************************
*Tables
******************************************************************/
CREATE TABLE KB_BOARDS(
BOARD_ID INT NOT NULL AUTOINCREMENT, 
BOARD_NAME VARCHAR(35) NOT NULL,
BOARD_DESC VARCHAR(255) NOT NULL,
BOARD_CREATE_DATE TIMESTAMP NOT NULL,
CATEGORY_ID INT,/*categorizing boards by specific keywords*/
PRIMARY KEY(BOARD_ID)
);

CREATE TABLE KB_THREADS(
THREAD_ID INT NOT NULL AUTOINCREMENT, 
THREAD_TITLE VARCHAR(35) NOT NULL,
THREAD_SUBJECT VARCHAR(35) DEFAULT NULL,/*subject can be empty*/
THREAD_CONTENT TEXT NOT NULL,
THREAD_CREATE_DATE TIMESTAMP NOT NULL,
THREAD_MODIFIED_DATE TIMESTAMP,
THREAD_FLAG INT DEFAULT NULL,/*is this thread autosage? locked? pinned?*/
THREAD_IP_ADDRESS INT NOT NULL,/*encrypt?*/
USER_TYPE_ID INT,/*was this a mod, admin, or paid account*/
BOARD_ID INT NOT NULL,
PRIMARY KEY(THREAD_ID)
);

CREATE TABLE KB_POSTS(
POST_ID INT NOT NULL AUTOINCREMENT, 
POST_NAME VARCHAR(55) NOT NULL,
POST_CONTENT TEXT NOT NULL,
POST_CREATE_DATE TIMESTAMP NOT NULL,
POST_MODIFIED_DATE TIMESTAMP,
POST_FLAG INT,/*is this user publicly banned? is */
POST_IP_ADDRESS INT NOT NULL,
USER_TYPE_ID INT,/*was this a mod, admin, or paid account*/
THREAD_ID INT NOT NULL,/*this will help in counting the number of posts in a thread*/
PRIMARY KEY(POST_ID)
);

CREATE TABLE KB_USER_TYPE(
USER_TYPE_ID INT,
USER_ACCOUNT VARCHAR(25)
/*Anything else?*/
);
CREATE TABLE KB_CATEGORY(
CATEGORY_ID INT,
CATEGORY_NAME VARCHAR(30)
/*Anything else?*/
);

ALTER TABLE KB_POSTS
ADD FOREIGN KEY (USER_TYPE_ID) REFERENCES KB_USER_TYPE(USER_TYPE_ID);
ALTER TABLE KB_THREADS
ADD FOREIGN KEY (USER_TYPE_ID) REFERENCES KB_USER_TYPE(USER_TYPE_ID);
ALTER TABLE KB_POSTS
ADD FOREIGN KEY (THREAD_ID) REFERENCES KB_THREADS(THREAD_ID);
ALTER TABLE KB_THREADS
ADD FOREIGN KEY (BOARD_ID) REFERENCES KB_BOARDS(BOARD_ID);
ALTER TABLE KB_BOARDS
ADD FOREIGN KEY (CATEGORY_ID) REFERENCES KB_CATEGORY(CATEGORY_ID);

INSERT INTO KB_USER(USER_TYPE_ID, USER_ACCOUNT) VALUES(1,'NORMAL_USER');
INSERT INTO KB_USER(USER_TYPE_ID, USER_ACCOUNT) VALUES(2,'PREMIUM_USER');
INSERT INTO KB_USER(USER_TYPE_ID, USER_ACCOUNT) VALUES(3,'MODERATOR');
INSERT INTO KB_USER(USER_TYPE_ID, USER_ACCOUNT) VALUES(4,'ADMINISTRATOR');


/****************************************************************************
create users for the specific database tables
****************************************************************************/
DROP USER 'anonymous'@'localhost';
CREATE USER 'anonymous'@'localhost' IDENTIFIED BY 'pa$$00rRd';
GRANT SELECT,INSERT
ON NINEBBSDB.KB_THREADS, NINEBBSDB.KB_POSTS
TO 'anonymous'@'localhost';
GRANT SELECT/*for board access*/
ON NINEBBSDB.KB_BOARDS
TO 'anonymous'@'localhost';

DROP USER 'moderator'@'localhost';
CREATE USER 'moderator'@'localhost' IDENTIFIED BY 'P4$WWW00RRdd';
GRANT SELECT,INSERT,UPDATE,DELETE
ON NINEBBSDB.KB_THREADS, NINEBBSDB.KB_POSTS
TO 'moderator'@'localhost';
GRANT SELECT
ON NINEBBSDB.KB_BOARDS
TO 'moderator'@'localhost';

DROP USER 'administrator'@'localhost';
CREATE USER 'administrator'@'localhost' IDENTIFIED BY 'T3P4$W$W#W00#rRfd';
GRANT SELECT,INSERT,UPDATE,DELETE,CREATE,DROP
ON NINEBBSDB.*/*admin gets full access*/
TO 'administrator'@'localhost';