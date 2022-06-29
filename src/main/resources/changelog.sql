--liquibase formatted sql logicalFilePath:database-changelog.sql

--changeset epolivtsev:1

CREATE TABLE IF NOT EXISTS logs (
    log_id bigserial not null,
    user_id bigint not null,
    request_result text not null,
    time timestamp with time zone default CURRENT_TIMESTAMP not null,
    primary key (log_id)
);

CREATE TABLE IF NOT EXISTS users (
   user_id bigserial not null,
   city text not null,
   primary key (user_id)
)

--rollback drop table logs;
--rollback drop table users;