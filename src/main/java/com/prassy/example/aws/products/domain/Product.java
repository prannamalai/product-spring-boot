package com.prassy.example.aws.products.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Product {

    protected Product() {

    }

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 255)
    private String title;

    @Column(length = 1000)
    private String description;

    @Column(nullable = false, unique = true)
    private String SKU;

    @ManyToOne
    private ProductCombo productCombo;

    public Product(Integer id, String title, String description, String SKU, ProductCombo productCombo) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.SKU = SKU;
        this.productCombo = productCombo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return id.equals(product.id) &&
                title.equals(product.title) &&
                description.equals(product.description) &&
                SKU.equals(product.SKU) &&
                productCombo.equals(product.productCombo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, SKU, productCombo);
    }
}
