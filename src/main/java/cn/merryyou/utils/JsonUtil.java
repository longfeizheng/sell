package cn.merryyou.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created on 2017/11/16 0016.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public class JsonUtil {
    public static String toJson(Object object){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
