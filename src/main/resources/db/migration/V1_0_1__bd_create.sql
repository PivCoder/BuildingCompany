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

DROP TABLE IF EXISTS project.type_of_assortment CASCADE;

create table IF NOT EXISTS project.type_of_assortment
(
    id numeric not null
        constraint type_of_assortment_pkey
            primary key,
    name varchar(150) not null
);

DROP TABLE IF EXISTS project.assortment CASCADE;

create table IF NOT EXISTS project.assortment
(
    id numeric not null
        constraint assortment_pkey
            primary key,
    name varchar(100) not null,
    type_id numeric
        constraint type_of_assortment_id_fkey
            references project.type_of_assortment not null,
    description text,
    images varchar(150)

);

create index IF NOT EXISTS name_index
    on project.assortment (name);

create sequence IF NOT EXISTS project.user_seq;

alter sequence project.user_seq owned by project.user.id;

create sequence IF NOT EXISTS project.type_of_assortment_seq;

alter sequence project.type_of_assortment_seq owned by project.type_of_assortment.id;

create sequence IF NOT EXISTS project.assortment_seq;

alter sequence project.assortment_seq owned by project.assortment.id;

INSERT INTO project.user(id, name, password) VALUES (1, 'TestUser1', 'TestPassword1');
INSERT INTO project.user(id, name, password) VALUES (2, 'TestUser2', 'TestPassword2');
INSERT INTO project.user(id, name, password) VALUES (3, 'TestUser3', 'TestPassword3');

INSERT INTO project.type_of_assortment(id, name) VALUES (1, 'TestTypeOfAssortment1');
INSERT INTO project.type_of_assortment(id, name) VALUES (2, 'TestTypeOfAssortment2');
INSERT INTO project.type_of_assortment(id, name) VALUES (3, 'TestTypeOfAssortment3');

INSERT INTO project.assortment(id, name, type_id, description, images)
VALUES (1, 'TestName1', 1, 'My test description 1', 'E:\somefolder1');
INSERT INTO project.assortment(id, name, type_id, description, images)
VALUES (2, 'TestName2', 2, 'My test description 1', 'E:\somefolder2');
INSERT INTO project.assortment(id, name, type_id, description, images)
VALUES (3, 'TestName3', 3, 'My test description 1', 'E:\somefolder3');