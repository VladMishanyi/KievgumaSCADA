package com.vk.entity.modbus;

/**
 * Created by KIP-PC99 on 26.11.2018.
 */
public class ModbusBodyQuery {

    private int queryNumber;

    private byte valueByte;

    private short valueShort;

    private int valueInt;

    private float valueFloat;

    private String valueString;

    public ModbusBodyQuery(){}

    public ModbusBodyQuery(int queryNumber, byte valueByte){
        this.queryNumber = queryNumber;
        this.valueByte = valueByte;
    }

    public ModbusBodyQuery(int queryNumber, short valueShort){
        this.queryNumber = queryNumber;
        this.valueShort = valueShort;
    }

    public ModbusBodyQuery(int queryNumber, int valueInt){
        this.queryNumber = queryNumber;
        this.valueInt = valueInt;
    }

    public ModbusBodyQuery(int queryNumber, float valueFloat){
        this.queryNumber = queryNumber;
        this.valueFloat = valueFloat;
    }

    public int getQueryNumber() {
        return queryNumber;
    }

    public void setQueryNumber(int queryNumber) {
        this.queryNumber = queryNumber;
    }

    public byte getValueByte() {
        return valueByte;
    }

    public void setValueByte(byte valueByte) {
        this.valueByte = valueByte;
    }

    public short getValueShort() {
        return valueShort;
    }

    public void setValueShort(short valueShort) {
        this.valueShort = valueShort;
    }

    public int getValueInt() {
        return valueInt;
    }

    public void setValueInt(int valueInt) {
        this.valueInt = valueInt;
    }

    public float getValueFloat() {
        return valueFloat;
    }

    public void setValueFloat(float valueFloat) {
        this.valueFloat = valueFloat;
    }

    public String getValueString() {
        return valueString;
    }

    public void setValueString(String valueString) {
        this.valueString = valueString;
    }
}
