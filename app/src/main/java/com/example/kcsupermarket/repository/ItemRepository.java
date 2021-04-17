package com.example.kcsupermarket.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.kcsupermarket.R;
import com.example.kcsupermarket.pojo.Items;

import java.util.ArrayList;
import java.util.List;

public class ItemRepository {
    public ItemRepository() {
    }

    public LiveData<List<Items>> getItems(){
        MutableLiveData mutableLiveData=new MutableLiveData();

        List<Items> itemsList=new ArrayList<>();
        itemsList.add(new Items("Fresh Onion","1 Kg","Rs.20", R.drawable.onion));
        itemsList.add(new Items("Fresh Tomato","1 Kg","Rs.20", R.drawable.tomato));
        itemsList.add(new Items("Fresh Potato","1 Kg","Rs.20", R.drawable.potato));
        itemsList.add(new Items("Red Onion","1 Kg","Rs.20", R.drawable.red_onions));
        itemsList.add(new Items("Fresh Onion","1 Kg","Rs.20", R.drawable.tomato));
        itemsList.add(new Items("Fresh Onion","1 Kg","Rs.20", R.drawable.onion));

        mutableLiveData.setValue(itemsList);
        return mutableLiveData;



    }
}
