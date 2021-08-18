--создаем новые таблицы в схеме.
---------------------------------------------------------------------------------------
create table expense
(
    id             VARCHAR(255) not null,
    spent_resource int8,
    type_resource  varchar(255),
    user_id        VARCHAR(255),
    primary key (id)
);
