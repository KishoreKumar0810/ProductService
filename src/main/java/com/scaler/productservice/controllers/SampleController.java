package com.scaler.productservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Rest + Controller => HTTP API's + Controller
@RequestMapping("/random")
public class SampleController {
    // http://localhost:8080/random/hello
    @GetMapping("/hello/{numberOfTimes}")
    public String sayHello(@PathVariable("numberOfTimes") int numberOfTimes){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<numberOfTimes;i++){
            sb.append("Hello Everyone!");
        }
        return sb.toString();
    }

    // http://localhost:8080/random/bye
    @GetMapping("/bye")
    public String sayBye(){
        return "Bye Everyone!";
    }
}
