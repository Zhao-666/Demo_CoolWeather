package com.example.next.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Next on 2017/1/10.
 */

public class Weather {

    @SerializedName("status")
    public String mStatus;

    @SerializedName("basic")
    public Basic mBasic;

    @SerializedName("aqi")
    public Aqi mAqi;

    @SerializedName("now")
    public Now mNow;

    @SerializedName("suggestion")
    public Suggestion mSuggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> mForecastList;
}
