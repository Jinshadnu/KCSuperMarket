package com.example.kcsupermarket.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kcsupermarket.R;
import com.example.kcsupermarket.activities.ProductDetailsActivity;
import com.example.kcsupermarket.databinding.LayoutItemsBinding;
import com.example.kcsupermarket.pojo.Items;

import java.util.List;

import static android.view.LayoutInflater.from;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
 public Context context;
 public List<Items> itemsList;

    public ItemAdapter(Context context, List<Items> itemsList) {
        this.context = context;
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutItemsBinding itemsBinding= DataBindingUtil.inflate(from(context), R.layout.layout_items,parent,false);
        return new ItemViewHolder(itemsBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
     Items items=itemsList.get(position);
     holder.itemsBinding.setItems(items);
     holder.itemsBinding.cardItem.setOnClickListener(v -> {
         context.startActivity(new Intent(context.getApplicationContext(), ProductDetailsActivity.class));
     });
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {
        public LayoutItemsBinding itemsBinding;

        public ItemViewHolder(LayoutItemsBinding layoutItemsBinding) {
            super(layoutItemsBinding.getRoot());
            this.itemsBinding=layoutItemsBinding;
        }
    }
}
