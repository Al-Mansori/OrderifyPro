package com.FCAI.SE.OrderifyPro.services;


import java.util.UUID;

import org.apache.coyote.BadRequestException;

import com.FCAI.SE.OrderifyPro.model.Order;
import com.FCAI.SE.OrderifyPro.repositories.ShipmentRepository;

public class ShipmentService extends TransactionService{
    ShipmentRepository shipmentRepository = new ShipmentRepository();
    IOrderService orderService = new OrderServiceImp();

        public void ship (UUID orderId) throws BadRequestException {
            Order order = orderService.getOrderById(orderId).get();
            var shipmentFeePerUser = order.distributeShippingFee(130.5);
            
            if(canAllUsersPay(shipmentFeePerUser)) {
                makeAllUsersPay(shipmentFeePerUser);
                shipmentRepository.addShipment(order.getId());
                return;
            }

        throw new BadRequestException();

        }
}
