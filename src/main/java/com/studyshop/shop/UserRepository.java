package com.studyshop.shop;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findById(String id);  // User 테이블의 id 필드로 특정 사용자 조회
}
