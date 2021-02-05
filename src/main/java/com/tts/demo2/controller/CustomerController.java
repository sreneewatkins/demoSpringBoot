package com.tts.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

    @GetMapping("/demoPage")
    public String loginForm(){
        return "springBootHTML/index";
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "SpringBootHTML/dataEntry";
    }

    @GetMapping("/dataEntry")
    public String dataEntry() {
        return "springBootHTML/dataEntry";
    }

    @GetMapping("/demo")
    public String demo() {
        return "This is the demo!";
    }

}//end CustomerController class

