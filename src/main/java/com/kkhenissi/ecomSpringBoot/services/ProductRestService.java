package com.kkhenissi.ecomSpringBoot.services;

import com.kkhenissi.ecomSpringBoot.dao.ProductRepository;
import com.kkhenissi.ecomSpringBoot.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class ProductRestService {
    @Autowired
    private ProductRepository productRepository;


    // this method allow us  a list of Product in a json format
    @GetMapping(value = "/listProducts")
    public List<Product> listProducts() {
        return productRepository.findAll();

    }


    // this method allow us  to consult detail of one selected product
    @GetMapping(value = "/listProducts/{id}")
    public Product listProducts(@PathVariable(name = "id") Long id) {
        return productRepository.findById(id).get();

    }



    // this method allow us  to update  one selected product
    @PutMapping(value = "/listProducts/{id}")
    public Product updateProduct(@PathVariable(name = "id") Long id, @RequestBody Product p ) {
        p.setId(id);
        return productRepository.save(p);

    }

    // this method allow us  to save  one new product
    @PostMapping(value = "/listProducts")
    public Product addProduct(@RequestBody Product p ) {
        return productRepository.save(p);
    }

    // this method allow us  to delete  one selected product
    @DeleteMapping(value = "/listProducts/{id}")
    public void deleteProduct(@PathVariable(name = "id") Long id) {
        productRepository.deleteById(id);

    }


}
