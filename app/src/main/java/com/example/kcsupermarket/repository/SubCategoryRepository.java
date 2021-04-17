package com.example.kcsupermarket.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.kcsupermarket.R;
import com.example.kcsupermarket.pojo.Categories;
import com.example.kcsupermarket.pojo.SubCategories;

import java.util.ArrayList;
import java.util.List;

public class SubCategoryRepository {
    public SubCategoryRepository() {
    }

    public LiveData<List<SubCategories>> getSubCategories(){
        MutableLiveData mutableLiveData=new MutableLiveData();

        List<SubCategories> subCategoriesList=new ArrayList<>();
        subCategoriesList.add(new SubCategories("Tomato| Potato| Onion", R.drawable.potato));
        subCategoriesList.add(new SubCategories("Root Vegetables", R.drawable.root_veg));
        subCategoriesList.add(new SubCategories("Leafy Veg", R.drawable.vegetables));
        subCategoriesList.add(new SubCategories("Tomato| Potato| Onion", R.drawable.potato));
        subCategoriesList.add(new SubCategories("Root Vegetables", R.drawable.root_veg));
        subCategoriesList.add(new SubCategories("Leafy Veg", R.drawable.vegetables));

        mutableLiveData.setValue(subCategoriesList);
        return mutableLiveData;
    }
}
