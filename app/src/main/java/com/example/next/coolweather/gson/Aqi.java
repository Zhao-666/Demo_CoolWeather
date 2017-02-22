package com.example.next.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Next on 2017/1/10.
 */

public class Aqi {

    @SerializedName("city")
    public City mCity;

    public class City {

        public String aqi;

        public String pm25;
    }
}
