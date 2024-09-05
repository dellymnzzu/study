package com.studyshop.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
@RequiredArgsConstructor
public class CartController {


    //장바구니 페이지
    @GetMapping("/cart")
    String Cart(Model model){

        return "cart.html";
    }

    // 장바구니 추가
    @PostMapping("/cart")
    String CartAdd(Model model){

        return "cart.html";
    }


    // 장바구니 특정 물건 삭제
    @DeleteMapping("/cart/{Product_ID}")
    String CartDelete(Model model){

        return "cart.html";
    }


    // 장바구니 수량 변경
    @PutMapping("/cart/{Product_ID}")
    String CartUpdate(Model model){

        return "cart.html";
    }


    //장바구니 주문
    @PostMapping("/cart/order")
    String CartOrder(Model model){

        return "cart.html";
    }
}
