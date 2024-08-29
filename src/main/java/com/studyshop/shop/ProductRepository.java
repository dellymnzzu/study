package com.studyshop.shop;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    List<Product> findAllByOrderByIdDesc();  //제품을 최신순으로 정렬하여 조회
}
