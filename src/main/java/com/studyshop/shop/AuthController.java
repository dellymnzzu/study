package com.studyshop.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class AuthController {
    @GetMapping("/signup")
    String signup(){

        return "signup.html";
    }

    @PostMapping("/signup")
    String signupForm(){

        return "signup.html";
    }
}
