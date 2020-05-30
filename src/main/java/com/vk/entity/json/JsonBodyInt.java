package com.vk.entity.json;

import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 15.01.2019.
 */
@Component
public class JsonBodyInt {

    private int value;

    public JsonBodyInt() {
    }

    public JsonBodyInt(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
