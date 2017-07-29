package com.govhack.mysmartcommunityapp.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.govhack.mysmartcommunityapp.R;

/**
 * Created by cibin.oommen on 7/29/2017.
 */

public class SlidingAdapter extends PagerAdapter {
    Context context;
    private int[] GalImages = new int[] {
            R.drawable.banner_one,
            R.drawable.two,
            R.drawable.three
    };
    public SlidingAdapter(Context context){
        this.context=context;
    }
    @Override
    public int getCount() {
        return GalImages.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((ImageView) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);
        int padding = context.getResources().getDimensionPixelSize(R.dimen.padding_medium);
        imageView.setPadding(padding, 5, padding, padding);
        imageView.setScaleType(ImageView.ScaleType.FIT_START);
        imageView.setImageResource(GalImages[position]);
        ((ViewPager) container).addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((ImageView) object);
    }
}