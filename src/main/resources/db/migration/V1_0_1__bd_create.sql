create schema IF NOT EXISTS project;

DROP TABLE IF EXISTS project.assortment CASCADE;

create table IF NOT EXISTS project.assortment
(
    id numeric not null
        constraint assortment_pkey
            primary key,
    name varchar(100) not null,
    description text,
    images varchar(150),
    status varchar(10)

);

create index IF NOT EXISTS name_index
    on project.assortment (name);

DROP TABLE IF EXISTS project.user CASCADE;

create table IF NOT EXISTS project.user
(
    id numeric not null
        constraint user_pkey
            primary key,
    name varchar(50) not null,
    password varchar not null,
    userType varchar(10)
);

create index IF NOT EXISTS name_index
    on project.user (name);

DROP TABLE IF EXISTS project.house_type CASCADE;

create table IF NOT EXISTS project.house_type
(
    id numeric not null
        constraint house_type_pkey
            primary key,
    name varchar(50) not null
);

DROP TABLE IF EXISTS project.material_type CASCADE;

create table IF NOT EXISTS project.material_type
(
    id numeric not null
        constraint material_type_pkey
            primary key,
    name varchar(50) not null
);

DROP TABLE IF EXISTS project.house CASCADE;

create table IF NOT EXISTS project.house
(
    id numeric not null
        constraint house_pkey
            primary key
        constraint house_assortment_id_fkey
            references project.assortment,
    house_type_id numeric
        constraint house_type_id_fkey
            references project.house_type(id) not null,
    material_type_id numeric
        constraint material_type_id_fkey
            references project.material_type(id) not null,
    area real not null,
    heated_area real,
    number_of_floors int not null,
    percentage_of_readiness varchar(11)
);

DROP TABLE IF EXISTS project.planning CASCADE;

create table IF NOT EXISTS project.planning
(
    id numeric not null
        constraint planning_pkey
            primary key,
    name varchar(50) not null,
    images varchar(150)
);

DROP TABLE IF EXISTS project.house_planning CASCADE;

create table IF NOT EXISTS project.house_planning
(
    house_id numeric not null references project.house(id),
    planning_id numeric not null references project.planning(id)
);

DROP TABLE IF EXISTS project.favor_type CASCADE;

create table IF NOT EXISTS project.favor_type
(
    id numeric not null
        constraint favor_type_pkey
            primary key,
    name varchar(150) not null
);

DROP TABLE IF EXISTS project.favor CASCADE;

create table IF NOT EXISTS project.favor
(
    id numeric not null
        constraint favor_pkey
            primary key
        constraint favor_assortment_id_fkey
            references project.assortment,
    favor_type_id numeric
        constraint favor_type_id_fkey
            references project.favor_type not null,
    area real,
    industrial bool,
    price real not null ,
    number_of_time_units int,
    type_of_time_limit varchar(10)
);

create index IF NOT EXISTS name_index
    on project.user (name);

DROP TABLE IF EXISTS project.plot CASCADE;

create table IF NOT EXISTS project.plot
(
    id numeric not null
        constraint plot_pkey
            primary key
        constraint plot_assortment_id_fkey
            references project.assortment,
    address varchar(150) not null,
    size real not null,
    electricity bool,
    water bool
);

create sequence IF NOT EXISTS project.user_seq;

alter sequence project.user_seq owned by project.user.id;

create sequence IF NOT EXISTS project.house_type_seq;

alter sequence project.house_type_seq owned by project.house_type.id;

create sequence IF NOT EXISTS project.material_type_seq;

alter sequence project.material_type_seq owned by project.material_type.id;

create sequence IF NOT EXISTS project.planning_seq;

alter sequence project.planning_seq owned by project.planning.id;

create sequence IF NOT EXISTS project.favor_type_seq;

alter sequence project.favor_type_seq owned by project.favor_type.id;

INSERT INTO project.user(id, name, password, userType) VALUES (1, 'TestUser1', 'TestPassword1', 'ROLE_USER');
INSERT INTO project.user(id, name, password, userType) VALUES (2, 'TestUser2', 'TestPassword2', 'ROLE_USER');
INSERT INTO project.user(id, name, password, userType) VALUES (3, 'TestUser3', 'TestPassword3', 'ROLE_ADMIN');

INSERT INTO project.assortment(id, name, description, images, status)
VALUES
    (1, 'Дом 1', 'Описание дома...', 'someFolder', 'WAITING'),
    (2, 'Дом 2', 'Описание дома...', 'someFolder', 'WAITING'),
    (3, 'Дом 3', 'Описание дома...', 'someFolder', 'WAITING'),
    (4, 'Фасадная отделка 1', 'Описание фасадной отделки...', 'someFolder', 'WAITING'),
    (5, 'Фасадная отделка 2', 'Описание фасадной отделки...', 'someFolder', 'WAITING'),
    (6, 'Фасадная отделка 3', 'Описание фасадной отделки...', 'someFolder', 'APPROVED'),
    (7, 'Участок 1', 'Описание участка...', 'someFolder', 'REJECTED'),
    (8, 'Участок 2', 'Описание участка...', 'someFolder', 'REJECTED'),
    (9, 'Участок 3', 'Описание участка...', 'someFolder', 'REJECTED');

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

INSERT INTO project.planning(id, name, images)
VALUES
    (1, 'Компактная', 'someFolder'),
    (2, 'Просторная', 'someFolder'),
    (3, 'Коробка', 'someFolder');

INSERT INTO project.house_planning(house_id, planning_id)
VALUES
    (1, 1),
    (2, 3),
    (1, 3),
    (3, 2),
    (3, 1);

INSERT INTO project.favor_type(id, name)
VALUES
    (1,'Установка металлоконструкции'),
    (2,'Ремонт'),
    (3,'Вывоз строительного мусора');

INSERT INTO project.favor(id, favor_type_id, area, industrial, price, number_of_time_units, type_of_time_limit)
VALUES
    (4, 1, 100, true, 1250000, 3, 'YEAR'),
    (5, 2, 85, false, 15000, 2, 'DAY'),
    (6, 3, 10, true, 15000, 1, 'MONTH');

INSERT INTO project.plot(id, address, size, electricity, water)
VALUES
    (7, 'ул. Ленина, 12', 1000, true, true),
    (8, 'д. Садовая, 1', 2000, false, true),
    (9, 'ул. Озерная, 10', 1500, true, false);