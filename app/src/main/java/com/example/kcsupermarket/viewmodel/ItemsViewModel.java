package com.example.kcsupermarket.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.kcsupermarket.pojo.Items;
import com.example.kcsupermarket.repository.ItemRepository;

import java.util.List;

public class ItemsViewModel extends ViewModel {
    public ItemRepository itemRepository;

    public ItemsViewModel() {
        this.itemRepository=new ItemRepository();
    }

    public LiveData<List<Items>> getItems(){
        return itemRepository.getItems();
    }
}
