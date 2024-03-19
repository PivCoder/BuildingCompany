create schema IF NOT EXISTS project;

DROP TABLE IF EXISTS project.assortment CASCADE;

create table IF NOT EXISTS project.assortment
(
    id bigint not null
            primary key,
    name varchar(100) not null,
    description text,
    images varchar(150),
    status varchar(10)

);

create index IF NOT EXISTS name_index
    on project.assortment (name);

DROP TABLE IF EXISTS project.application_user CASCADE;

create table IF NOT EXISTS project.application_user
(
    id bigint not null
            primary key,
    name varchar(50) not null,
    password varchar not null,
    application_user_type varchar(10)
);

create index IF NOT EXISTS name_index
    on project.application_user (name);

DROP TABLE IF EXISTS project.house_type CASCADE;

create table IF NOT EXISTS project.house_type
(
    id bigint not null
            primary key,
    name varchar(50) not null
);

DROP TABLE IF EXISTS project.material_type CASCADE;

create table IF NOT EXISTS project.material_type
(
    id bigint not null
            primary key,
    name varchar(50) not null
);

DROP TABLE IF EXISTS project.house CASCADE;

create table IF NOT EXISTS project.house
(
    id bigint not null
            primary key
            references project.assortment,
    house_type_id bigint
        references project.house_type not null,
    material_type_id bigint
        constraint material_type_id_fkey
            references project.material_type not null,
    area real not null,
    heated_area real,
    number_of_floors int not null,
    percentage_of_readiness varchar(11)
);

DROP TABLE IF EXISTS project.planning CASCADE;

create table IF NOT EXISTS project.planning
(
    id bigint not null
            primary key references project.assortment,
    length real not null,
    width real not null
);

DROP TABLE IF EXISTS project.favor_type CASCADE;

create table IF NOT EXISTS project.favor_type
(
    id bigint not null
            primary key,
    name varchar(150) not null
);

DROP TABLE IF EXISTS project.favor CASCADE;

create table IF NOT EXISTS project.favor
(
    id bigint not null
            primary key
        constraint favor_assortment_id_fkey
            references project.assortment,
    favor_type_id bigint
        references project.favor_type not null,
    area real,
    industrial bool,
    price real not null ,
    number_of_time_units int,
    type_of_time_limit varchar(10)
);

DROP TABLE IF EXISTS project.plot CASCADE;

create table IF NOT EXISTS project.plot
(
    id bigint not null
            primary key
        constraint plot_assortment_id_fkey
            references project.assortment,
    address varchar(150) not null,
    size real not null,
    electricity bool,
    water bool
);

create sequence IF NOT EXISTS project.application_user_seq start with 4 increment by 1;

create sequence IF NOT EXISTS project.assortment_seq start with 13 increment by 1;

create sequence IF NOT EXISTS project.house_type_seq start with 4 increment by 1;

create sequence IF NOT EXISTS project.material_type_seq start with 4 increment by 1;

create sequence IF NOT EXISTS project.favor_type_seq start with 4 increment by 1;

INSERT INTO project.application_user(id, name, password, application_user_type) VALUES (1, 'TestUser1', 'TestPassword1', 'ROLE_USER');
INSERT INTO project.application_user(id, name, password, application_user_type) VALUES (2, 'TestUser2', 'TestPassword2', 'ROLE_USER');
INSERT INTO project.application_user(id, name, password, application_user_type) VALUES (3, 'TestUser3', 'TestPassword3', 'ROLE_ADMIN');

INSERT INTO project.assortment(id, name, description, images, status)
VALUES
    (1, 'Дом 1', 'Описание дома...', 'someFolder', 'WAITING'),
    (2, 'Дом 2', 'Описание дома...', 'someFolder', 'WAITING'),
    (3, 'Дом 3', 'Описание дома...', 'someFolder', 'WAITING'),
    (4, 'Компактная', 'Описание планировки...', 'someFolder', 'WAITING'),
    (5, 'Просторная', 'Описание планировки...', 'someFolder', 'WAITING'),
    (6, 'Коробка', 'Описание планировки...', 'someFolder', 'WAITING'),
    (7, 'Фасадная отделка 1', 'Описание фасадной отделки...', 'someFolder', 'WAITING'),
    (8, 'Фасадная отделка 2', 'Описание фасадной отделки...', 'someFolder', 'WAITING'),
    (9, 'Фасадная отделка 3', 'Описание фасадной отделки...', 'someFolder', 'APPROVED'),
    (10, 'Участок 1', 'Описание участка...', 'someFolder', 'REJECTED'),
    (11, 'Участок 2', 'Описание участка...', 'someFolder', 'REJECTED'),
    (12, 'Участок 3', 'Описание участка...', 'someFolder', 'REJECTED');

INSERT INTO project.house_type(id, name)
VALUES
    (1, 'Дом с террасой'),
    (2, 'Таунхаус с террасой'),
    (3, 'Коттедж с террасой');

INSERT INTO project.material_type(id, name)
VALUES
    (1, 'Керамический кирпич'),
    (2, 'Брус'),
    (3, 'Доска'),
    (4, 'Пенобетон');

INSERT INTO project.house(id, house_type_id, material_type_id, area, heated_area, number_of_floors, percentage_of_readiness)
VALUES
    (1, 1, 1, 132.5, 100.2, 1, 'PERCENT_50'),
    (2, 2, 2, 127.25, 100.78, 2, 'PERCENT_0'),
    (3, 3, 3, 182.12, 100.53, 3, 'PERCENT_100');

INSERT INTO project.planning(id, length, width)
VALUES
    (4, 150.0, 250.25),
    (5, 120, 375.15),
    (6, 170, 185.2);

INSERT INTO project.favor_type(id, name)
VALUES
    (1,'Установка металлоконструкции'),
    (2,'Ремонт'),
    (3,'Вывоз строительного мусора');

INSERT INTO project.favor(id, favor_type_id, area, industrial, price, number_of_time_units, type_of_time_limit)
VALUES
    (7, 1, 100, true, 1250000, 3, 'YEAR'),
    (8, 2, 85, false, 15000, 2, 'DAY'),
    (9, 3, 10, true, 15000, 1, 'MONTH');

INSERT INTO project.plot(id, address, size, electricity, water)
VALUES
    (10, 'ул. Ленина, 12', 1000, true, true),
    (11, 'д. Садовая, 1', 2000, false, true),
    (12, 'ул. Озерная, 10', 1500, true, false);