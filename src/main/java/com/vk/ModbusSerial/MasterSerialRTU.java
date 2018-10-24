package com.vk.ModbusSerial;

import com.serotonin.io.serial.SerialParameters;
import com.serotonin.modbus4j.*;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.serotonin.modbus4j.exception.ModbusInitException;
import com.vk.modbus.*;

import java.util.List;

/**
 * Created by User on 2017-05-15.
 */

public class MasterSerialRTU {

    public static void main(String[] args) throws Exception {

        final ModbusFactory factory = new ModbusFactory();

        final SerialParameters params = new SerialParameters();
//        params.setCommPortId("/dev/ttyUSB0");
//        params.setCommPortId("COM3");
//        params.setCommPortId("COM4");
        params.setCommPortId("COM7");
        //for windows use COM0
        //for ubuntu use /dev/ttyUSB0
        params.setBaudRate(115200);
        params.setDataBits(8);
        params.setStopBits(1);
        params.setParity(0);

        final ModbusMaster master = factory.createRtuMaster(params);
        master.setTimeout(1000);//1s timeout
        master.setRetries(1);// 1 repeats
        long startTime = 0;

        final ModbusFloat modbusFloat = new ModbusFloatImpl();
        final ModbusShort modbusShort = new ModbusShortImpl();
        final ModbusInteger modbusInteger = new ModbusIntegerImpl();
        final ModbusLocator modbusLocator0 = new ModbusLocator(16, RegisterRange.HOLDING_REGISTER, 21, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator1 = new ModbusLocator(16, RegisterRange.HOLDING_REGISTER, 29, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator2 = new ModbusLocator(16, RegisterRange.HOLDING_REGISTER, 37, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator3 = new ModbusLocator(16, RegisterRange.HOLDING_REGISTER, 70, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator4 = new ModbusLocator(16, RegisterRange.INPUT_REGISTER, 23, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator5 = new ModbusLocator(16, RegisterRange.INPUT_REGISTER, 28, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator6 = new ModbusLocator(16, RegisterRange.INPUT_REGISTER, 33, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator7 = new ModbusLocator(16, RegisterRange.INPUT_REGISTER, 38, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator8 = new ModbusLocator(24, RegisterRange.HOLDING_REGISTER, 28, DataType.FOUR_BYTE_INT_SIGNED);
        final ModbusLocator modbusLocator9 = new ModbusLocator(40, RegisterRange.HOLDING_REGISTER, 28, DataType.FOUR_BYTE_INT_SIGNED);
        final ModbusLocator modbusLocator10 = new ModbusLocator(72, RegisterRange.HOLDING_REGISTER, 28, DataType.FOUR_BYTE_INT_SIGNED);
        final ModbusLocator modbusLocator11 = new ModbusLocator(64, RegisterRange.HOLDING_REGISTER, 28, DataType.FOUR_BYTE_INT_SIGNED);
        final ModbusLocator modbusLocator12 = new ModbusLocator(48, RegisterRange.HOLDING_REGISTER, 28, DataType.FOUR_BYTE_INT_SIGNED);

        while (true){
            int index = 0;
            startTime = System.currentTimeMillis();
            BatchRead batch = new BatchRead();
            List<Integer> list = modbusInteger.readDataFromModBus(master, 24, batch,false,
                    /*modbusLocator0,
                    modbusLocator1,
                    modbusLocator2,
                    modbusLocator3,
                    modbusLocator4,
                    modbusLocator5,
                    modbusLocator6,
                    modbusLocator7*/
                    modbusLocator8);

            for (Integer x: list){
                System.out.println("--"+index+"--" +x);
                index++;
            }
            System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime) + "ms");
            System.out.println("----------------------------------------------------------------------------------------");
            Thread.sleep(2000);
        }
    }
}
