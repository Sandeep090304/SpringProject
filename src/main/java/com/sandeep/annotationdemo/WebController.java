package com.sandeep.annotationdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    
    @GetMapping("/index")
    public String firstpage(){
        return "index";
    }
}
