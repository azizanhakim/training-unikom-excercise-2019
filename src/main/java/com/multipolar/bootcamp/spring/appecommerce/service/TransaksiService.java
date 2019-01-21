package com.multipolar.bootcamp.spring.appecommerce.service;

import com.multipolar.bootcamp.spring.appecommerce.entity.DetailTransaksi;
import com.multipolar.bootcamp.spring.appecommerce.entity.Produk;
import com.multipolar.bootcamp.spring.appecommerce.entity.Transaksi;
import com.multipolar.bootcamp.spring.appecommerce.repository.DetailTransaksiRepository;
import com.multipolar.bootcamp.spring.appecommerce.repository.ProdukRepository;
import com.multipolar.bootcamp.spring.appecommerce.repository.TransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class TransaksiService {

    @Autowired
    private TransaksiRepository transaksiRepository;

    @Autowired
    private DetailTransaksiRepository detailTransaksiRepository;

    @Autowired
    private ProdukRepository produkRepository;

    public Iterable<Transaksi> findAll(){
        return transaksiRepository.findAll();
    }

    public Optional<Transaksi> findById(String id){
        return this.transaksiRepository.findById(id);
    }

    @Transactional
    public Transaksi beliProduk(Transaksi transaksi){
        List<DetailTransaksi> detailTransaksiList = transaksi.getDetails();
        transaksi = transaksiRepository.save(transaksi);
        Integer total = 0;
        for (DetailTransaksi detailTransaksi : detailTransaksiList){
            detailTransaksi.setTransaksi(transaksi);
            // get Produk Data
            Optional<Produk> produkOptional = produkRepository.findById(detailTransaksi.getProduk().getId());
            // kurangi produk qty dari tabel produk
            produkOptional.get().setQty(produkOptional.get().getQty()-detailTransaksi.getQty());
            //harga detailTransaksi dari harga produk
            detailTransaksi.setHarga(produkOptional.get().getHarga());
            //set harga total
            total += detailTransaksi.getHarga()*detailTransaksi.getQty();
            detailTransaksiRepository.save(detailTransaksi);
        }

        //update total harga ke database
        transaksi.setTotalHarga(total);
        transaksiRepository.save(transaksi);

        Optional<Transaksi> transaksiOptional = transaksiRepository.findById(transaksi.getId());
        return transaksiOptional.get();
    }
}
