package com.studyshop.shop;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity

public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "Product_ID")
    public Integer Id;  // 상품 고유 아이디

    @ManyToOne @JoinColumn(name = "Category_ID")
    private Category category;  // 카테고리 고유 아이디

    @Column(nullable = false)
    public String productName; // 상품 이름

    @Column(nullable = false)
    public Integer productPrice;  // 상품 가격

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false,name = "Product_DATE")
    public Date date;  // 공급일자

    public Integer productStock; // 재고

    @Column(columnDefinition = "TEXT")
    public String productDesc;  // 상품 정보

    @OneToMany(mappedBy = "product")
    private List<cart> carts = new ArrayList<>();

    @OneToMany(mappedBy = "product")
    private List<OrderDetail> orderDetails = new ArrayList<>();
}
