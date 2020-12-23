package com.vk.ModbusSerial;

import com.serotonin.io.serial.SerialParameters;
import com.serotonin.modbus4j.BasicProcessImage;
import com.serotonin.modbus4j.ModbusFactory;
import com.serotonin.modbus4j.ModbusSlaveSet;
import com.serotonin.modbus4j.base.SlaveAndRange;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.exception.ModbusInitException;

/**
 * Created by vlad on 19.05.17.
 */
public class SlaveSerialRTU {
    public static void main(String[] args) {

        final ModbusFactory factory = new ModbusFactory();

        final SerialParameters params = new SerialParameters();
        params.setCommPortId("COM3");
        params.setPortOwnerName("COM3");
        params.setBaudRate(9600);
        params.setDataBits(8);
        params.setStopBits(1);
        params.setParity(0);

        final ModbusSlaveSet slave = factory.createRtuSlave(params);

        final BasicProcessImage processImage = new BasicProcessImage(19);//slave addres
        processImage.setHoldingRegister(0, DataType.TWO_BYTE_INT_UNSIGNED, 65535);


        try {
            slave.addProcessImage(processImage);
            slave.start();
        }
        catch (ModbusInitException e) {
            System.out.println( "Modbus Master Init Error: " + e.getMessage());
        }
    }
}
