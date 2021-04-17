package com.example.kcsupermarket.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.kcsupermarket.pojo.SubCategories;
import com.example.kcsupermarket.repository.SubCategoryRepository;

import java.util.List;

public class SubCategoryViewModel extends ViewModel {
    public SubCategoryRepository subCategoryRepository;

    public SubCategoryViewModel() {
        this.subCategoryRepository=new SubCategoryRepository();
    }

    public LiveData<List<SubCategories>> getSubCategories(){
        return subCategoryRepository.getSubCategories();
    }
}
