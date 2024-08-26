package com.studyshop.shop;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "Cart")
public class cart {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "Cart_ID")
    private Integer Id;  // 장바구니 고유 아이디

    @ManyToOne @JoinColumn(name = "Member_ID")
    private User user;  // 회원 고유 아이디

    @ManyToOne @JoinColumn(name = "Product_ID")
    private Product product;  // 상품 고유 아이디

    @Column(nullable = false)
    Integer Quantity;  // 수량
}
