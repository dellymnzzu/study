package com.studyshop.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class OrderController {
    private final OrderRepository orderRepository;
    private final OrderDetailRepository orderDetailRepository;

    @GetMapping("/order")
    String Order(Model model){
        orderRepository.findAll();
        return "order.html";
    }
    @GetMapping("/orderDetail")
    String OrderDetail(Model model){

        return "orderDetail.html";
    }
}
