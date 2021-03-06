package com.multipolar.bootcamp.spring.appecommerce.controller;

import com.multipolar.bootcamp.spring.appecommerce.entity.Produk;
import com.multipolar.bootcamp.spring.appecommerce.repository.ProdukRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/produk")
public class ProdukApi {

    @Autowired
    private ProdukRepository repository;

    @GetMapping("/list")
    public Iterable<Produk> findAll(){
        return repository.findAll();
    }

    @PostMapping("/")
    public ResponseEntity<Produk> save(@RequestBody Produk produk){
        produk = repository.save(produk);
        return ResponseEntity.ok(produk);
    }

//    @GetMapping("/findByNama")
//    public List<Produk> findByNama(@RequestParam("nama") String nama){
//        return repository.findByNama(nama);
//    }
//
//    @PutMapping("/")
//    @Transactional
//    public ResponseEntity<Produk> UpdateNamaToko(@RequestBody Toko produk){
//        repository.updateNamaToko(produk.getNama(), produk.getId());
//        return ResponseEntity.ok(produk);
//    }

    @GetMapping("/{id}")
    public ResponseEntity<Produk> findById(@PathVariable("id") String id){
        Optional<Produk> produkOptional = repository.findById(id);
        if (produkOptional.isPresent())
            return ResponseEntity.ok(produkOptional.get());
        else
            return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Produk> deleteById(@PathVariable("id") String id){
        Optional<Produk> produkOptional = repository.findById(id);
        if(produkOptional.isPresent()){
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        } else return ResponseEntity.noContent().build();
    }
    
}
