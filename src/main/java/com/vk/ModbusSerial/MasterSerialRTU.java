package com.vk.ModbusSerial;

import com.serotonin.io.serial.SerialParameters;
import com.serotonin.modbus4j.*;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.serotonin.modbus4j.exception.ModbusInitException;
import com.vk.modbus.ModbusFloat;
import com.vk.modbus.ModbusFloatImpl;

import java.util.List;

/**
 * Created by User on 2017-05-15.
 */

public class MasterSerialRTU {

    public static void main(String[] args) throws Exception {

        final ModbusFactory factory = new ModbusFactory();

        final SerialParameters params = new SerialParameters();
//        params.setCommPortId("/dev/ttyUSB0");
        params.setCommPortId("COM3");
        //for windows use COM0
        //for ubuntu use /dev/ttyUSB0
        params.setBaudRate(115200);
        params.setDataBits(8);
        params.setStopBits(1);
        params.setParity(0);

        final ModbusMaster master = factory.createRtuMaster(params);
        master.setTimeout(2000);//1s timeout
        master.setRetries(1);// 10 repeats

        final int slaveAdrr = 16;
        long startTime = 0;

        final ModbusFloat modbusFloat = new ModbusFloatImpl();
        final ModbusLocator modbusLocator0 = new ModbusLocator(16, RegisterRange.HOLDING_REGISTER, 21, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator1 = new ModbusLocator(16, RegisterRange.HOLDING_REGISTER, 29, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator2 = new ModbusLocator(16, RegisterRange.HOLDING_REGISTER, 37, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator3 = new ModbusLocator(16, RegisterRange.HOLDING_REGISTER, 70, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator4 = new ModbusLocator(16, RegisterRange.INPUT_REGISTER, 23, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator5 = new ModbusLocator(16, RegisterRange.INPUT_REGISTER, 28, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator6 = new ModbusLocator(16, RegisterRange.INPUT_REGISTER, 33, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator7 = new ModbusLocator(16, RegisterRange.INPUT_REGISTER, 38, DataType.FOUR_BYTE_FLOAT);

        while (true){
            int index = 0;
            startTime = System.currentTimeMillis();
            BatchRead batch = new BatchRead();
            List<Float> list = modbusFloat.readDataFromModBus(master, 16, batch,false,
                    modbusLocator0,
                    modbusLocator1,
                    modbusLocator2,
                    modbusLocator3/*,
                    modbusLocator4,
                    modbusLocator5,
                    modbusLocator6,
                    modbusLocator7*/);
            for (Float x: list){
                System.out.println("--"+index+"--" +x);
                index++;
            }
            System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime) + "ms");
            System.out.println("----------------------------------------------------------------------------------------");
            Thread.sleep(2000);
        }

    }
}
