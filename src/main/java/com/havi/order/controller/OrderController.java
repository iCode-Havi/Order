package com.havi.order.controller;

import com.havi.order.entity.OrderWithoutTransport;
import com.havi.order.response.getOrderRes;
import com.havi.order.service.CommonMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/orderService")
public class OrderController {
//    @Autowired
    private CommonMethodService commonMethodService;


//get an order which has to give foods by farmer
@GetMapping("/ getPendingOrdersByFarmer/{id}")
private List<OrderWithoutTransport>  getPendingOrdersByFarmer(@PathVariable Long id, @PathVariable boolean pending){
    return commonMethodService. getPendingOrdersByFarmer(id, pending);
}

//get order by user
@GetMapping("/getOrderByUser/{id}")
private List<OrderWithoutTransport> getOrderByUser(@PathVariable Long id){
    return commonMethodService.getOrderByUser(id);
}


//get order by code
@GetMapping("/getOrderByCode/{orderCode}")
private getOrderRes getOrderByCode(@PathVariable String orderCode){
    return commonMethodService.getOrderByCode(orderCode);
}


//get transport offers offering
@GetMapping("/getAvailableOffers")
private List<OrderWithoutTransport> getAvailableOffers(){
    return commonMethodService.getAvailableOffers();
}


//get order certified given by Farmer
@GetMapping("/getOrderByTransporterAndFarmerStatus/{id}")
private List<OrderWithoutTransport> getOrderByTransporterAndFarmerStatus(@PathVariable Long id){
    return commonMethodService.getOrderByTransporterAndFarmerStatus(id);
}


//get order by customer
@GetMapping("/getOrderByCustomer/{code}")
private List<OrderWithoutTransport> getOrderByCustomer(@PathVariable String orderCode){
    return commonMethodService.getOrderByCustomer(orderCode);
}

//cus certified that he has got
@PostMapping("/customerCertified")
private String customerCertified (@RequestBody OrderWithoutTransport  OrderWithoutTransport) { return commonMethodService.customerCertified(OrderWithoutTransport);}


//update order before farmer has given
@PutMapping("/updateOrder/{id}")
private String updateOrder(@PathVariable Long id){
    return commonMethodService.updateOrder(id);
}

}
