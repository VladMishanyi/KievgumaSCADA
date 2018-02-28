package com.vk.lib;

/**
 * Created by User on 2018-02-28.
 */
public class FloatCut {

    private static final float POW = 10F;

    private FloatCut(){}

    public static float floatOneDig(float value){
        return cut(POW, value);
    }

    public static float floatTwoDigs(float value){
        return cut(POW*POW, value);
    }

    public static float floatThreeDigs(float value){
        return cut(POW*POW*POW, value);
    }

    public static float cut(float pow, float value){
        float mul = (float) Math.round(value*pow);
        return mul/pow;
    }
}
