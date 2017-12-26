package com.vk.util;

import com.serotonin.io.serial.SerialParameters;
import com.serotonin.modbus4j.ModbusFactory;
import com.serotonin.modbus4j.ModbusMaster;

/**
 * Created by KIP on 29.11.2017.
 */
public class ModbusFactoryMaster1Impl implements ModbusFactoryMaster1 {

    @Override
    public ModbusMaster getModbusMaster1(){
        ModbusFactory factory = new ModbusFactory();
        SerialParameters params = new SerialParameters();
        params.setCommPortId("COM3");
        //for windows use COM0
        //for ubuntu use /dev/ttyUSB0
        params.setBaudRate(9600);
        params.setDataBits(8);
        params.setStopBits(1);
        params.setParity(0);
        ModbusMaster master = factory.createRtuMaster(params);
        master.setTimeout(1000);
        master.setRetries(1);
        return master;
    }
}
