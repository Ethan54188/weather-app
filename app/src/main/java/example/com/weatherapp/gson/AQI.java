package example.com.weatherapp.gson;

/**
 * Created by hasee on 2019/8/29.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
