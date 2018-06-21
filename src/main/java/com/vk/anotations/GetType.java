package com.vk.anotations;

import com.vk.enumeration.StringTypes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by KIP-PC99 on 18.06.2018.
 */
@Target(value = {ElementType.FIELD,
        ElementType.CONSTRUCTOR,
        ElementType.LOCAL_VARIABLE,
        ElementType.METHOD,
        ElementType.PARAMETER})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface GetType {
    StringTypes chosenType() default StringTypes.FLOAT;
}
