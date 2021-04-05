package com.example.kcsupermarket.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.kcsupermarket.R;
import com.example.kcsupermarket.pojo.Categories;

import java.util.ArrayList;
import java.util.List;

public class CategoryRepository {
    public CategoryRepository() {
    }

    public LiveData<List<Categories>> getCategeories(){
        MutableLiveData mutableLiveData=new MutableLiveData();

        List<Categories> categoriesList=new ArrayList<>();
        categoriesList.add(new Categories("Vegetables", R.drawable.fruitsvegetables));
        categoriesList.add(new Categories("Snacks", R.drawable.chipsandsnacks));
        categoriesList.add(new Categories("Water", R.drawable.water));
        categoriesList.add(new Categories("Bakery", R.drawable.bakery));
        categoriesList.add(new Categories("Drinks", R.drawable.drinks));
        categoriesList.add(new Categories("Chocolates", R.drawable.chocolates));
        categoriesList.add(new Categories("Vegetables", R.drawable.fruitsvegetables));
        categoriesList.add(new Categories("Fruits", R.drawable.chipsandsnacks));
        categoriesList.add(new Categories("vegetables", R.drawable.fruitsvegetables));

        mutableLiveData.setValue(categoriesList);
        return mutableLiveData;
    }
}
