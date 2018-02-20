package com.vk.entity.register;

/**
 * Created by User on 2018-02-20.
 */
public class RegisterInt implements Register<Integer> {

    private Integer value;

    public RegisterInt(){}

    @Override
    public Integer getValue() {
        return this.value;
    }

    @Override
    public void setValue(Integer value) {
        this.value = value;
    }
}
