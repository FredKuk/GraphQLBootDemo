create table seller
(
	id binary(16) not null,
	name TEXT not null,
	address TEXT null,
	constraint seller_pk
		primary key (id)
);