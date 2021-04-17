package com.example.kcsupermarket.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.kcsupermarket.pojo.Cart;
import com.example.kcsupermarket.repository.CartRepository;

import java.util.List;

public class CartViewModel extends ViewModel {
    public CartRepository cartRepository;

    public CartViewModel() {
        this.cartRepository=new CartRepository();
    }

    public LiveData<List<Cart>> getCartItems(){
        return cartRepository.getCartItems();
    }

}
