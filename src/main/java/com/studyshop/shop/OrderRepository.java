package com.studyshop.shop;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {
    List<Order> findByUserOrderByDateDesc(User user);  // 특정 User의 주문을 날짜순으로 찾아 조회
}
