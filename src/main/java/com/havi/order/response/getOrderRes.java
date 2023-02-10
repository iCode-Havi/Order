package com.havi.order.response;
import com.havi.order.entity.*;
public class getOrderRes {

    private static OrderWithoutTransport order_init = new OrderWithoutTransport();
    private static getOrderRes obj=new getOrderRes(order_init , "success");//Early, instance will be created at load time

    public static OrderWithoutTransport order;
    public static String massage;
    private getOrderRes(OrderWithoutTransport order , String massage){
        getOrderRes.order = order;
        getOrderRes.massage = massage;
    }

    public static getOrderRes getObj(){
        return obj;
    }
}