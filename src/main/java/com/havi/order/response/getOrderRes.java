import com.havi.order.entity.*;
public class getOrderRes {

    private static orderWithoutTransport order_init = new orderWithoutTransport();
    private static getOrderRes obj=new getOrderRes(order_init , "success");//Early, instance will be created at load time

    public static orderWithoutTransport order;
    private static String massage;
    private getOrderRes(orderWithoutTransport order , String massage){
        getOrderRes.order = order;
        getOrderRes.massage = massage;
    }

    public static getOrderRes getObj(){
        return obj;
    }
}