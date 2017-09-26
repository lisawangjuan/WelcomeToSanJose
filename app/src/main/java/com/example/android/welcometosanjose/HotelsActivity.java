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
        insights.add(new Insights("Fiarmont San Jose", "http://www.fairmont.com/san-jose/", R.drawable.faimont,
                "170 S Market St, San Jose, CA 95113",
                "https://www.google.com/maps/place/Fairmont+San+Jose/@37.3329668,-121.8913847,17z/data=!3m1!4b1!4m5!3m4!1s0x808fccbb23631527:0xfad2b62f7007863d!8m2!3d37.3329668!4d-121.889196",
                "See how it looks", "https://youtu.be/1hN3Z9vl5yg"));
        insights.add(new Insights("DoubleTree by Hilton San Jose", "http://doubletree3.hilton.com", R.drawable.double_tree_hilton,
                "2050 Gateway Pl, San Jose, CA 95110",
                "https://www.google.com/maps/place/DoubleTree+by+Hilton+Hotel+San+Jose/@37.3718511,-121.9248902,17z/data=!3m1!4b1!4m5!3m4!1s0x808fcbea46de432b:0x143d6b946b2164f5!8m2!3d37.3718511!4d-121.9227015",
                "See how it looks", "https://youtu.be/4qVA8Ep5MO4"));
        insights.add(new Insights("The Westin San Jose", "www.westinsanjose.com", R.drawable.westin, "302 S Market St, San Jose, CA 95113",
                "https://www.google.com/maps/place/The+Westin+San+Jose/@37.3309547,-121.889711,17z/data=!3m1!4b1!4m5!3m4!1s0x808fccba88ad98a9:0x1168b773dd13619!8m2!3d37.3309547!4d-121.8875223",
                "See how it looks", "https://youtu.be/OWyefyE3bUk"));

        InsightsAdapter adapter = new InsightsAdapter(this, insights);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
