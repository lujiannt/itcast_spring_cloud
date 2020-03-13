package com.itcast.product_service.service.impl;

import com.itcast.product_service.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public String getProductMsg() {
        return "product000 msg : No.1";
    }
}
