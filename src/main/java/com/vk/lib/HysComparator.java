package com.vk.lib;

/**
 * Created by User on 2018-03-02.
 */
public class HysComparator {

    private HysComparator(){}

    public static boolean compare(final float oldValue, final float currentValue, final float hysterysys){
        if (oldValue - hysterysys >= currentValue) return true;
        if (oldValue + hysterysys <= currentValue) return true;
        if (0 == currentValue) return true;
        return false;
    }

    public static boolean compare(final long oldValue, final long currentValue, final long hysterysys){
        if (oldValue - hysterysys >= currentValue) return true;
        if (oldValue + hysterysys <= currentValue) return true;
        if (0 == currentValue) return true;
        return false;
    }

    public static boolean compare(final int oldValue, final int currentValue, final int hysterysys){
        if (oldValue - hysterysys >= currentValue) return true;
        if (oldValue + hysterysys <= currentValue) return true;
        if (0 == currentValue) return true;
        return false;
    }

    public static boolean compare(final short oldValue, final short currentValue, final short hysterysys){
        if (oldValue - hysterysys >= currentValue) return true;
        if (oldValue + hysterysys <= currentValue) return true;
        if (0 == currentValue) return true;
        return false;
    }

}
