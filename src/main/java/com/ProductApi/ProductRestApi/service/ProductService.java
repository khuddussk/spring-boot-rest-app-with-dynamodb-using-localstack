package com.ProductApi.ProductRestApi.service;

import com.ProductApi.ProductRestApi.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProductList();
    Product saveProduct(Product product);
    Product getProductById(String id);
    Product updateProduct(String id,Product product);
    void deleteProduct(String id);
}
