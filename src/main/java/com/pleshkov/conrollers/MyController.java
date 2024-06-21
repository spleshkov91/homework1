package com.pleshkov.conrollers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api")
public class MyController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Hello and welcome! some text!!!!!!!!!!!";
    }
}
