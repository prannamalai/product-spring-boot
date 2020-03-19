package com.prassy.example.aws.products.repo;

import com.prassy.example.aws.products.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
