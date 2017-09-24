package com.example.android.welcometosanjose;

/**
 * Created by karlottajuan on 9/22/2017.
 */

public class Insights {

    // insight name in San Jose
    private String mLocationName;

    // insight website
    private String mOfficalWebsite;

    // insight image
    private int mImageSourceID;

    /**
     * Insights constructor
     */
    public Insights(String location, String website, int imageSourceID) {
        mLocationName = location;
        mOfficalWebsite = website;
        mImageSourceID = imageSourceID;
    }

    // get insight location name in San Jose
    public String getmLocationName(){ return mLocationName;}

    // get insight website
    public String getmOfficalWebsite() { return mOfficalWebsite;}

    // get image source ID of insight
    public int getmImageSourceID() { return mImageSourceID;}


}
