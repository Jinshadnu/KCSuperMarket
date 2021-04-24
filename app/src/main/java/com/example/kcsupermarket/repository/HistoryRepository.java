package com.example.kcsupermarket.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.kcsupermarket.pojo.MyOrders;

import java.util.ArrayList;
import java.util.List;

public class HistoryRepository {
    public HistoryRepository() {
    }

    public LiveData<List<MyOrders>> getOrders(){
        MutableLiveData mutableLiveData=new MutableLiveData();

        List<MyOrders> ordersList=new ArrayList<>();
        ordersList.add(new MyOrders("1000","21-04-2021","Rs.500","Delevered"));
        ordersList.add(new MyOrders("1000","21-04-2021","Rs.500","Delevered"));
        ordersList.add(new MyOrders("1000","21-04-2021","Rs.500","Delevered"));
        ordersList.add(new MyOrders("1000","21-04-2021","Rs.500","Delevered"));

        mutableLiveData.setValue(ordersList);
        return mutableLiveData;
    }
}
