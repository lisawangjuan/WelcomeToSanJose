package com.example.android.welcometosanjose;

import android.app.Activity;
import android.text.Html;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
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
        nameView.setClickable(true);
        nameView.setMovementMethod(LinkMovementMethod.getInstance());
        String website = String.format("<a href='%s'> %s </a>", curInsight.getmOfficalWebsite(), curInsight.getmLocationName());

        // remove link underline
        Spannable w = (Spannable) Html.fromHtml(website);
        for (URLSpan u : w.getSpans(0, w.length(), URLSpan.class)) {
            w.setSpan(new UnderlineSpan() {
                public void updateDrawState(TextPaint tp) {
                    tp.setUnderlineText(false);
                }
            }, w.getSpanStart(u), w.getSpanEnd(u), 0);
        }
        nameView.setText(w);

        // Find the TextView in the list_item.xml layout with the ID address_view
        // add hyperlink to address_view
        TextView addressView = (TextView) listItemView.findViewById(R.id.address_view);
        addressView.setClickable(true);
        addressView.setMovementMethod(LinkMovementMethod.getInstance());
        String address = String.format("<a href='%s'> %s </a>", curInsight.getmInsightMapUrl(), curInsight.getmInsightAddress());
        // remove link underline
        Spannable a = (Spannable) Html.fromHtml(address);
        for (URLSpan u : a.getSpans(0, a.length(), URLSpan.class)) {
            a.setSpan(new UnderlineSpan() {
                public void updateDrawState(TextPaint tp) {
                    tp.setUnderlineText(false);
                }
            }, a.getSpanStart(u), a.getSpanEnd(u), 0);
        }
        addressView.setText(a);

        // Find the TextView in the list_item.xml layout with the ID address_view
        // add hyperlink to address_view
        TextView videoView = (TextView) listItemView.findViewById(R.id.video_view);
        videoView.setClickable(true);
        videoView.setMovementMethod(LinkMovementMethod.getInstance());
        String video = String.format("<a href='%s'> %s </a>", curInsight.getmInsightVideoUrl(), curInsight.getmInsightVideoIntro());
        // remove link underline
        Spannable v = (Spannable) Html.fromHtml(video);
        for (URLSpan u : v.getSpans(0, v.length(), URLSpan.class)) {
            v.setSpan(new UnderlineSpan() {
                public void updateDrawState(TextPaint tp) {
                    tp.setUnderlineText(false);
                }
            }, v.getSpanStart(u), v.getSpanEnd(u), 0);
        }
        videoView.setText(v);


        ImageView iconView = (ImageView) listItemView.findViewById(R.id.photo_view);
        iconView.setImageResource(curInsight.getmImageSourceID());

        return listItemView;

    }
}
