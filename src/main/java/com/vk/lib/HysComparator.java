package com.vk.lib;

/**
 * Created by User on 2018-03-02.
 */
public class HysComparator {

    private HysComparator(){}

    public static boolean compare(Float oldValue, Float currentValue, Integer hysterysys){
        if (oldValue - hysterysys >= currentValue) return true;
        if (oldValue + hysterysys <= currentValue) return true;
        if (0 == currentValue) return true;
        return false;
    }

    public static boolean compare(Integer oldValue, Integer currentValue, Integer hysterysys){
        if (oldValue - hysterysys >= currentValue) return true;
        if (oldValue + hysterysys <= currentValue) return true;
        if (0 == currentValue) return true;
        return false;
    }

}
