package com.prassy.example.aws.products.service;

import com.prassy.example.aws.products.domain.ProductCombo;
import com.prassy.example.aws.products.repo.ProductComboRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductComboService {

    private ProductComboRepository productComboRepository;

    @Autowired
    public ProductComboService(ProductComboRepository productComboRepository) {
        this.productComboRepository = productComboRepository;
    }

    public ProductCombo createProductCombo(String SKU, String name) {
        return productComboRepository.findById(SKU)
                .orElse(productComboRepository.save(new ProductCombo(SKU, name)));
    }

    public Iterable<ProductCombo> listAllProductCombo() {
        return productComboRepository.findAll();
    }

    public long totalProductCombo() {
        return productComboRepository.count();
    }
}
