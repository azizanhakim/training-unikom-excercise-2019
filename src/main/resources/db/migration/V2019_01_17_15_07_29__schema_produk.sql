create table produk
(
  id   varchar(64)  not null primary key,
  nama varchar(255) not null,
  harga integer not null,
  qty integer not null,
  toko_id varchar(64) not null
) engine = InnoDb;

insert into produk(id, nama, harga, qty, toko_id)
values ('001', 'sapu', '50000', 50, '001'),
       ('002', 'sandal', '150000', 99, '002'),
       ('003', 'yeezy boost v2.0', '11999000', 200, '003'),
       ('004', 'nike running', '1099000', 9, '004');


