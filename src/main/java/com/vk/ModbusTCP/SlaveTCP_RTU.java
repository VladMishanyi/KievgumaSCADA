package com.vk.ModbusTCP;

import com.serotonin.modbus4j.BasicProcessImage;
import com.serotonin.modbus4j.ModbusFactory;
import com.serotonin.modbus4j.ModbusSlaveSet;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.exception.ModbusInitException;

/**
 * Created by vlad on 19.05.17.
 */
public class SlaveTCP_RTU {

    public static void main(String[] args){

        final ModbusFactory factory = new ModbusFactory();

        final ModbusSlaveSet slave = factory.createTcpSlave(true);

        final BasicProcessImage processImage = new BasicProcessImage(1);//slave addres
        processImage.setHoldingRegister(0, DataType.TWO_BYTE_INT_UNSIGNED, 65535);

        try {
            slave.start();
        }
        catch (ModbusInitException e) {
            System.out.println( "Modbus Master Init Error: " + e.getMessage());
            return;
        }

        try {
            slave.addProcessImage(processImage);
        }
        finally {
            slave.stop();
        }
    }
}
