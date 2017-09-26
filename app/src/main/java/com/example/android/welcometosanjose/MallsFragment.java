package com.example.android.welcometosanjose;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MallsFragment extends Fragment {


    public MallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.insights_list, container, false);

        // create an array variable insights to store views
        final ArrayList<Insights> insights = new ArrayList<Insights>();
        insights.add(new Insights("Westfield Valley Fair", "https://www.westfield.com/valleyfair", R.drawable.westfield_valley,
                "2855 Stevens Creek Blvd, Santa Clara, CA 95050",
                "https://www.google.com/maps/place/Westfield+Valley+Fair/@37.3244004,-121.9439387,17z/data=!3m1!4b1!4m5!3m4!1s0x808fcb1f954cec81:0x2b830ee9c612fc4a!8m2!3d37.3244004!4d-121.94175",
                "See what you can buy", "https://youtu.be/_X1hhqEyGnU"));
        insights.add(new Insights("Great Mall", "http://www.simon.com/mall/great-mall", R.drawable.great_mall,
                "447 Great Mall Dr, Milpitas, CA 95035",
                "https://www.google.com/maps/place/Great+Mall/@37.415738,-121.8996007,17z/data=!3m1!4b1!4m5!3m4!1s0x808fcecafdb31371:0x9358407bfd6fb9dd!8m2!3d37.415738!4d-121.897412",
                "See what you can buy", "https://youtu.be/CJ-WFLSRQVE"));
        insights.add(new Insights("Stanford Shopping Center", "http://www.simon.com/mall/stanford-shopping-center", R.drawable.stanford_shopping_center,
                "660 Stanford Shopping Center, Palo Alto, CA 94304",
                "https://www.google.com/maps/place/Stanford+Shopping+Center/@37.443126,-122.1737627,17z/data=!3m1!4b1!4m5!3m4!1s0x808fbb3471827639:0x75895b0f0e878d4!8m2!3d37.443126!4d-122.171574",
                "See what you can buy", "https://youtu.be/zgTYXH4q6UY"));

        InsightsAdapter adapter = new InsightsAdapter(getActivity(), insights);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
