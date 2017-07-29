package com.govhack.mysmartcommunityapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.govhack.mysmartcommunityapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VolunteerPlatform extends Fragment {


    public VolunteerPlatform() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_volunteer_platform2, container, false);
    }

}
