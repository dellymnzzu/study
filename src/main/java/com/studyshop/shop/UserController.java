package com.studyshop.shop;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;
    private final CartRepository cartRepository;

    // 로그인 페이지
    @GetMapping("/signin")
    String signin(Model model){
        return "user.html";
    }

    // 로그인 폼 전송
    @PostMapping("/signin")
    String signinForm(Model model){
        return "user.html";
    }


    //마이페이지
    @GetMapping("/mypage")
    String mypage(Model model){

        return "Mypage.html";
    }

    // 회원 정보 수정
    @PutMapping("/mypage")
    String mypageUpdate(Model model){

        return "Mypage.html";
    }

    // 회원 탈퇴
    @DeleteMapping("/mypage")
    String mypageDelete(Model model){

        return "Mypage.html";
    }



    // 메인 페이지
    @GetMapping("/")
    String Main(Model model){

        return "Main.html";
    }


    }





