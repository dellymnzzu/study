package com.studyshop.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AdminController {
    private final AdminRepository adminRepository;

    @GetMapping("/Admin")
    String Admin(Model model){
        adminRepository.findAll();
        return "Admin.html";
    }

}
