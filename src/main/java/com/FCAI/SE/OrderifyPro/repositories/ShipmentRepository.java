package com.FCAI.SE.OrderifyPro.repositories;

import java.util.*;
import com.FCAI.SE.OrderifyPro.model.Shipment;

public class ShipmentRepository {
    public static List<Shipment> shipments = new ArrayList<Shipment>();

    public boolean addShipment(Shipment shipment) {
        return shipments.add(shipment);
    }

    public boolean addShipment(UUID orderId) {
        return shipments.add(new Shipment(orderId));
    }


}
