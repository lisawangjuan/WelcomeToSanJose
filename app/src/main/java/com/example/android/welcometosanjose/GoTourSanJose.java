package com.example.android.welcometosanjose;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class GoTourSanJose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_tour_san_jose);

        // Find the View that shows the views category
        TextView viewsToSee = (TextView) findViewById(R.id.views);
        // Set a click listener on that view
        viewsToSee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewsIntent = new Intent(GoTourSanJose.this, ViewsActivity.class);
                startActivity(viewsIntent);
            }
        });

        // Find the View that shows the shopping malls category
        TextView mallsToShopping = (TextView) findViewById(R.id.malls);
        // Set  a click listener on that view
        mallsToShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mallsIntent = new Intent(GoTourSanJose.this, MallsActicity.class);
                startActivity(mallsIntent);
            }
        });

        // Find the View that shows the restaurants category
        TextView restaurantsToEat = (TextView) findViewById(R.id.restaurants);
        // Set  a click listener on that view
        restaurantsToEat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(GoTourSanJose.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
            }
        });

        // Find the View that shows the hotels category
        TextView hotelsToStay = (TextView) findViewById(R.id.hotels);
        // Set  a click listener on that view
        hotelsToStay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hotelsIntent = new Intent(GoTourSanJose.this, HotelsActivity.class);
                startActivity(hotelsIntent);
            }
        });
    }
}
