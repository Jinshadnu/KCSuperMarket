package com.example.kcsupermarket.pojo;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

public class Items {
    public int item_id;
    public String item_name;
    public String item_quntity;
    public String item_price;
    public int item_image;

    public Items(String item_name, String item_quntity, String item_price, int item_image) {
        this.item_name = item_name;
        this.item_quntity = item_quntity;
        this.item_price = item_price;
        this.item_image = item_image;
    }

    public String getItem_name() {
        return item_name;
    }

    public String getItem_quntity() {
        return item_quntity;
    }

    public String getItem_price() {
        return item_price;
    }

    public int getItem_image() {
        return item_image;
    }

    @BindingAdapter("items")
    public static void loadImage(ImageView imageView, int image){
        imageView.setImageResource(image);
    }
}
