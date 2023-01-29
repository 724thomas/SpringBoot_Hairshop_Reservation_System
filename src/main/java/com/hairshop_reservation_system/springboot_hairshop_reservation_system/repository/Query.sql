create database hairshopreservationdb;

create table schedule_user (
                               email VARCHAR(30) not NULL,
                               password VARCHAR(30) NULL,
                               PRIMARY KEY(email)
)

create table reservation (
                             reservationid int auto_increment primary key,
                             name varchar(30) not null,
                             contact varchar(15) not null,
                             date varchar(30) not null,
                             time varchar(30) not null,
                             duration int not null,
                             memo varchar(255) not null
)


show tables;
select * from schedule_user;
select * from reservation;
drop table reservation;

-- TEST DATA --
INSERT INTO reservation
(name, contact, date, time, duration, memo)
VALUES
    ("최원준1", "010-4843-0882", "2023-01-29", "11:00", 60, "커트"),
    ("최원준2", "010-4843-0882", "2023-01-29", "13:00", 60, "커트"),
    ("최원준3", "010-4843-0882", "2023-01-29", "15:00", 60, "커트"),
    ("최원준4", "010-4843-0882", "2023-01-30", "12:00", 60, "커트"),
    ("최원준5", "010-4843-0882", "2023-01-03", "14:00", 60, "커트");


delete from reservation
where reservationid=1;
