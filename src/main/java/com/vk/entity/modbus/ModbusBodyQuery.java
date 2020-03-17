package com.vk.entity.modbus;

/**
 * Created by KIP-PC99 on 26.11.2018.
 */
public class ModbusBodyQuery<T extends Number> {

    private int queryNumber;

    private T value;

    public ModbusBodyQuery(){}

    public ModbusBodyQuery(int queryNumber, T value){
        this.queryNumber = queryNumber;
        this.value = value;
    }

    public int getQueryNumber() {
        return queryNumber;
    }

    public void setQueryNumber(int queryNumber) {
        this.queryNumber = queryNumber;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
