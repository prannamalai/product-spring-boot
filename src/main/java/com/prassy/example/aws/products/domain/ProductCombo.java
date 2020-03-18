package com.prassy.example.aws.products.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class ProductCombo {

    protected ProductCombo() {

    }

    @Id
    private String SKU;

    @Column
    private String name;

    public ProductCombo(String SKU, String name) {
        this.SKU = SKU;
        this.name = name;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductCombo)) return false;
        ProductCombo that = (ProductCombo) o;
        return getSKU().equals(that.getSKU()) &&
                getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSKU(), getName());
    }
}
