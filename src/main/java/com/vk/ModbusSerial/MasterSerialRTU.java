package com.vk.ModbusSerial;

import com.serotonin.modbus4j.*;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.vk.entity.modbus.ModbusMasterSerialModel;
import com.vk.modbus.*;

import java.util.List;

/**
 * Created by User on 2017-05-15.
 */

public class MasterSerialRTU {

    public static void main(String[] args) throws Exception {
        long startTime = 0;
        final ModbusMasterSerialModel modbusMasterSerialModel3 =
                new ModbusMasterSerialModel("COM3", 115200, 8, 1, 0, 200, 1);
        final ModbusMasterSerialModel modbusMasterSerialModel4 =
                new ModbusMasterSerialModel("COM4", 9600, 8, 1, 0, 500, 1);
        final ModbusMasterSerialModel modbusMasterSerialModel6 =
                new ModbusMasterSerialModel("COM6", 9600, 8, 1, 0, 500, 1);
        final ModbusMasterSerialModel modbusMasterSerialModel7 =
                new ModbusMasterSerialModel("COM7", 9600, 8, 1, 0, 500, 1);
        final ModbusShort modbusShort = new ModbusShortImpl();
        final ModbusInteger modbusInteger = new ModbusIntegerImpl();
        final ModbusLong modbusLong = new ModbusLongImpl();
        final ModbusFloat modbusFloat = new ModbusFloatImpl();

        final ModbusLocator modbusLocator0 = new ModbusLocator(16, RegisterRange.HOLDING_REGISTER, 4105, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator1 = new ModbusLocator(16, RegisterRange.HOLDING_REGISTER, 4107, DataType.FOUR_BYTE_FLOAT);
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
        final ModbusLocator modbusLocator13 = new ModbusLocator(1, RegisterRange.HOLDING_REGISTER, 0, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator modbusLocator14 = new ModbusLocator(16, RegisterRange.HOLDING_REGISTER, 5, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator modbusLocator15 = new ModbusLocator(18, RegisterRange.HOLDING_REGISTER, 128, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator16 = new ModbusLocator(18, RegisterRange.HOLDING_REGISTER, 130, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator17 = new ModbusLocator(18, RegisterRange.HOLDING_REGISTER, 132, DataType.FOUR_BYTE_FLOAT);

        int i = 0;
        while (true){
            startTime = System.currentTimeMillis();
            BatchRead batchRead = new BatchRead();
            modbusFloat.readDataFromModBus(modbusMasterSerialModel3, 16 , batchRead, false, modbusLocator1);
            System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime) + "ms");
            System.out.println("----------------------------------------------------------------------------------------");
            Thread.sleep(2000);
        }
    }
}
