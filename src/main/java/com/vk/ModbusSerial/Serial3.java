package com.vk.ModbusSerial;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusLocator;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.vk.entity.modbus.ModbusMasterSerialModel;
import com.vk.modbus.ModbusFloat;
import com.vk.modbus.ModbusFloatImpl;

/**
 * Created by KIP-PC99 on 03.12.2018.
 */
public class Serial3 extends Thread{

    final ModbusMasterSerialModel modbusMasterSerialModel3 = new ModbusMasterSerialModel("COM3", 9600, 8, 1, 0, 500, 1);
    final ModbusLocator modbusLocator17 = new ModbusLocator(18, RegisterRange.HOLDING_REGISTER, 132, DataType.FOUR_BYTE_FLOAT);
    final ModbusFloat modbusFloat = new ModbusFloatImpl();

    public Serial3(){
        this.start();
    }
    @Override
    public void run(){
        while (!this.isInterrupted()){
            BatchRead<Integer> batch = new BatchRead<>();
            modbusFloat.readDataFromModBus(modbusMasterSerialModel3, 18,false, modbusLocator17);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.getMessage();
            }
        }
    }
}
