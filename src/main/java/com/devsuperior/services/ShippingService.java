package com.devsuperior.services;

import com.devsuperior.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order){
        double basic = order.getBasic();
        double shipmentValue = 0;
        if(basic < 100.0){
            shipmentValue = 20.0;
        } else if (basic >= 100 && basic < 200.0) {
            shipmentValue = 12.0;
        }
        return shipmentValue;
    }
}
