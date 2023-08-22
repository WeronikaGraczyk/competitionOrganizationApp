package com.shootingSite.demo.controller;

import com.shootingSite.demo.entity.ProductImage;
import com.shootingSite.demo.service.ProductImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/images")
public class ProductImageController {
    private final ProductImageService productImageService;

    @Autowired
    public ProductImageController(ProductImageService productImageService) {
        this.productImageService = productImageService;
    }

    //    @PostMapping
//    public ProductImage saveProductImage(@RequestParam("image") MultipartFile image,
//                                         @RequestParam("product_id") Long productId) throws IOException {
//        return productImageService.saveProductImage(image, productId);
//    }
    @PostMapping
    public List<ProductImage> saveProductImages(@RequestParam("image") List<MultipartFile> images,
                                                @RequestParam("product_id") Long productId) throws IOException {
        return productImageService.saveProductImages(images, productId);
    }
}
