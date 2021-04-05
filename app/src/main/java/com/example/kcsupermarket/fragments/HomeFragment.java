package com.example.kcsupermarket.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kcsupermarket.R;
import com.example.kcsupermarket.adapter.CategoryAdapter;
import com.example.kcsupermarket.adapter.ImageSliderAdapter;
import com.example.kcsupermarket.databinding.FragmentHomeBinding;
import com.example.kcsupermarket.viewmodel.CategoryViewModel;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class



HomeFragment extends Fragment {
    public FragmentHomeBinding fragmentHomeBinding;
    public CategoryViewModel categoryViewModel;
    public CategoryAdapter categoryAdapter;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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
        categoryViewModel =
                new ViewModelProvider(this).get(CategoryViewModel.class);

    }

    @SuppressLint("ResourceAsColor")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentHomeBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);

        fragmentHomeBinding.layoutBase.toolbar.setTitle("Home");
        fragmentHomeBinding.layoutBase.toolbar.setTitleTextColor(R.color.white);


        setValuesToFields();

        fragmentHomeBinding.recyclerCategories.setLayoutManager(new GridLayoutManager(getActivity(),3));
        fragmentHomeBinding.recyclerCategories.setHasFixedSize(true);

        getCategories();


        return fragmentHomeBinding.getRoot();
    }

    public void getCategories() {
        categoryViewModel.getCategories().observe(getActivity(),categories -> {
            categoryAdapter=new CategoryAdapter(getActivity(),categories);
            fragmentHomeBinding.recyclerCategories.setAdapter(categoryAdapter);
        });
    }

    private void setValuesToFields() {
        //banner image
        List<String> bannerList = new ArrayList<>();
        bannerList.add("1");
        bannerList.add("2");
        bannerList.add("3");
        fragmentHomeBinding.rlBanner.setVisibility(View.VISIBLE);
        fragmentHomeBinding.vpImage.setAdapter(new ImageSliderAdapter(getActivity(), bannerList));

        fragmentHomeBinding.cpImage.setViewPager(fragmentHomeBinding.vpImage);

        final float density = getResources().getDisplayMetrics().density;

        //Set circle indicator radius
        fragmentHomeBinding.cpImage.setRadius(5 * density);

        fragmentHomeBinding.vpImage.startAutoScroll();
        fragmentHomeBinding.vpImage.setInterval(5000);
        fragmentHomeBinding.vpImage.setCycle(true);
        fragmentHomeBinding.vpImage.setStopScrollWhenTouch(true);

        // Pager listener over indicator
        fragmentHomeBinding.cpImage.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrolled(int pos, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int pos) {

            }
        });
    }
}