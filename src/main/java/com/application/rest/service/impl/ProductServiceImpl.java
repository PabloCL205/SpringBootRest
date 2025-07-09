package com.application.rest.service.impl;

import com.application.rest.entities.Product;
import com.application.rest.persistence.IProductDao;
import com.application.rest.repository.ProductRepository;
import com.application.rest.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao produtcDAO;

    @Override
    public List<Product> findAll() {
        return produtcDAO.findAll();
    }

    @Override
    public Optional<Product> findById(long id) {
        return produtcDAO.findById(id);
    }

    @Override
    public List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice) {
        return produtcDAO.findByPriceInRange(minPrice, maxPrice);
    }

    @Override
    public void save(Product product) {
        produtcDAO.save(product);
    }

    @Override
    public void deleteById(long id) {
        produtcDAO.deleteById(id);
    }
}
