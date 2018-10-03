package com.example.android.quakereport;

import java.net.URL;

public class Earthquake {

    //Create private variables for Earthquake Class
    private Double mMagnitude;

    private String mLocation;

    private long mTimeInMilliseconds;

    private String mUrl;

    /** Constructer for Earthquake
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the location where the earthquake happened
     * @param timeInMilliseconds is the time in milliseconds (Epoch) when the earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(Double magnitude, String location, long timeInMilliseconds, String url){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public Double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl() {
        return mUrl;
    }
}
