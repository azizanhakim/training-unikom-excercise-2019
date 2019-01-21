create table pelanggan
(
  id        varchar(64)  not null primary key,
  nama      varchar(100) not null,
  nomor_hp varchar(20)  not null unique,
  alamat    text
) engine = InnoDB;

insert into pelanggan(id, nama, nomor_hp, alamat)
values ('001', 'Muhammad Azizan Hakim', '081947572828', 'Bandung'),
       ('002', 'Muhammad Yusuf', '085628573328', 'Jakarta'),
       ('003', 'Hari sapto adi', '082233577628', 'Merauke'),
       ('004', 'Fajar cahyono', '081947575528', 'Lombok');
