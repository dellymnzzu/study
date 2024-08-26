package com.studyshop.shop;

import jakarta.persistence.*;

@Entity
public class OrderDetail {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "OrderDetail_ID")
    private Integer Id;  // 주문상세 고유 아이디

    @ManyToOne @JoinColumn(name = "Order_ID")
    private Order orders;  // 주문 고유 아이디

    @ManyToOne @JoinColumn(name = "Product_ID")
    private Product product;  // 상품 고유 아이디

    @Column(nullable = false)
    Integer Quantity;  // 수량

    @Column(name = "productPrice", nullable = false)
    Integer price;  // 상품 가격
}
