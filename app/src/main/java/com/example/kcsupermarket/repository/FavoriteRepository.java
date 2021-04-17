package com.example.kcsupermarket.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.kcsupermarket.R;
import com.example.kcsupermarket.pojo.Cart;
import com.example.kcsupermarket.pojo.Favorites;

import java.util.ArrayList;
import java.util.List;

public class FavoriteRepository {
    public FavoriteRepository() {
    }

    public LiveData<List<Favorites>> getCartItems(){
        MutableLiveData mutableLiveData=new MutableLiveData();

        List<Favorites> favoritesList=new ArrayList<>();
        favoritesList.add(new Favorites("Chocolate","10","Rs.100", R.drawable.chocolates));
        favoritesList.add(new Favorites("Tomato","2kg","Rs.25", R.drawable.tomato));
        favoritesList.add(new Favorites("Onion","5kg","Rs.30", R.drawable.onion));
        favoritesList.add(new Favorites("Ginger","1kg","Rs.25", R.drawable.ginger));
        favoritesList.add(new Favorites("Chips","10 Packet","Rs.30", R.drawable.chipsandsnacks));


        mutableLiveData.setValue(favoritesList);

        return mutableLiveData;

    }
}
