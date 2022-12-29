package com.havi.order.service;
import com.havi.order.entity.OrderWithoutTransport;
import com.havi.order.entity.PreviousCustomer;
import com.havi.order.repository.OrderWithoutTransportRepository;
import com.havi.order.repository.PreviousCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class CommonMethodServiceImpl implements CommonMethodService{

    @Autowired
    private OrderWithoutTransportRepository orderWithoutTransportRepository;

    @Autowired
    private PreviousCustomerRepository previousCustomerRepository;



    @Override
    public List <OrderWithoutTransport> getOrderWithoutTransport(){
      List <OrderWithoutTransport> orderWithoutTransports = orderWithoutTransportRepository.findAll();
    }

}
