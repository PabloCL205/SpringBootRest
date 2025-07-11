package com.application.rest.repository;

import com.application.rest.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    @Query("SELECT p FROM Product p Where p.price BETWEEN ?1 AND ?2")
    List<Product> findProductByInRange(BigDecimal minprice, BigDecimal maxprice);

    List<Product> findProductByPriceBetween(BigDecimal minprice, BigDecimal maxprice);
}
