package com.studyshop.shop;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findById(String id);  // User 테이블의 id 필드로 특정 사용자 조회 (NPE를 방지)
}
