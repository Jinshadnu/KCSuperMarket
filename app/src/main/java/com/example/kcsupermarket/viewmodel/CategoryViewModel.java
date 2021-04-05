package com.example.kcsupermarket.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.kcsupermarket.pojo.Categories;
import com.example.kcsupermarket.repository.CategoryRepository;

import java.util.List;

public class CategoryViewModel extends ViewModel {
    public CategoryRepository categoryRepository;


    public CategoryViewModel() {
        this.categoryRepository=new CategoryRepository();
    }

    public LiveData<List<Categories>> getCategories(){
        return categoryRepository.getCategeories();
    }
}
