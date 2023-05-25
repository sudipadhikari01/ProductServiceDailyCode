package com.sudip.productservicedailycodebuffer.dtos;

import lombok.Data;

@Data
public class ProductResponseDTO {
    private Long id;
    private String productName;
    private Long price;
    private int quantity;
}
