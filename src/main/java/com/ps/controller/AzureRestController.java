package com.ps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureRestController {

    @GetMapping("/getEndPoint")
    public String getEndPoint() {
        return "Hello, Azure!!";
    }
}
