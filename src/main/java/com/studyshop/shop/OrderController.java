package com.studyshop.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class OrderController {
    private final OrderRepository orderRepository;
    private final OrderDetailRepository orderDetailRepository;


    //상품 주문
    @PostMapping("/orders")
    String Order(Model model){

        return "order.html";
    }

    // 주문 내역 조회
    @GetMapping("/orders/{Order_ID}")
    String OrderDetail(Model model){

        return "orderDetail.html";
    }
}
