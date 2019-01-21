package com.multipolar.bootcamp.spring.appecommerce.repository;

import com.multipolar.bootcamp.spring.appecommerce.entity.Toko;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TokoRepository extends CrudRepository<Toko, String> {
//    @Modifying
//    @Query("update toko set nama = ?1 where id = ?2")
//    int updateNamaToko(String nama, String id);
//    List<Toko> findByNama(String nama);
}
