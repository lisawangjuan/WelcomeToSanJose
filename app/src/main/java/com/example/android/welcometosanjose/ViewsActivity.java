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
        insights.add(new Insights("Google", "https://www.google.com/intl/en/about/", R.drawable.google, "1600 Amphitheatre Pkwy, Mountain View, CA 94043",
                "http://www.google.com/maps/place/Googleplex/@37.4219999,-122.0862462,17z/data=!3m1!4b1!4m5!3m4!1s0x808fba02425dad8f:0x6c296c66619367e0!8m2!3d37.4219999!4d-122.0840575",
                "Watch tour video!", "http://youtu.be/SNtJF6Od1f8"));
        insights.add(new Insights("Apple", "http://www.apple.com", R.drawable.apple_campus, "1 Infinite Loop, Cupertino, CA 95014",
                "http://www.google.com/maps/place/Apple+Campus/@37.3307963,-122.0323709,17z/data=!4m13!1m7!3m6!1s0x808fb5b6eb334db7:0x5a5d75e6c47ec82f!2sApple+Campus,+Cupertino,+CA+95014!3b1!8m2!3d37.33182!4d-122.03118!3m4!1s0x0:0xf4f52012bc6adf45!8m2!3d37.3318457!4d-122.0296003",
                "Watch tour video!", "http://youtu.be/rsIl-7ab-Y0"));
        insights.add(new Insights("San Jose State University", "http://www.sjsu.edu", R.drawable.sjsu, "1 Washington Sq, San Jose, CA 95192",
                "http://www.google.com/maps/place/San+Jos%C3%A9+State+University/@37.3351874,-121.8832602,17z/data=!3m1!4b1!4m5!3m4!1s0x808fccb864de43d5:0x397ffe721937340e!8m2!3d37.3351874!4d-121.8810715",
                "Watch tour video!", "http://youtu.be/A9RMe7Val-4"));
        insights.add(new Insights("Municipal Rose Garden", "http://www.sanjoseca.gov/facilities/facility/details/74", R.drawable.municipal_rose_garden,
                "Dana Ave & Naglee Ave, San Jose, CA 95112", "http://www.google.com/maps/place/Municipal+Rose+Garden/@37.3318809,-121.9308006,17z/data=!3m1!4b1!4m5!3m4!1s0x808fcb146d96926f:0xff35e99b970126d6!8m2!3d37.3318809!4d-121.9286119",
                "Watch tour video!", "http://youtu.be/Z3kZz12fnkA"));

        InsightsAdapter adapter = new InsightsAdapter(this, insights);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
