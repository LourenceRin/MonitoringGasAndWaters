--создаем новые таблицы в схеме.
---------------------------------------------------------------------------------------
create table expense
(
    id             VARCHAR(255) not null,
    spent_resource int8,
    type_resource  varchar(255),
    user_name        VARCHAR(255),
    primary key (id)
);
