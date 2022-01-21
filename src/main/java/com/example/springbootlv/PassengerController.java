package com.example.springbootlv;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PassengerController {

    @GetMapping("/home")
    public String homePage(){
        return "our employees welcomes to You";
    }
}
