package com.havi.order.service;
import com.havi.order.entity.OrderWithoutTransport;
import com.havi.order.respose.*;
import com.havi.order.entity.PreviousCustomer;
import com.havi.order.repository.OrderWithoutTransportRepository;
import com.havi.order.repository.PreviousCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonMethodServiceImpl implements CommonMethodService{

    @Autowired
    private OrderWithoutTransportRepository orderWithoutTransportRepository;

    @Autowired
    private PreviousCustomerRepository previousCustomerRepository;


    @Override
    public List<OrderWithoutTransport> getPendingOrdersByFarmer(Long id, Boolean pending) {
        return null;
    }


    @Override
    public List<OrderWithoutTransport> getOrderByUser(Long id) {
        return null;
    }



    @Override
    public getOrderRes getOrderByCode(String orderCode) {
        Optional<OrderWithoutTransport> order = orderWithoutTransportRepository.findByOrderCode(orderCode);
        if(order.isPresent){
            getOrderRes.order = order;
            getOrderRes.massage = "success";
            return getOrderRes.getObj();
        }
        getOrderRes.order = null;
        getOrderRes.massage = "error code";
        return getOrderRes.getObj();
    }

    @Override
    public List<OrderWithoutTransport> getAvailableOffers() {
        return null;
    }

    @Override
    public List<OrderWithoutTransport> getOrderByTransporterAndFarmerStatus(Long id) {
        return null;
    }

    @Override
    public List<OrderWithoutTransport> getOrderByCustomer(String orderCode) {
        return null;
    }

    @Override
    public String customerCertified(OrderWithoutTransport orderWithoutTransport) {
        return null;
    }

    @Override
    public String updateOrder(Long id) {
        return null;
    }
}
