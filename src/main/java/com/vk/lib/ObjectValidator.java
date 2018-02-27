package com.vk.lib;

/**
 * Created by User on 2018-02-27.
 */
public class ObjectValidator {

    private ObjectValidator(){}

    public static boolean isNull(final Object object){
        return (object == null);
    }

    public static boolean isNotNull(final Object object){
        return !isNull(object);
    }
}
