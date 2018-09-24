package com.example.android.quakereport;

public class Earthquake {

    //Create private variables for Earthquake Class
    private Double mMagnitude;

    private String mLocation;

    private long mTimeInMilliseconds;


    //Constructer for Earthquake
    public Earthquake(Double magnitude, String location, long timeInMilliseconds){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
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
}
