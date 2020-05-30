package com.vk.ModbusTCP;

import com.serotonin.modbus4j.*;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.vk.entity.modbus.ModbusMasterTcpModel;
import com.vk.modbus.*;


/**
 * Created by User on 2017-05-18.
 */
public class MasterTCP_RTU {

    public static void main(String[] args) throws Exception{

        long startTime = 0;
        final ModbusMasterTcpModel modbusMasterTcpModel10 =
                new ModbusMasterTcpModel("192.168.0.10", 502, 500, 1);
        final ModbusMasterTcpModel modbusMasterTcpModel11 =
                new ModbusMasterTcpModel("192.168.0.11", 502, 500, 1);

        final ModbusShort modbusShort = new ModbusShortImpl();
        final ModbusInteger modbusInteger = new ModbusIntegerImpl();
        final ModbusLong modbusLong = new ModbusLongImpl();
        final ModbusFloat modbusFloat = new ModbusFloatImpl();

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
        final ModbusLocator modbusLocator13 = new ModbusLocator(1, RegisterRange.HOLDING_REGISTER, 0, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator modbusLocator14 = new ModbusLocator(16, RegisterRange.HOLDING_REGISTER, 5, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator modbusLocator15 = new ModbusLocator(18, RegisterRange.HOLDING_REGISTER, 128, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator16 = new ModbusLocator(18, RegisterRange.HOLDING_REGISTER, 130, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator17 = new ModbusLocator(18, RegisterRange.HOLDING_REGISTER, 132, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator18 = new ModbusLocator(5, RegisterRange.HOLDING_REGISTER, 0, DataType.FOUR_BYTE_FLOAT_SWAPPED);
        final ModbusLocator modbusLocator19 = new ModbusLocator(5, RegisterRange.HOLDING_REGISTER, 2, DataType.FOUR_BYTE_FLOAT_SWAPPED);
        final ModbusLocator modbusLocator20 = new ModbusLocator(5, RegisterRange.HOLDING_REGISTER, 4, DataType.FOUR_BYTE_FLOAT_SWAPPED);
        final ModbusLocator modbusLocator21 = new ModbusLocator(5, RegisterRange.HOLDING_REGISTER, 6, DataType.FOUR_BYTE_FLOAT_SWAPPED);
        final ModbusLocator modbusLocator22 = new ModbusLocator(5, RegisterRange.HOLDING_REGISTER, 8, DataType.TWO_BYTE_INT_UNSIGNED);
        final ModbusLocator modbusLocator23 = new ModbusLocator(5, RegisterRange.HOLDING_REGISTER, 9, DataType.TWO_BYTE_INT_UNSIGNED);

        while (true){
            startTime = System.currentTimeMillis();
//            BatchRead<Integer> batchRead = new BatchRead<>();

            modbusFloat.readDataFromModBus(modbusMasterTcpModel10, 5 ,false,
                    modbusLocator18,
                    modbusLocator19,
                    modbusLocator20,
                    modbusLocator21);
            modbusInteger.readDataFromModBus(modbusMasterTcpModel10, 5 ,false,
                    modbusLocator22,
                    modbusLocator23);

            modbusFloat.readDataFromModBus(modbusMasterTcpModel11, 5 ,false,
                    modbusLocator18,
                    modbusLocator19,
                    modbusLocator20,
                    modbusLocator21);
            modbusInteger.readDataFromModBus(modbusMasterTcpModel11, 5 ,false,
                    modbusLocator22,
                    modbusLocator23);

            System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime) + "ms");
            System.out.println("----------------------------------------------------------------------------------------");
            Thread.sleep(2000);
        }
    }
}
