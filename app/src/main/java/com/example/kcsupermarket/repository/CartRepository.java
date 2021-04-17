package com.example.kcsupermarket.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.kcsupermarket.R;
import com.example.kcsupermarket.pojo.Cart;

import java.util.ArrayList;
import java.util.List;

public class CartRepository {

    public CartRepository() {
    }

    public LiveData<List<Cart>> getCartItems(){
        MutableLiveData mutableLiveData=new MutableLiveData();

        List<Cart> cartList=new ArrayList<>();
        cartList.add(new Cart("Chocolate","10","Rs.100", R.drawable.chocolates));
        cartList.add(new Cart("Tomato","2kg","Rs.25", R.drawable.tomato));
        cartList.add(new Cart("Onion","5kg","Rs.30", R.drawable.onion));
        cartList.add(new Cart("Ginger","1kg","Rs.25", R.drawable.ginger));
        cartList.add(new Cart("Chips","10 Packet","Rs.30", R.drawable.chipsandsnacks));


        mutableLiveData.setValue(cartList);

        return mutableLiveData;

    }
}
