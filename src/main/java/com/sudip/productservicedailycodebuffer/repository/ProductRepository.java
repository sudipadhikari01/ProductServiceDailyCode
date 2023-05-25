package com.sudip.productservicedailycodebuffer.repository;

import com.sudip.productservicedailycodebuffer.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
