package com.example.kcsupermarket.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;


import com.example.kcsupermarket.pojo.FeaturedProducts;
import com.example.kcsupermarket.repository.FeaturedProductRepository;

import java.util.List;

public class FeaturedProductViewModel extends ViewModel {
    public FeaturedProductRepository featuredProductRepository;
    public FeaturedProductViewModel() {
        this.featuredProductRepository = new FeaturedProductRepository();

    }
    public LiveData<List<FeaturedProducts>> getFeaturedProducts(){
        return featuredProductRepository.getFearuredProducts();
    }
}
