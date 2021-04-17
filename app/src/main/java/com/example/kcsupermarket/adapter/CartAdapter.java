package com.example.kcsupermarket.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kcsupermarket.R;
import com.example.kcsupermarket.activities.SubCategoryActivity;
import com.example.kcsupermarket.databinding.LayoutCartBinding;
import com.example.kcsupermarket.pojo.Cart;

import java.util.List;

import static android.view.LayoutInflater.from;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {
    public Context context;
    public List<Cart> cartList;
    public LayoutInflater layoutInflater;

    public CartAdapter(Context context, List<Cart> cartList) {
        this.context = context;
        this.cartList = cartList;
    }

    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutCartBinding cartBinding= DataBindingUtil.inflate(from(context), R.layout.layout_cart,parent,false);
        return new CartViewHolder(cartBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {
     Cart cart=cartList.get(position);
     holder.cartBinding.setCart(cart);
    }

    @Override
    public int getItemCount() {
        return cartList.size();
    }

    public class CartViewHolder extends RecyclerView.ViewHolder {
        public LayoutCartBinding  cartBinding;

        public CartViewHolder(@NonNull LayoutCartBinding cartBinding) {
            super(cartBinding.getRoot());
            this.cartBinding=cartBinding;
        }
    }
}
