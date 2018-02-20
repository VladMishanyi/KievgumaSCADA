package com.vk.entity.register;

/**
 * Created by User on 2018-02-20.
 */
public interface Register<T extends Number> {

    T getValue();

    void setValue(T value);
}
