package com.studyshop.shop;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

    List<Category> findByName(String name);  //카테고리 이름으로 카테고리 리스트 조회
}
