CREATE USER DELIVERY IDENTIFIED BY test;

GRANT RESOURCE TO DELIVERY;
GRANT CONNECT TO DELIVERY;
GRANT CREATE VIEW TO DELIVERY;
GRANT CREATE SESSION TO DELIVERY;
GRANT UNLIMITED TABLESPACE TO DELIVERY;

create table DELIVERY.CLIENT
(
    TLC  CHAR(2)  not null,
    NAME CHAR(30) not null,
    constraint XPKQUALIFICATION
        primary key (TLC)
);

insert into DELIVERY.CLIENT(TLC, NAME) VALUES ('ES', 'Estevan')