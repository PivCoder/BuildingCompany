create schema IF NOT EXISTS project;

DROP TABLE IF EXISTS project.user CASCADE;

create table IF NOT EXISTS project.user
(
    id numeric not null
        constraint user_pkey
            primary key,
    name varchar(50) not null,
    password varchar not null
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
            primary key,
    house_type_id numeric
        constraint house_type_id_fkey
            references project.house_type not null,
    material_type_id numeric
        constraint material_type_id_fkey
            references project.material_type not null,
    area real not null,
    heated_area real,
    number_of_floors int not null

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

DROP TABLE IF EXISTS project.type_of_time_limit CASCADE;

create table IF NOT EXISTS project.type_of_time_limit
(
    id numeric not null
        constraint type_of_time_limit_pkey
            primary key,
    name varchar(50) not null
);

DROP TABLE IF EXISTS project.favor CASCADE;

create table IF NOT EXISTS project.favor
(
    id numeric not null
        constraint favor_pkey
            primary key,
    favor_type_id numeric
        constraint favor_type_id_fkey
            references project.favor_type not null,
    area real,
    industrial bool,
    price real not null ,
    number_of_time_units int,
    type_of_time_limit_id numeric
        constraint type_of_time_limit_id_fkey
            references project.type_of_time_limit not null
);

create index IF NOT EXISTS name_index
    on project.user (name);

DROP TABLE IF EXISTS project.plot CASCADE;

create table IF NOT EXISTS project.plot
(
    id numeric not null
        constraint plot_pkey
            primary key,
    address varchar(150) not null,
    size real not null,
    electricity bool,
    water bool
);

DROP TABLE IF EXISTS project.assortment CASCADE;

DROP TYPE IF EXISTS proposal_type;

CREATE TYPE proposal_type AS ENUM ('HOUSE', 'FAVOR', 'PLOT');

create table IF NOT EXISTS project.assortment
(
    id numeric not null
        constraint assortment_pkey
        primary key,
    name varchar(100) not null,
    type proposal_type not null,
    assortment_item_id numeric
        constraint favor_id_fkey
            references project.favor
        constraint house_id_fkey
            references project.house
        constraint plot_id_fkey
            references project.plot,
    description text,
    images varchar(150)

);

create index IF NOT EXISTS name_index
    on project.assortment (name);

create sequence IF NOT EXISTS project.user_seq;

alter sequence project.user_seq owned by project.user.id;

create sequence IF NOT EXISTS project.house_type_seq;

alter sequence project.house_type_seq owned by project.house_type.id;

create sequence IF NOT EXISTS project.material_type_seq;

alter sequence project.material_type_seq owned by project.material_type.id;

create sequence IF NOT EXISTS project.house_seq;

alter sequence project.house_seq owned by project.house.id;

create sequence IF NOT EXISTS project.planning_seq;

alter sequence project.planning_seq owned by project.planning.id;

create sequence IF NOT EXISTS project.favor_type_seq;

alter sequence project.favor_type_seq owned by project.favor_type.id;

create sequence IF NOT EXISTS project.type_of_time_limit_seq;

alter sequence project.type_of_time_limit_seq owned by project.type_of_time_limit.id;

create sequence IF NOT EXISTS project.favor_seq;

alter sequence project.favor_seq owned by project.favor.id;

create sequence IF NOT EXISTS project.plot_seq;

alter sequence project.plot_seq owned by project.plot.id;

create sequence IF NOT EXISTS project.assortment_seq;

alter sequence project.assortment_seq owned by project.assortment.id;

INSERT INTO project.user(id, name, password) VALUES (1, 'TestUser1', 'TestPassword1');
INSERT INTO project.user(id, name, password) VALUES (2, 'TestUser2', 'TestPassword2');
INSERT INTO project.user(id, name, password) VALUES (3, 'TestUser3', 'TestPassword3');

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

INSERT INTO project.house(id, house_type_id, material_type_id, area, heated_area, number_of_floors)
VALUES
    (1, 1, 1, 132.5, 100.2, 1),
    (2, 2, 2, 127.25, 100.78, 2),
    (3, 3, 3, 182.12, 100.53, 3);

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

INSERT INTO project.type_of_time_limit(id, name)
VALUES
    (1,'день'),
    (2,'месяц'),
    (3,'год');

INSERT INTO project.favor(id, favor_type_id, area, industrial, price, number_of_time_units, type_of_time_limit_id)
VALUES
    (1, 1, 100, true, 1250000, 3, 1),
    (2, 2, 85, false, 15000, 2, 1),
    (3, 3, 10, true, 15000, 1, 1);

INSERT INTO project.plot(id, address, size, electricity, water)
VALUES
    (1, 'ул. Ленина, 12', 1000, true, true),
    (2, 'д. Садовая, 1', 2000, false, true),
    (3, 'ул. Озерная, 10', 1500, true, false);

INSERT INTO project.assortment(id, name, type, assortment_item_id, description, images)
VALUES
    (1, 'Фасадная отделка', 'FAVOR', 1, 'Описание фасадной отделки...', 'someFolder'),
    (2, 'Дом 1', 'HOUSE', 3, 'Описание дома...', 'someFolder'),
    (3, 'Участок 1', 'PLOT', 2, 'Описание участка...', 'someFolder');