package com.altama.forecast.application.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;

/**
 *
 * @author User
 */
public class CommonUtil {
    public static Object convertMap2Object(Map<String, Object> o, Class c){
        ObjectMapper m = new ObjectMapper();
        return m.convertValue(o, c);
    }
    public static Map<String, Object> convertObject2Map(Object o){
        ObjectMapper m = new ObjectMapper();
        return m.convertValue(o, Map.class);
    }
}