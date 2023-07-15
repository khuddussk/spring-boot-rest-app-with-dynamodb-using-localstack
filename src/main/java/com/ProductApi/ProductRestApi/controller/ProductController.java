package com.ProductApi.ProductRestApi.controller;

import com.ProductApi.ProductRestApi.entity.Product;
import com.ProductApi.ProductRestApi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/product")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        return ResponseEntity.ok(productService.saveProduct(product));
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable String id){
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProductList(){
        return ResponseEntity.ok(productService.getProductList());
    }
    @PutMapping("/product/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable String id,@RequestBody Product product){
        return ResponseEntity.ok(productService.updateProduct(id,product));
    }
    @DeleteMapping("/product/{id}")
    public void deleteProductById(@PathVariable String id){
        productService.deleteProduct(id);
    }
}