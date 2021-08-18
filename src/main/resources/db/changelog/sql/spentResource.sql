--создаем новые таблицы в схеме.
---------------------------------------------------------------------------------------
create table public.EXPENSE (
   id                BIGINT            not null,
   type_resource     varchar (500)   not null,
   spent_resource    BIGINT          not null
);
