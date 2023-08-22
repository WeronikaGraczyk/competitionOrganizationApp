package com.shootingSite.demo.service;

import com.shootingSite.demo.entity.Product;
import com.shootingSite.demo.entity.ProductImage;
import com.shootingSite.demo.exception.ResourceNotFoundException;
import com.shootingSite.demo.repository.ProductImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductImageService {
    private final ProductImageRepository productImageRepository;
    private final ProductService productService;

    @Autowired
    public ProductImageService(ProductImageRepository productImageRepository, ProductService productService) {
        this.productImageRepository = productImageRepository;
        this.productService = productService;
    }

    @PostMapping
    public ProductImage saveProductImage(MultipartFile image, Long productId) throws IOException {

        Product product = productService.getProductById(productId);

        if (product == null) {
            throw new ResourceNotFoundException("Product doesn't exist!");
        }

        ProductImage productImage = ProductImage.builder()
                .image(image.getBytes())
                .product(product)
                .build();

        return productImageRepository.save(productImage);
    }

    public List<ProductImage> saveProductImages(List<MultipartFile> images, Long productId) throws IOException {
        Product product = productService.getProductById(productId);

        if (product == null) {
            throw new ResourceNotFoundException("Product doesn't exist!");
        }

        List<ProductImage> productImages = new ArrayList<>();

        for (MultipartFile image : images) {
            try {
                ProductImage productImage = ProductImage.builder()
                        .image(image.getBytes())
                        .product(product)
                        .build();
                productImages.add(productImage);
            } catch (IOException e) {
                throw new IOException();
            }
        }

        return productImageRepository.saveAll(productImages);

    }
}