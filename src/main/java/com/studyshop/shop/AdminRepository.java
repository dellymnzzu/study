package com.studyshop.shop;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Integer> {
    Admin findById(String id);  // 관리자 id로 특정 관리자 조회
}
