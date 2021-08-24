package com.example.monitoringgasandwater.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class AuthController {

    @GetMapping
    public String toSwagger(){
        return "redirect:/swagger-ui/";
    }
}
