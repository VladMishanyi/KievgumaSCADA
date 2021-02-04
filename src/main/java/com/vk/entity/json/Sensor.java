package com.vk.entity.json;

import org.springframework.stereotype.Component;

@Component
public class Sensor {
    private String value_type;
    private String value;

    public Sensor() {
    }

    public String getValue_type() {
        return value_type;
    }

    public void setValue_type(String value_type) {
        this.value_type = value_type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "value_type='" + value_type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
