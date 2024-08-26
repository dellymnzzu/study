package com.studyshop.shop;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "Category_ID")
    private Integer Id;  // 카테고리 고유 아이디

    @OneToMany(mappedBy = "category")
    private List<Product> products = new ArrayList<>();

    @Column(name="Category_Name")
    String Name;  // 카테고리명
}
