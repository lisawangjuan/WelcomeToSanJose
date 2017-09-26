package com.example.android.welcometosanjose;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by karlottajuan on 9/22/2017.
 */

public class ViewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insights_list);

        // create an array variable insights to store views
        final ArrayList<Insights> insights = new ArrayList<Insights>();
        insights.add(new Insights("Google", "www.google.com/", R.drawable.google));
        insights.add(new Insights("Apple", "www.apple.com", R.drawable.apple_campus));
        insights.add(new Insights("San Jose State University", "www.sjsu.edu", R.drawable.sjsu));
        insights.add(new Insights("Municipal Rose Garden", "www.sanjoseca.gov/facilities/facility/details/74", R.drawable.municipal_rose_garden));


        InsightsAdapter adapter = new InsightsAdapter(this, insights);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
