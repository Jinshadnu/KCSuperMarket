package com.example.kcsupermarket.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kcsupermarket.R;
import com.example.kcsupermarket.databinding.LayoutMyordersBinding;
import com.example.kcsupermarket.pojo.MyOrders;

import java.util.List;

import static android.view.LayoutInflater.from;

public class MyOrderAdapter extends RecyclerView.Adapter<MyOrderAdapter.OrderViewHolder> {
  public Context context;
  public List<MyOrders> myOrdersList;

    public MyOrderAdapter(Context context, List<MyOrders> myOrdersList) {
        this.context = context;
        this.myOrdersList = myOrdersList;
    }

    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutMyordersBinding myordersBinding= DataBindingUtil.inflate(from(context), R.layout.layout_myorders,parent,false);
        return new OrderViewHolder(myordersBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {
    MyOrders myOrders=myOrdersList.get(position);
    holder.myordersBinding.setOrder(myOrders);
    }

    @Override
    public int getItemCount() {
        return myOrdersList.size();
    }

    public class OrderViewHolder extends RecyclerView.ViewHolder {
        public LayoutMyordersBinding myordersBinding;
        public OrderViewHolder(@NonNull LayoutMyordersBinding myordersBinding) {
            super(myordersBinding.getRoot());
            this.myordersBinding=myordersBinding;
        }
    }
}
