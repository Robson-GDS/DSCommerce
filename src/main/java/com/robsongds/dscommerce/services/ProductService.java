package com.robsongds.dscommerce.services;

import com.robsongds.dscommerce.dto.ProductDTO;
import com.robsongds.dscommerce.entities.Product;
import com.robsongds.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Product product = repository.findById(id).get();
        ProductDTO dto = new ProductDTO(product);
        return dto;
    }
}
