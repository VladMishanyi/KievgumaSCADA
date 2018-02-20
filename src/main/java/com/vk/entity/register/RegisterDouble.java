package com.vk.entity.register;

/**
 * Created by User on 2018-02-20.
 */
public class RegisterDouble implements Register<Double> {

    private Double value;

    @Override
    public Double getValue() {
        return this.value;
    }

    @Override
    public void setValue(Double value) {
        this.value = value;
    }
}
