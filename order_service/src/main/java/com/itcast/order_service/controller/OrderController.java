package com.itcast.order_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/product")
    @ResponseBody
    public String getProductMsg() {
        List<ServiceInstance> instances = discoveryClient.getInstances("produce_service");
        String host = "http://"+instances.get(0).getHost()+":"+instances.get(0).getPort();
        System.out.println("host = " + host);
        String result = restTemplate.getForObject(host+"/product/get", String.class);
        return result;
    }
}
