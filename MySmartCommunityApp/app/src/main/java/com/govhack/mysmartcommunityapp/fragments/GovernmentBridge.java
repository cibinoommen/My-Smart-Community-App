package com.govhack.mysmartcommunityapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.govhack.mysmartcommunityapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class GovernmentBridge extends Fragment {


    public GovernmentBridge() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_government_bridge, container, false);
        PieChart pieChart = (PieChart) v.findViewById(R.id.piechart);
        pieChart.setUsePercentValues(true);

        ArrayList<Entry> yvalues = new ArrayList<Entry>();
        yvalues.add(new Entry(8f, 0));
        yvalues.add(new Entry(15f, 1));
        yvalues.add(new Entry(12f, 2));
        yvalues.add(new Entry(25f, 3));
        yvalues.add(new Entry(23f, 4));

        PieDataSet dataSet = new PieDataSet(yvalues, "Government Bridge");

        ArrayList<String> xVals = new ArrayList<String>();

        xVals.add("Voted");
        xVals.add("Under Analysis");
        xVals.add("Funded");
        xVals.add("Projects in progress");
        xVals.add("Delivered");

        PieData data = new PieData(xVals, dataSet);
        pieChart.setData(data);

        dataSet.setColors(ColorTemplate.VORDIPLOM_COLORS);





        return v;
    }

}
