package com.example.kcsupermarket.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.kcsupermarket.pojo.Favorites;
import com.example.kcsupermarket.repository.FavoriteRepository;

import java.util.List;

public class FavoriteViewModel extends ViewModel {
    public FavoriteRepository favoriteRepository;

    public FavoriteViewModel() {
        this.favoriteRepository=new FavoriteRepository();
    }

    public LiveData<List<Favorites>> getFavorites(){
        return favoriteRepository.getCartItems();
    }
}
