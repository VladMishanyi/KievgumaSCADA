package com.vk.threads;

/**
 * Created by User on 2017-06-15.
 */
public class Loop {

    static ModbusThread modbusThread = new ModbusThread("first", new User());
    static ModbusThread modbusThread2 = new ModbusThread("second", new User());

    public static void main(String[] args){
        if (modbusThread.isAlive()) {
            modbusThread2.setControl(true);
        }
        else {
            modbusThread2.setControl(false);
        }
    }
}
