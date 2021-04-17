package com.example.kcsupermarket.pojo;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

public class SubCategories {
    public int subcategory_id;
    public String subcategory_name;
    public int subcategory_image;

    public SubCategories(String subcategory_name, int subcategory_image) {
        this.subcategory_name = subcategory_name;
        this.subcategory_image = subcategory_image;
    }

    public int getSubcategory_id() {
        return subcategory_id;
    }

    public String getSubcategory_name() {
        return subcategory_name;
    }

    public int getSubcategory_image() {
        return subcategory_image;
    }

    @BindingAdapter("subcategory")
    public static void loadImage(ImageView imageView, int image){
        imageView.setImageResource(image);
    }

}
