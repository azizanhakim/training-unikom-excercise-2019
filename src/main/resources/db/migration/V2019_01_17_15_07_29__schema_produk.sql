create table produk
(
  id   varchar(64)  not null primary key,
  nama varchar(255) not null,
  harga varchar(50) not null,
  toko_id varchar(64) not null
) engine = InnoDb;

insert into produk(id, nama, harga, toko_id)
values ('001', 'sapu', '50000', '001'),
       ('002', 'sandal', '150000', '002'),
       ('003', 'yeezy boost v2.0', '11999000', '003'),
       ('004', 'nike running', '1099000', '004');


