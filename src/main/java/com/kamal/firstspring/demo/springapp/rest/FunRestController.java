package com.kamal.firstspring.demo.springapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class FunRestController {
    @Value("${coach.name}")
    private String name;
    @GetMapping("/")

    public  String Sayhello(){
        return name;
    }
    @GetMapping("/workout")
    public String Sayworkout(){
        return  "workout";
    }

}
