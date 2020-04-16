package com.vk.entity.json;

import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 19.09.2018.
 */
@Component
public class JsonBodyFloat {

    private float value;

    public JsonBodyFloat(){}

    public JsonBodyFloat(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    public void setValue(final float value) {
        this.value = value;
    }
}
