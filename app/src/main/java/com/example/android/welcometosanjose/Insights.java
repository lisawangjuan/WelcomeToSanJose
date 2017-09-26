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

    // insight address
    private String mInsightAddress;

    // insight address map link
    private String mInsightMapUrl;

    // insight video intro
    private String mInsightVideoIntro;

    // insight video link
    private String mInsightVideoUrl;

    /**
     * Insights constructor
     */
    public Insights(String location, String website, int imageSourceID, String address, String mapUrl, String videoIntro, String videoUrl) {
        mLocationName = location;
        mOfficalWebsite = website;
        mImageSourceID = imageSourceID;
        mInsightAddress = address;
        mInsightMapUrl = mapUrl;
        mInsightVideoIntro = videoIntro;
        mInsightVideoUrl = videoUrl;
    }

    // get insight location name in San Jose
    public String getmLocationName(){ return mLocationName;}

    // get insight website
    public String getmOfficalWebsite() { return mOfficalWebsite;}

    // get image source ID of insight
    public int getmImageSourceID() { return mImageSourceID;}

    // get insight address
    public String getmInsightAddress() {
        return mInsightAddress;
    }

    // get insight map url
    public String getmInsightMapUrl() {
        return mInsightMapUrl;
    }

    // get insight video intro
    public String getmInsightVideoIntro() {
        return mInsightVideoIntro;
    }

    // get insight video url
    public String getmInsightVideoUrl() {
        return mInsightVideoUrl;
    }


}
