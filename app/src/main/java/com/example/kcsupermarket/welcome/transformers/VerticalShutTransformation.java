package com.example.kcsupermarket.welcome.transformers;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;

public class VerticalShutTransformation implements ViewPager2.PageTransformer {
    @Override
    public void transformPage(@NonNull View page, float position) {
        page.setTranslationX(-position*page.getWidth());
        page.setCameraDistance(999999999);

        if (position < 0.5 && position > -0.5){
            page.setVisibility(View.VISIBLE);
        }
        else {
            page.setVisibility(View.INVISIBLE);
        }



        if (position < -1){     // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.setAlpha(0);

        }
        else if (position <= 0 ){    // [-1,0]
            page.setAlpha(1);
            page.setRotationX(180*(1-Math.abs(position)+1));

        }
        else if (position <= 1){    // (0,1]
            page.setAlpha(1);
            page.setRotationX(-180*(1-Math.abs(position)+1));

        }
        else {    // (1,+Infinity]
            // This page is way off-screen to the right.
            page.setAlpha(0);

        }


    }
}