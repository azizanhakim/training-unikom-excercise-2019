create table transaksi
(
  id              varchar(64) not null primary key,
  pelanggan_id      varchar(64) not null,
  total_harga         varchar(50)     not null,
  tanggal_transaksi timestamp not null default now()
) engine = InnoDB;

create table detail_transaksi
(
  id              varchar(64) not null primary key,
  produk_id      varchar(64) not null,
  transaksi_id varchar(64) not null,
  harga         varchar(50)     not null,
  tanggal_transaksi timestamp not null default now()
) engine = InnoDB;

alter table produk
  add constraint fk_produk_toko foreign key (toko_id)
    references toko (id) on update cascade on delete restrict;

alter table transaksi
  add constraint fk_transaksi_pelanggan foreign key (pelanggan_id)
    references pelanggan (id) on update cascade on delete restrict;

alter table detail_transaksi
  add constraint fk_detailtransaksi_transaksi foreign key (transaksi_id)
    references transaksi (id) on update cascade on delete restrict;