package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("/get")
    @ResponseBody
    public String getProductMsg() {
        return "product111111";
    }
}
