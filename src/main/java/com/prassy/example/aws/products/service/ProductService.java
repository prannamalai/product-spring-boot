package com.prassy.example.aws.products.service;

import com.prassy.example.aws.products.domain.Product;
import com.prassy.example.aws.products.domain.ProductCombo;
import com.prassy.example.aws.products.repo.ProductComboRepository;
import com.prassy.example.aws.products.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository productRepository;
    private ProductComboRepository productComboRepository;

    @Autowired
    public ProductService(ProductRepository productRepository, ProductComboRepository productComboRepository) {
        this.productRepository = productRepository;
        this.productComboRepository = productComboRepository;
    }

    public Product createProduct(int id, String title, String description, String SKU, String productComboSKU) {

        ProductCombo productCombo = productComboRepository.findById(productComboSKU)
                .orElseThrow(() -> new RuntimeException("Package Combo doesn't exist"));

        return new Product(id, title, description, SKU, productCombo);
    }
}
