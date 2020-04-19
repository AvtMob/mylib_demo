package com.trip.mylib;

public class Point {
    float mLatitude;
    float mLongitude;

    public Point(float latitude, float longitude) {
        mLatitude = latitude;
        mLongitude = longitude;
    }

    public float getLatitude() {
        return mLatitude;
    }

    public float getLongitude() {
        return mLongitude;
    }
}