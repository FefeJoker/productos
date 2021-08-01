create sequence hibernate_sequence start 1 increment 1
create table detalle_provision (id int4 not null, cantidad int4, producto_id int4, provision_id int4, primary key (id))
create table material (id int4 not null, descripcion varchar(255), nombre varchar(255), precio float8, stock_actual int4, stock_minimo int4, unidad_id int4, primary key (id))
create table movimientos_stock (id int4 not null, cantidad_entrada int4, cantidad_salida int4, fecha timestamp, detalle_provision_id int4, producto_id int4, primary key (id))
create table producto (id int4 not null, descripcion_prod varchar(255), nombre varchar(255), precio float8, stock_actual int4, stock_minimo int4, unidad_id int4, primary key (id))
create table provision (id int4 not null, fecha_provision date, primary key (id))
create table unidad (id int4 not null, descripcion_unidad varchar(255), primary key (id))
alter table if exists detalle_provision add constraint FK55ucpuhjemgbgn6vatpk3c5m9 foreign key (producto_id) references producto
alter table if exists detalle_provision add constraint FKpmyll02g3vsxtm32a9k5l51ds foreign key (provision_id) references provision
alter table if exists material add constraint FK7iggudghx02vbnfwk0ksjtpdh foreign key (unidad_id) references unidad
alter table if exists movimientos_stock add constraint FKe3b4poend2bwbs8j46egt4xq0 foreign key (detalle_provision_id) references detalle_provision
alter table if exists movimientos_stock add constraint FKjkq1s3k957qr7dwxml0mg5p7y foreign key (producto_id) references producto
alter table if exists producto add constraint FK61kvndtovjcqlv5l3eneanlyf foreign key (unidad_id) references unidad
