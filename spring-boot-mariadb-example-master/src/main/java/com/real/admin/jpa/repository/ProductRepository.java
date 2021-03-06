package com.real.admin.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.real.admin.entity.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
