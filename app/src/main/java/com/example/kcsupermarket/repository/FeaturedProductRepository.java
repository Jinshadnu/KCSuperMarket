package com.example.kcsupermarket.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;


import com.example.kcsupermarket.R;
import com.example.kcsupermarket.pojo.FeaturedProducts;

import java.util.ArrayList;
import java.util.List;

public class FeaturedProductRepository {

    public FeaturedProductRepository() {
    }

    public LiveData<List<FeaturedProducts>> getFearuredProducts(){
        MutableLiveData mutableLiveData=new
                MutableLiveData();
        List<FeaturedProducts> featuredProducts=new ArrayList<>();
        featuredProducts.add(new FeaturedProducts(R.drawable.onion,"Onion","5% off","Rs.15/-"));
        featuredProducts.add(new FeaturedProducts(R.drawable.coconut_oil,"Coco Oil","10% off","Rs.300/-"));
        featuredProducts.add(new FeaturedProducts(R.drawable.potato,"Potato","5% off","Rs.16/-"));

        mutableLiveData.setValue(featuredProducts);
        return  mutableLiveData;
    }
}
