create table toko
(
  id     varchar(64)  not null primary key,
  nama   varchar(100) not null,
  pemilik varchar(100) not null,
  alamat text
) engine = InnoDB;

insert into toko(id, nama, pemilik, alamat) values
('001', 'Indomaret', 'Che Guevara', 'Kuba'),
('002', 'Alfamart', 'Adika Azaria', 'Padang'),
('003', 'Adidas', 'Tony Stark', 'USA'),
('004', 'Nike', 'Elsa Nabila', 'Medan');
