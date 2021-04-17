package com.example.kcsupermarket.fragments;

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
import com.example.kcsupermarket.adapter.CartAdapter;
import com.example.kcsupermarket.adapter.FavoriteAdapter;
import com.example.kcsupermarket.databinding.FragmentCartBinding;
import com.example.kcsupermarket.databinding.FragmentFavouritesBinding;
import com.example.kcsupermarket.viewmodel.CartViewModel;
import com.example.kcsupermarket.viewmodel.FavoriteViewModel;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FavouritesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FavouritesFragment extends Fragment {
    public FavoriteViewModel favoriteViewModel;
    public FavoriteAdapter favoriteAdapter;
    public FragmentFavouritesBinding favouritesBinding;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FavouritesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FavouritesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FavouritesFragment newInstance(String param1, String param2) {
        FavouritesFragment fragment = new FavouritesFragment();
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
        favoriteViewModel =
                new ViewModelProvider(this).get(FavoriteViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        favouritesBinding= DataBindingUtil.inflate(inflater,R.layout.fragment_favourites,container,false);

        favouritesBinding.recyclerFavorites.setLayoutManager(new LinearLayoutManager(getActivity()));
        favouritesBinding.recyclerFavorites.setHasFixedSize(true);

        favouritesBinding.layoutBase.toolbar.setTitle("Favorites");


        favouritesBinding.layoutBase.toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);
        favouritesBinding.layoutBase.toolbar.setNavigationOnClickListener(v -> {
            getActivity().onBackPressed();
        });


        getFavorites();


        return favouritesBinding.getRoot();
    }

    private void getFavorites() {
        favoriteViewModel.getFavorites().observe(getActivity(),favorites  -> {
            favoriteAdapter=new FavoriteAdapter(getActivity(),favorites);
            favouritesBinding.recyclerFavorites.setAdapter(favoriteAdapter);
        });
    }

}