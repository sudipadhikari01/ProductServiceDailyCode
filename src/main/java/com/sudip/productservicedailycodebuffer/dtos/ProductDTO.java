package com.sudip.productservicedailycodebuffer.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class ProductDTO {
    private String productName;
    private Long price;
    private int quantity;
}
