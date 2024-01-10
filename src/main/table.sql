CREATE table if not exists users(
    id SERIAL primary key ,
    first_name varchar (255),
    last_name varchar (255),
    username varchar (255),
    password varchar (255)
    );