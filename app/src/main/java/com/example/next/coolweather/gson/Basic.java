package com.example.next.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Next on 2017/1/10.
 */

public class Basic {

    @SerializedName("city")
    public String mCityName;

    @SerializedName("id")
    public String mWeatherId;

    @SerializedName("update")
    public Update mUpdate;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }

}
