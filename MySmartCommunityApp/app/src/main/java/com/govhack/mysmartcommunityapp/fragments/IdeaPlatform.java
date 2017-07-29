package com.govhack.mysmartcommunityapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.govhack.mysmartcommunityapp.R;
import com.govhack.mysmartcommunityapp.adapter.SlidingAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class IdeaPlatform extends Fragment {
    Button btnAdd;
    Button btnCancel, buttonAddIdea;
    LinearLayout lnrTopIdeas, lnrAddNew;
    public IdeaPlatform() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_idea_platform2, container, false);
        btnAdd = (Button)v.findViewById(R.id.btnadd);
        lnrTopIdeas = (LinearLayout)v.findViewById(R.id.top_ideas);
        lnrAddNew = (LinearLayout)v.findViewById(R.id.add_new);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lnrTopIdeas.setVisibility(View.GONE);
                lnrAddNew.setVisibility(View.VISIBLE);
            }
        });
//        ViewPager slidePager = (ViewPager) v.findViewById(R.id.view_pager);
//        SlidingAdapter adapter = new SlidingAdapter(getContext());
//        slidePager.setAdapter(adapter);

        return v;
    }

}
