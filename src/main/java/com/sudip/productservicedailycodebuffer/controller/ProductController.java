package com.sudip.productservicedailycodebuffer.controller;

import com.sudip.productservicedailycodebuffer.dtos.ProductDTO;
import com.sudip.productservicedailycodebuffer.dtos.ProductResponseDTO;
import com.sudip.productservicedailycodebuffer.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductDTO> addProducts(@RequestBody ProductDTO productDTO) {
        ProductDTO dto = productService.addProduct(productDTO);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable("id") Long id) {
        ProductResponseDTO responseDTO = productService.getProductById(id);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}
