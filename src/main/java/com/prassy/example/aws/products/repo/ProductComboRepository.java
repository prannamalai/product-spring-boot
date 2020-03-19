package com.prassy.example.aws.products.repo;

import com.prassy.example.aws.products.domain.ProductCombo;
import org.springframework.data.repository.CrudRepository;

public interface ProductComboRepository extends CrudRepository<ProductCombo, String> {
}
