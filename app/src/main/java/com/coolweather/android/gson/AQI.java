package com.coolweather.android.gson;

/**
 * Created by yecanbo on 2020/2/7.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;

        public String pm25;
    }
}
