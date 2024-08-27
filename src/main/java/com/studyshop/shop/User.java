package com.studyshop.shop;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Member")
public class User {
    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY) @Column(name="Member_ID")
    private Integer userId;  // 회원 고유 아이디

    @Column(unique = true, length = 20)
    String id;  // 회원 아이디

    @Column(nullable = false)
    String pw;  // 회원 비밀번호

    @Column(nullable = false, length = 20)
    String Name;  // 회원 이름

    @Column(nullable = true)
    String address;  // 회원 주소

    @OneToMany(mappedBy = "user")
    private List<Order> orders = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Cart> carts = new ArrayList<>();
}
