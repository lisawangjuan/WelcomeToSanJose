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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.insights_list, container, false);

        // create an array variable insights to store views
        final ArrayList<Insights> insights = new ArrayList<Insights>();
        insights.add(new Insights("The Boiling Crab San Jose", "http://www.theboilingcrab.com/", R.drawable.boiling_crab,
                "71 Curtner Ave, San Jose, CA 95125",
                "https://www.google.com/maps/place/The+Boiling+Crab/@37.330934,-121.9575631,12z/data=!3m1!5s0x808e331bc8de8565:0x7edf0a3a4d4600a5!4m8!1m2!2m1!1sThe+Boiling+Crab+San+Jose!3m4!1s0x0:0x5e35571d5ce1f5d1!8m2!3d37.3026308!4d-121.8641925",
                "What does people say", "https://youtu.be/JvmQNv8HOOw"));
        insights.add(new Insights("In-N-Out Burger", "http://locations.in-n-out.com/240-San-Jose", R.drawable.in_out_burger,
                "550 Newhall Dr, San Jose, CA 95110",
                "https://www.google.com/maps/place/In-N-Out+Burger/@37.350298,-121.9240607,17z/data=!3m1!4b1!4m5!3m4!1s0x808fcb9fb4e626df:0xa7ea000f7477a6a6!8m2!3d37.350298!4d-121.921872",
                "What does people say", "https://youtu.be/lY1fRP7qICU"));
        insights.add(new Insights("Gen Korean BBQ House", "http://genkoreanbbq.com", R.drawable.gen_bbq,
                "1628 Hostetter Rd, San Jose, CA 95131",
                "https://www.google.com/maps/place/Gen+Korean+BBQ+House/@37.387245,-121.8876427,17z/data=!3m1!4b1!4m5!3m4!1s0x808fcc10c65712af:0x146313128b3ba342!8m2!3d37.387245!4d-121.885454",
                "What does people say", "https://youtu.be/8d3Y59DY0_U"));

        InsightsAdapter adapter = new InsightsAdapter(getActivity(), insights);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
