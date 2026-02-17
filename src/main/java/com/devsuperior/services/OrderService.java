package com.devsuperior.services;

import com.devsuperior.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    public ShippingService shippingService;

    public double total(Order order){
        double netValue = order.getBasic() *  (1 - order.getDiscount()/100);
        return  netValue + shippingService.shipment(order);
    }
}
