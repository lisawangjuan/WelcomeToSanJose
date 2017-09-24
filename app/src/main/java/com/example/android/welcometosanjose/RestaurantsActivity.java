package com.example.android.welcometosanjose;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by karlottajuan on 9/22/2017.
 */

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insights_list);

        // create an array variable insights to store views
        final ArrayList<Insights> insights = new ArrayList<Insights>();
        insights.add(new Insights("The Boiling Crab San Jose", "http://www.theboilingcrab.com/", R.drawable.boiling_crab));
        insights.add(new Insights("In-N-Out Burger", "http://locations.in-n-out.com/240-San-Jose", R.drawable.in_out_burger));
        insights.add(new Insights("Gen Korean BBQ House", "http://genkoreanbbq.com", R.drawable.gen_bbq));

        InsightsAdapter adapter = new InsightsAdapter(this, insights);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}

