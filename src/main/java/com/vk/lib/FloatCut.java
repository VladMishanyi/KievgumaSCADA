package com.vk.lib;

/**
 * Created by User on 2018-02-28.
 */
public class FloatCut {

    private static final float POW = 10F;

    private FloatCut(){}

    public static float floatOneDig(final float value){
        return cut(POW, value);
    }

    public static float floatTwoDigs(final float value){
        return cut(POW*POW, value);
    }

    public static float floatThreeDigs(final float value){
        return cut(POW*POW*POW, value);
    }

    public static float cut(final float pow, final float value){
        float mul = (float) Math.round(value*pow);
        return mul/pow;
    }
}
