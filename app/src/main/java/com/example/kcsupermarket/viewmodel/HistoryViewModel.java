package com.example.kcsupermarket.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.kcsupermarket.pojo.MyOrders;
import com.example.kcsupermarket.repository.HistoryRepository;

import java.util.List;

public class HistoryViewModel extends ViewModel {
    public HistoryRepository historyRepository;

    public HistoryViewModel() {
        this.historyRepository=new HistoryRepository();
    }

    public LiveData<List<MyOrders>> getOrders(){
        return historyRepository.getOrders();
    }
}
