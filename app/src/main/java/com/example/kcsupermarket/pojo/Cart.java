package com.example.kcsupermarket.pojo;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

public class Cart {
    public int item_id;
    public String item_name;
    public String quantity;
    public String price;
    public int item_image;

    public Cart(String item_name, String quantity, String price, int item_image) {
        this.item_name = item_name;
        this.quantity = quantity;
        this.price = price;
        this.item_image = item_image;
    }

    public int getItem_id() {
        return item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getPrice() {
        return price;
    }

    public int getItem_image() {
        return item_image;
    }

    @BindingAdapter("cart")
    public static void loadImage(ImageView imageView, int image){
        imageView.setImageResource(image);
    }
}

