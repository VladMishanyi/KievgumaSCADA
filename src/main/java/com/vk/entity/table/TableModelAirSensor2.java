package com.vk.entity.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "air_sensor2")
public class TableModelAirSensor2 extends TableModel{

    @Column(name = "SDS_P1", columnDefinition = "float default 0")
    private Float SDS_P1 = 0F;

    @Column(name = "SDS_P2", columnDefinition = "float default 0")
    private Float SDS_P2 = 0F;

    @Column(name = "BME280_temperature", columnDefinition = "float default 0")
    private Float BME280_temperature = 0F;

    @Column(name = "BME280_humidity", columnDefinition = "float default 0")
    private Float BME280_humidity = 0F;

    @Column(name = "BME280_pressure", columnDefinition = "float default 0")
    private Float BME280_pressure = 0F;

    @Column(name = "NH3", columnDefinition = "float default 0")
    private Float NH3 = 0F;

    @Column(name = "CO", columnDefinition = "float default 0")
    private Float CO = 0F;

    @Column(name = "NO2", columnDefinition = "float default 0")
    private Float NO2 = 0F;

    @Column(name = "NH3_raw", columnDefinition = "float default 0")
    private Float NH3_raw = 0F;

    @Column(name = "CO_raw", columnDefinition = "float default 0")
    private Float CO_raw = 0F;

    @Column(name = "NO2_raw", columnDefinition = "float default 0")
    private Float NO2_raw = 0F;

    public TableModelAirSensor2() {
    }

    public Float getSDS_P1() {
        return SDS_P1;
    }

    public void setSDS_P1(Float SDS_P1) {
        this.SDS_P1 = SDS_P1;
    }

    public Float getSDS_P2() {
        return SDS_P2;
    }

    public void setSDS_P2(Float SDS_P2) {
        this.SDS_P2 = SDS_P2;
    }

    public Float getBME280_temperature() {
        return BME280_temperature;
    }

    public void setBME280_temperature(Float BME280_temperature) {
        this.BME280_temperature = BME280_temperature;
    }

    public Float getBME280_humidity() {
        return BME280_humidity;
    }

    public void setBME280_humidity(Float BME280_humidity) {
        this.BME280_humidity = BME280_humidity;
    }

    public Float getBME280_pressure() {
        return BME280_pressure;
    }

    public void setBME280_pressure(Float BME280_pressure) {
        this.BME280_pressure = BME280_pressure;
    }

    public Float getNH3() {
        return NH3;
    }

    public void setNH3(Float NH3) {
        this.NH3 = NH3;
    }

    public Float getCO() {
        return CO;
    }

    public void setCO(Float CO) {
        this.CO = CO;
    }

    public Float getNO2() {
        return NO2;
    }

    public void setNO2(Float NO2) {
        this.NO2 = NO2;
    }

    public Float getNH3_raw() {
        return NH3_raw;
    }

    public void setNH3_raw(Float NH3_raw) {
        this.NH3_raw = NH3_raw;
    }

    public Float getCO_raw() {
        return CO_raw;
    }

    public void setCO_raw(Float CO_raw) {
        this.CO_raw = CO_raw;
    }

    public Float getNO2_raw() {
        return NO2_raw;
    }

    public void setNO2_raw(Float NO2_raw) {
        this.NO2_raw = NO2_raw;
    }

    @Override
    public boolean equals(Object object) {
        boolean result = super.equals(object);
        if (result){
            TableModelAirSensor2 that = (TableModelAirSensor2) object;
            result = SDS_P1.equals(that.SDS_P1) &&
                    SDS_P2.equals(that.SDS_P2) &&
                    BME280_temperature.equals(that.BME280_temperature) &&
                    BME280_humidity.equals(that.BME280_humidity) &&
                    BME280_pressure.equals(that.BME280_pressure) &&
                    NH3.equals(that.NH3) && CO.equals(that.CO) &&
                    NO2.equals(that.NO2) &&
                    NH3_raw.equals(that.NH3_raw) &&
                    CO_raw.equals(that.CO_raw) &&
                    NO2_raw.equals(that.NO2_raw);
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.getDate(), SDS_P1, SDS_P2, BME280_temperature, BME280_humidity, BME280_pressure, NH3, CO, NO2, NH3_raw, CO_raw, NO2_raw);
    }

    @Override
    public String toString() {
        return "TableModelAirSensor2{" +
                super.toString()+
                "SDS_P1=" + SDS_P1 +
                ", SDS_P2=" + SDS_P2 +
                ", BME280_temperature=" + BME280_temperature +
                ", BME280_humidity=" + BME280_humidity +
                ", BME280_pressure=" + BME280_pressure +
                ", NH3=" + NH3 +
                ", CO=" + CO +
                ", NO2=" + NO2 +
                ", NH3_raw=" + NH3_raw +
                ", CO_raw=" + CO_raw +
                ", NO2_raw=" + NO2_raw +
                '}';
    }

    @Override
    public TableModelAirSensor2 clone() {
        return (TableModelAirSensor2) super.clone();
    }
}
