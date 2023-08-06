package com.shootingSite.demo.service;

import com.shootingSite.demo.entity.Category;
import com.shootingSite.demo.entity.Product;
import com.shootingSite.demo.exception.ResourceNotFoundException;
import com.shootingSite.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final CategoryService categoryService;

    @Autowired
    public ProductService(ProductRepository productRepository, CategoryService categoryService) {
        this.productRepository = productRepository;
        this.categoryService = categoryService;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product saveProduct(Product product, Long categoryId) {
        Category category = categoryService.getCategoryById(categoryId);
        if(category==null){
            throw new ResourceNotFoundException("Category doesn't exist!");
        }
        product.setCategory(category);
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}

