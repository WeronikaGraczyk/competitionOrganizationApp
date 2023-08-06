package com.shootingSite.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private byte[] image;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
