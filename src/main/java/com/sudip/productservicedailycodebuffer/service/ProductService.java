package com.sudip.productservicedailycodebuffer.service;

import com.sudip.productservicedailycodebuffer.dtos.ProductDTO;
import com.sudip.productservicedailycodebuffer.dtos.ProductResponseDTO;

public interface ProductService {

    ProductDTO addProduct(ProductDTO productDTO);

    ProductResponseDTO getProductById(Long id);
}
