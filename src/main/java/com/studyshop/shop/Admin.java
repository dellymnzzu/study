package com.studyshop.shop;

import jakarta.persistence.*;


@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "Admin_ID")
    Integer Id;  // 관리자 고유 아이디

    @Column(unique = true, length = 20)
    String id;  // 관리자 아이디

    @Column(nullable = false)
    String pw;  // 관리자 비밀번호

    @Column(length = 20)
    String Name;  // 관리자 이름
}
