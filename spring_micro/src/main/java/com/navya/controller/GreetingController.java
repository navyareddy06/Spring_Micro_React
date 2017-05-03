package com.navya.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Navya Reddy on 5/2/2017.
 */
@RestController
public class GreetingController {

    @RequestMapping("/ok")
    public String greeting(){
        return "<h1> Navya Reddy is running Docker <h1>";
    }
}


//code prblm em ledu haaa avunu aedo dependencies aedo problem once new project create chey K Thankyou k
