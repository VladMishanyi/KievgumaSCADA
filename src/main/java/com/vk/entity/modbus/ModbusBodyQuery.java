package com.vk.entity.modbus;

/**
 * Created by KIP-PC99 on 26.11.2018.
 */
public class ModbusBodyQuery {

    private int queryNumber;

    private int value;

    public ModbusBodyQuery(){}

    public ModbusBodyQuery(int queryNumber, int value){
        this.queryNumber = queryNumber;
        this.value = value;
    }

    public int getQueryNumber() {
        return queryNumber;
    }

    public void setQueryNumber(int queryNumber) {
        this.queryNumber = queryNumber;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
