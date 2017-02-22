package com.example.next.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Next on 2017/1/10.
 */

public class Now {

    @SerializedName("tmp")
    public String mTemperature;

    @SerializedName("cond")
    public More mMore;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
