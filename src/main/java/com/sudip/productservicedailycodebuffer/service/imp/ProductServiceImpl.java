package com.sudip.productservicedailycodebuffer.service.imp;

import com.sudip.productservicedailycodebuffer.dtos.ProductDTO;
import com.sudip.productservicedailycodebuffer.dtos.ProductResponseDTO;
import com.sudip.productservicedailycodebuffer.entity.Product;
import com.sudip.productservicedailycodebuffer.exception.ProductNotFoundException;
import com.sudip.productservicedailycodebuffer.repository.ProductRepository;
import com.sudip.productservicedailycodebuffer.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    private Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Override
    public ProductDTO addProduct(ProductDTO productDTO) {
        logger.info("Adding Product...." + productDTO);
        Product map = modelMapper.map(productDTO, Product.class);
        Product product = productRepository.save(map);

        logger.info("Product Added....." + product);

        return modelMapper.map(product, ProductDTO.class);

    }

    @Override
    public ProductResponseDTO getProductById(Long id) {
        Product product = productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException("Product not found with given id: " + id));
        return modelMapper.map(product, ProductResponseDTO.class);
    }
}
