CREATE TABLE IF NOT EXISTS places (
    id bigint identity primary key,
    name varchar(255),
    address varchar(255),
    longitude varchar(255),
    latitude varchar(255) ,
);