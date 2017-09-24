package com.example.android.welcometosanjose;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows the categories
        TextView goTourSanJose = (TextView) findViewById(R.id.go_tour_it);
        // Set  a click listener on that view
        goTourSanJose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sanJoseIntent = new Intent(MainActivity.this, GoTourSanJose.class);
                startActivity(sanJoseIntent);
            }
        });




    }
}
