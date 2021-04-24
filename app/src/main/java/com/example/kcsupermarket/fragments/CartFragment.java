package com.example.kcsupermarket.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kcsupermarket.R;
import com.example.kcsupermarket.activities.ShippingAddressActivity;
import com.example.kcsupermarket.adapter.CartAdapter;
import com.example.kcsupermarket.databinding.FragmentCartBinding;
import com.example.kcsupermarket.viewmodel.CartViewModel;
import com.example.kcsupermarket.viewmodel.CategoryViewModel;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CartFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CartFragment extends Fragment {
    public CartViewModel cartViewModel;
    public CartAdapter cartAdapter;
    public FragmentCartBinding cartBinding;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CartFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CartFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CartFragment newInstance(String param1, String param2) {
        CartFragment fragment = new CartFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        cartViewModel =
                new ViewModelProvider(this).get(CartViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        cartBinding= DataBindingUtil.inflate(inflater,R.layout.fragment_cart,container,false);

        cartBinding.recyclerCart.setLayoutManager(new LinearLayoutManager(getActivity()));
        cartBinding.recyclerCart.setHasFixedSize(true);

        cartBinding.layoutBase.toolbar.setTitle("My Cart");


        cartBinding.layoutBase.toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);
        cartBinding.layoutBase.toolbar.setNavigationOnClickListener(v -> {
            getActivity().onBackPressed();
        });

        cartBinding.buttonOrder.setOnClickListener(v -> {
         startActivity(new Intent(getActivity(), ShippingAddressActivity.class));
        });
        getCartItems();


        return cartBinding.getRoot();
    }
    public void getCartItems(){
        cartViewModel.getCartItems().observe(getActivity(),carts -> {
            cartAdapter=new CartAdapter(getActivity(),carts);
            cartBinding.recyclerCart.setAdapter(cartAdapter);
        });
    }
}