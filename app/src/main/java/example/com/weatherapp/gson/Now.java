package example.com.weatherapp.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hasee on 2019/8/29.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
