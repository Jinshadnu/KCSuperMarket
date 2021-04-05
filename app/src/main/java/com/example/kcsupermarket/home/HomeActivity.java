package com.example.kcsupermarket.home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.kcsupermarket.R;
import com.example.kcsupermarket.databinding.ActivityHomeBinding;
import com.example.kcsupermarket.fragments.CartFragment;
import com.example.kcsupermarket.fragments.FavouritesFragment;
import com.example.kcsupermarket.fragments.HomeFragment;
import com.example.kcsupermarket.fragments.ProfileFragment;
import com.example.kcsupermarket.utils.Constants;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    public ActivityHomeBinding homeBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        homeBinding= DataBindingUtil.setContentView(this,R.layout.activity_home);

        openFragment(new HomeFragment(), Constants.HOME_FRAGMENT_TAG);


        homeBinding.bottomNavigationView.setOnNavigationItemSelectedListener(this);

    }

    @Override
    protected void onResume() {
        super.onResume();
        openFragment(new HomeFragment(), Constants.HOME_FRAGMENT_TAG);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.bottomnavigationHome:
                openFragment(new HomeFragment(), Constants.HOME_FRAGMENT_TAG);
                break;
            case R.id.bottomnavigationCart:
                openFragment(new CartFragment(), Constants.CART_FRAGMENT_TAG);
                break;
            case R.id.bottomnavigationFavorite:
                openFragment(new FavouritesFragment(), Constants.PROFILE_FRAGMENT_TAG);
                break;
            case R.id.bottomnavigationProfile:
                openFragment(new ProfileFragment(), Constants.PROFILE_FRAGMENT_TAG);
                break;
        }
        return true;
    }

    public void openFragment(Fragment fragment, String tag){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.layoutFragment,fragment,tag);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}