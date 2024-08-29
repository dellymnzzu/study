package com.studyshop.shop;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin,Integer> {
    Optional<Admin> findById(String id);  // 관리자 id로 특정 관리자 조회(NPE를 방지)
}
