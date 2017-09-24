package com.example.android.welcometosanjose;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by karlottajuan on 9/22/2017.
 */

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insights_list);

        // create an array variable insights to store views
        final ArrayList<Insights> insights = new ArrayList<Insights>();
        insights.add(new Insights("Fiarmont San Jose", "http://www.fairmont.com/san-jose/", R.drawable.faimont));
        insights.add(new Insights("DoubleTree by Hilton San Jose", "http://doubletree3.hilton.com", R.drawable.double_tree_hilton));
        insights.add(new Insights("The Westin San Jose", "www.westinsanjose.com", R.drawable.westin));

        InsightsAdapter adapter = new InsightsAdapter(this, insights);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
