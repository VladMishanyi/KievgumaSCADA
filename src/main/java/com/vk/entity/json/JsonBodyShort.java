package com.vk.entity.json;

import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 19.09.2018.
 */
@Component
public class JsonBodyShort {

    private short value;

    public JsonBodyShort(){}

    public JsonBodyShort(short value) {
        this.value = value;
    }

    public short getValue() {
        return value;
    }

    public void setValue(final short value) {
        this.value = value;
    }
}
