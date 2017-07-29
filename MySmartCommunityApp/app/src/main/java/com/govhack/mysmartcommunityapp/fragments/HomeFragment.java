package com.govhack.mysmartcommunityapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.govhack.mysmartcommunityapp.R;
import com.govhack.mysmartcommunityapp.adapter.SlidingAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        ViewPager slidePager = (ViewPager) v.findViewById(R.id.view_pager);
        SlidingAdapter adapter = new SlidingAdapter(getContext());
        slidePager.setAdapter(adapter);

        return v;
    }

}
