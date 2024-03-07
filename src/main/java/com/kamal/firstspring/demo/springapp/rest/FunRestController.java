package com.kamal.firstspring.demo.springapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public  String Sayhello(){
        return "Hello Kamal";
    }

}
