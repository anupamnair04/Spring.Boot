package com.spring.SpringBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.SpringBoot.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{

}