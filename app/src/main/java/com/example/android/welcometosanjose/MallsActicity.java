package com.example.android.welcometosanjose;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by karlottajuan on 9/22/2017.
 */

public class MallsActicity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insights_list);

        // create an array variable insights to store views
        final ArrayList<Insights> insights = new ArrayList<Insights>();
        insights.add(new Insights("Westfield Valley Fair", "https://www.westfield.com/valleyfair", R.drawable.westfield_valley));
        insights.add(new Insights("Great Mall", "http://www.simon.com/mall/great-mall", R.drawable.great_mall));
        insights.add(new Insights("Stanford Shopping Center", "http://www.simon.com/mall/stanford-shopping-center", R.drawable.stanford_shopping_center));

        InsightsAdapter adapter = new InsightsAdapter(this, insights);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
