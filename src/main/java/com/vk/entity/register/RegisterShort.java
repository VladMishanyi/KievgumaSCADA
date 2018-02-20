package com.vk.entity.register;

/**
 * Created by User on 2018-02-20.
 */
public class RegisterShort implements Register<Short>{

    private Short value;

    public RegisterShort(){}

    @Override
    public Short getValue() {
        return this.value;
    }

    @Override
    public void setValue(Short value) {
        this.value = value;
    }
}
