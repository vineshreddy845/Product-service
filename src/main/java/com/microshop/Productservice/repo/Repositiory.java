package com.microshop.Productservice.repo;

import com.microshop.Productservice.productservice.ProductService;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repositiory extends MongoRepository<ProductService,Long> {
}
