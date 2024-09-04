package com.studyshop.shop;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;
    private final CartRepository cartRepository;

    // 로그인 페이지
    @GetMapping("/login")
    String User(Model model){
        userRepository.findAll();
        return "user.html";
    }
    
    //마이페이지

    @GetMapping("/user/mypage")
    String Mypage(Model model){

        return "Mypage.html";
    }
 
    // 장바구니 페이지
    @GetMapping("/cart")
    String Cart(Model model){
        cartRepository.findAll();
        return "cart.html";
    }

    // 메인 페이지
    @GetMapping("/Main")
    String Main(Model model){

        return "Main.html";
    }


    }





