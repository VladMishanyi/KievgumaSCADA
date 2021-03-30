package com.vk.entity.converter;

import com.vk.entity.json.JsonBodyAirSensor;
import com.vk.entity.json.Sensor;
import com.vk.entity.table.TableModelAirSensor3;
import com.vk.entity.table.TableModelAirSensor4;
import com.vk.lib.ObjectValidator;

import java.time.LocalDateTime;

public class DeviceToTableImplAirSensor4 implements DeviceToTableAirSensor4{

    @Override
    public TableModelAirSensor4 convert(JsonBodyAirSensor jsonBodyAirSensor) {
        TableModelAirSensor4 tableModel = null;
        if (ObjectValidator.isNotNull(jsonBodyAirSensor)){
            Sensor[] sensors = jsonBodyAirSensor.getSensordatavalues();
            tableModel = new TableModelAirSensor4();
            tableModel.setDate(LocalDateTime.now());

            for(Sensor sensor : sensors){
                switch (sensor.getValue_type()){
                    case "SDS_P1": tableModel.setSDS_P1(Float.parseFloat(sensor.getValue())); break;
                    case "SDS_P2": tableModel.setSDS_P2(Float.parseFloat(sensor.getValue())); break;
                    case "BME280_temperature": tableModel.setBME280_temperature(Float.parseFloat(sensor.getValue())); break;
                    case "BME280_humidity": tableModel.setBME280_humidity(Float.parseFloat(sensor.getValue())); break;
                    case "BME280_pressure": tableModel.setBME280_pressure(Float.parseFloat(sensor.getValue())*0.00750062F); break;
                    case "NH3": tableModel.setNH3(Float.parseFloat(sensor.getValue())*1000F); break;
                    case "CO": tableModel.setCO(Float.parseFloat(sensor.getValue())*1000F); break;
                    case "NO2": tableModel.setNO2(Float.parseFloat(sensor.getValue())*1000F); break;
                    case "NH3-raw": tableModel.setNH3_raw(Float.parseFloat(sensor.getValue())); break;
                    case "CO-raw": tableModel.setCO_raw(Float.parseFloat(sensor.getValue())); break;
                    case "NO2-raw": tableModel.setNO2_raw(Float.parseFloat(sensor.getValue())); break;
                    default: break;
                }
            }
        }
        return tableModel;
    }
}
