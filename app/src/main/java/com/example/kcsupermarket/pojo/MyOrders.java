package com.example.kcsupermarket.pojo;

public class MyOrders {
    public String order_id;
    public String date;
    public String total;
    public String status;

    public String getOrder_id() {
        return order_id;
    }

    public String getDate() {
        return date;
    }

    public String getTotal() {
        return total;
    }

    public String getStatus() {
        return status;
    }

    public MyOrders(String order_id, String date, String total, String status) {
        this.order_id = order_id;
        this.date = date;
        this.total = total;
        this.status = status;
    }

}
