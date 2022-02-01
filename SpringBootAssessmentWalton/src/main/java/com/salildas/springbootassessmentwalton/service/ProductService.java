package com.salildas.springbootassessmentwalton.service;

import com.salildas.springbootassessmentwalton.entity.Product;
import com.salildas.springbootassessmentwalton.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String ProductName) {
        return repository.findByProductName(ProductName);
    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public Product updateProduct(Product product) {
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setProductCode(product.getProductCode());
        existingProduct.setProductName(product.getProductName());
        existingProduct.setSellingPrice(product.getSellingPrice());
        return repository.save(existingProduct);
    }


}