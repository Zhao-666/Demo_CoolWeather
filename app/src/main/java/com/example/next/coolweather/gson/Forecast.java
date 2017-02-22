package com.example.next.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Next on 2017/1/10.
 */

public class Forecast {

    @SerializedName("date")
    public String mDate;

    @SerializedName("tmp")
    public Temperature mTemperature;

    @SerializedName("cond")
    public More mMore;

    public class Temperature {
        public String max;

        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }


}
