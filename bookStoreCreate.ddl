create sequence Book_SEQ start with 1 increment by 50;
create table Book (language tinyint check (language between 0 and 8), number_of_pages integer, publication_date date, unit_price float(24), id bigint not null, title varchar(200), description varchar(1000), image_url varchar(255), isbn varchar(255), primary key (id));
