package com.codeup.meta.controllers;//package com.codeup.meta.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//public class HomeController {
//    @GetMapping("/")
//    @ResponseBody
//    public String main() {
//        return "This is the landing page!";
//    }

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//Joe's Code hehe

@Controller
public class HomeController {
    @GetMapping("/")
    @ResponseBody
    public String main(){
        return "This is the landing page!";
    }
}