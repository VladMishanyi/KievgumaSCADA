package com.vk.entity.register;

/**
 * Created by User on 2018-02-20.
 */
public class RegisterFloat implements Register<Float> {

    private Float value;

    public RegisterFloat(){}

    @Override
    public Float getValue() {
        return this.value;
    }

    @Override
    public void setValue(Float value) {
        this.value = value;
    }
}
