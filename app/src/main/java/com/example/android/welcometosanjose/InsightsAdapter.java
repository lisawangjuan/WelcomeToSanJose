package com.example.android.welcometosanjose;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by karlottajuan on 9/22/2017.
 */

public class InsightsAdapter extends ArrayAdapter<Insights> {
    public InsightsAdapter(Activity content, ArrayList<Insights> insights) {

        super(content, 0, insights);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the insight object located at this position in the list
        Insights curInsight = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name?view
        TextView nameView = (TextView) listItemView.findViewById(R.id.name_view);
        // Get the version name from the current Insights object and
        // set this text on the name TextView
        nameView.setText(curInsight.getmLocationName());

        // Find the TextView in the list_item.xml layout with the ID official_website
        TextView websiteView = (TextView) listItemView.findViewById(R.id.official_website);
        // Get the version name from the current Insights object and
        // set this text on the name TextView
        websiteView.setText(curInsight.getmOfficalWebsite());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.photo_view);
        iconView.setImageResource(curInsight.getmImageSourceID());

        return listItemView;

    }
}
