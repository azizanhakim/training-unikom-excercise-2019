package com.multipolar.bootcamp.spring.appecommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transaksi")
public class Transaksi {

    @Id
    @GenericGenerator(name = "uuid_gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @ManyToOne
    @JoinColumn(name = "pelanggan_id", nullable = false)
    private Pelanggan pelanggan;

    @Column(name = "total_harga", nullable = false)
    private Integer totalHarga;

    @Column(name = "tanggal_transaksi")
    private Timestamp tanggalTransaksi;

    @OneToMany(mappedBy = "transaksi")
    public List<DetailTransaksi> details = new ArrayList<>();
}
