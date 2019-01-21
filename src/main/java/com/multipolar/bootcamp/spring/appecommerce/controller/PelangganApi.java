package com.multipolar.bootcamp.spring.appecommerce.controller;

import com.multipolar.bootcamp.spring.appecommerce.entity.Pelanggan;
import com.multipolar.bootcamp.spring.appecommerce.entity.Toko;
import com.multipolar.bootcamp.spring.appecommerce.repository.PelangganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/pelanggan")
public class PelangganApi {
    
    @Autowired
    private PelangganRepository repository;

    @GetMapping("/list")
    public Iterable<Pelanggan> findAll(){
        return repository.findAll();
    }

    @PostMapping("/")
    public ResponseEntity<Pelanggan> save(@RequestBody Pelanggan pelanggan){
        pelanggan = repository.save(pelanggan);
        return ResponseEntity.ok(pelanggan);
    }

//    @GetMapping("/findByNama")
    //    public List<Pelanggan> findByNama(@RequestParam("nama") String nama){
//        return repository.findByNama(nama);
//    }
//
//    @PutMapping("/")
//    @Transactional
//    public ResponseEntity<Pelanggan> UpdateNamaToko(@RequestBody Pelanggan pelanggan){
//        repository.updateNamaPelanggan(pelanggan.getNama(), pelanggan.getId());
//        return ResponseEntity.ok(pelanggan);
//    }

    @GetMapping("/{id}")
    public ResponseEntity<Pelanggan> findById(@PathVariable("id") String id){
        Optional<Pelanggan> pelangganOptional = repository.findById(id);
        if (pelangganOptional.isPresent())
            return ResponseEntity.ok(pelangganOptional.get());
        else
            return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Toko> deleteById(@PathVariable("id") String id){
        Optional<Pelanggan> pelangganOptional = repository.findById(id);
        if(pelangganOptional.isPresent()){
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        } else return ResponseEntity.noContent().build();
    }
}
