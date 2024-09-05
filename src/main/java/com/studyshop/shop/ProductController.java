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
public class ProductController {
    private final ProductRepository productRepository;


    // 상품전체 페이지
    @GetMapping("/product")
    String Product(Model model){
        productRepository.findAll();
        return "product.html";
    }

    // 상품 카테고리 페이지
    @GetMapping("/product/{Category_ID}")
    String productCategory(Model model){

        return "product.html";
    }


    // 상품 디테일 페이지
    @GetMapping("/product/{Category_ID}/{Product_ID}")
    String productDetail(Model model){

        return "product.html";
    }

    // 상품 등록
    @PostMapping("/product/admin")
    String productAdd(Model model){

        return "product.html";
    }


    // 상품 수정
    @PutMapping("/product/admin/{Product_ID}")
    String productUpdate(Model model){

        return "product.html";
    }


    // 상품 삭제
    @DeleteMapping("/product/admin/{Product_ID}")
    String productDelete(Model model){

        return "product.html";
    }
}
