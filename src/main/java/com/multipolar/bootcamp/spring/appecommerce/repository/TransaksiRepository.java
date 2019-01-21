package com.multipolar.bootcamp.spring.appecommerce.repository;

import com.multipolar.bootcamp.spring.appecommerce.entity.Transaksi;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface TransaksiRepository extends CrudRepository<Transaksi, String> {
//    @Modifying
//    @Query("update transaksi set total_harga = :totalHarga where id = :id")
//    int updatePembelianProduk(
//            @Param("id") String id,
//            @Param("totalHarga") String totalHarga);
}
