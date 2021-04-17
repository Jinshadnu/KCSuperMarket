package com.example.kcsupermarket.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kcsupermarket.R;
import com.example.kcsupermarket.databinding.LayoutCartBinding;
import com.example.kcsupermarket.databinding.LayoutFavouriteBinding;
import com.example.kcsupermarket.pojo.Cart;
import com.example.kcsupermarket.pojo.Favorites;

import java.util.List;

import static android.view.LayoutInflater.from;

public class FavoriteAdapter extends RecyclerView.Adapter<FavoriteAdapter.FavoriteViewHolder> {
    public Context context;
    public List<Favorites> favoritesList;
    public LayoutInflater layoutInflater;

    public FavoriteAdapter(Context context, List<Favorites>  favorites) {
        this.context = context;
        this.favoritesList = favorites;
    }

    @NonNull
    @Override
    public FavoriteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutFavouriteBinding favouriteBinding= DataBindingUtil.inflate(from(context), R.layout.layout_favourite,parent,false);
        return new FavoriteViewHolder(favouriteBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull FavoriteViewHolder holder, int position) {
        Favorites favorites=favoritesList.get(position);
        holder.favouriteBinding.setFavorites(favorites);
    }

    @Override
    public int getItemCount() {
        return favoritesList.size();
    }

    public class FavoriteViewHolder extends RecyclerView.ViewHolder {
        public LayoutFavouriteBinding favouriteBinding;

        public FavoriteViewHolder(@NonNull LayoutFavouriteBinding favouriteBinding) {
            super(favouriteBinding.getRoot());
            this.favouriteBinding=favouriteBinding;
        }
    }
}

