package com.vk.entity.json;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class JsonBodyAirSensor {
    private String esp8266id;
    private String software_version;
    private Sensor[] sensordatavalues;

    public JsonBodyAirSensor() {
    }

    public String getEsp8266id() {
        return esp8266id;
    }

    public void setEsp8266id(String esp8266id) {
        this.esp8266id = esp8266id;
    }

    public String getSoftware_version() {
        return software_version;
    }

    public void setSoftware_version(String software_version) {
        this.software_version = software_version;
    }

    public Sensor[] getSensordatavalues() {
        return sensordatavalues;
    }

    public void setSensordatavalues(Sensor[] sensordatavalues) {
        this.sensordatavalues = sensordatavalues;
    }

    @Override
    public String toString() {
        return "DeviceAirSensor{" +
                "esp8266id='" + esp8266id + '\'' +
                ", software_version='" + software_version + '\'' +
                ", sensordatavalues=" + Arrays.toString(sensordatavalues) +
                '}';
    }
}
