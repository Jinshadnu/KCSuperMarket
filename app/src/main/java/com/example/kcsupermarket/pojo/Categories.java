package com.example.kcsupermarket.pojo;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

public class Categories {
    public int category_id;
    public String category_name;
    public int category_image;

    public Categories(String category_name, int category_image) {
        this.category_name = category_name;
        this.category_image = category_image;
    }

    public int getCategory_id() {
        return category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public int getCategory_image() {
        return category_image;
    }
    @BindingAdapter("category")
    public static void loadImage(ImageView imageView, int image){
        imageView.setImageResource(image);
    }

}
