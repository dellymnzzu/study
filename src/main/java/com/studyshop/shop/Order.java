package com.studyshop.shop;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.CreatedDate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity

public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "Order_ID")
    private Integer Id;  // 주문 고유 아이디

    @ManyToOne @JoinColumn(name = "Member_ID")
    private User user;  // 회원 고유 아이디

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP) @Column(name = "Order_DATE")
    Date date;  // 주문 날짜

    @ColumnDefault(value = "0")
    Character orderState;  // 처리상태

    String address; // 주소
    @OneToMany(mappedBy = "orders")
    private List<OrderDetail> orderDetails = new ArrayList<>();



}
