package kg.itacademy.demoJdbcSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/testAdmin")
    public String testAdmin(){
        return "hello";
    }
    @GetMapping("/testUser")
    public String testUser(){
        return "world";
    }
}
