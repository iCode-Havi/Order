package com.havi.order.service;


import com.havi.order.entity.*;

import java.util.List;

public interface CommonMethodService {

    String updateOrder(Long id);
    String customerCertified(OrderWithoutTransport orderWithoutTransport);

    List<OrderWithoutTransport> getPendingOrdersByFarmer(Long id, Boolean pending);

    List<OrderWithoutTransport> getOrderByUser(Long id);

    List<OrderWithoutTransport> getOrderByCode(String orderCode);

    List<OrderWithoutTransport> getAvailableOffers();

    List<OrderWithoutTransport> getOrderByTransporterAndFarmerStatus(Long id);

    List<OrderWithoutTransport> getOrderByCustomer(String orderCode);




}
