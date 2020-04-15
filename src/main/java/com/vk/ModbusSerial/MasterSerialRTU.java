package com.vk.ModbusSerial;

import com.serotonin.modbus4j.*;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.vk.entity.modbus.ModbusMasterSerialModel;
import com.vk.entity.modbus.ModbusMasterTcpModel;
import com.vk.modbus.*;

import java.util.List;

/**
 * Created by User on 2017-05-15.
 */

public class MasterSerialRTU {

    public static void main(String[] args) throws Exception {
        long startTime = 0;
//        final ModbusMasterSerialModel modbusMasterSerialModel3 = new ModbusMasterSerialModel("COM3", 115200, 8, 1, 0, 200, 1);
//        final ModbusMasterSerialModel modbusMasterSerialModel4 = new ModbusMasterSerialModel("COM4", 9600, 8, 1, 0, 200, 1);
//        final ModbusMasterSerialModel modbusMasterSerialModel6 = new ModbusMasterSerialModel("COM6", 9600, 8, 1, 0, 200, 1);
        final ModbusMasterSerialModel modbusMasterSerialModel7 = new ModbusMasterSerialModel("COM6", 9600, 8, 1, 0, 200, 1);
//        final ModbusMasterSerialModel modbusMasterSerialModel19 = new ModbusMasterSerialModel("COM19", 9600, 8, 1, 0, 200, 1);

        final ModbusShort modbusShort = new ModbusShortImpl();
        modbusShort.setUseBorders(false);
        final ModbusInteger modbusInteger = new ModbusIntegerImpl();
        modbusInteger.setUseBorders(false);
        final ModbusLong modbusLong = new ModbusLongImpl();
        modbusLong.setUseBorders(false);
        final ModbusFloat modbusFloat = new ModbusFloatImpl();
        modbusFloat.setUseBorders(false);

        final int SlaveID = 19;

        final ModbusLocator modbusLocator0 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 4105, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator1 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 4107, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator2 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 37, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator3 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 70, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator4 = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 23, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator5 = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 28, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator6 = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 33, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator7 = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 38, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator8 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 28, DataType.FOUR_BYTE_INT_SIGNED);
        final ModbusLocator modbusLocator9 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 28, DataType.FOUR_BYTE_INT_SIGNED);
        final ModbusLocator modbusLocator10 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 28, DataType.FOUR_BYTE_INT_SIGNED);
        final ModbusLocator modbusLocator11 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 28, DataType.FOUR_BYTE_INT_SIGNED);
        final ModbusLocator modbusLocator12 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 28, DataType.FOUR_BYTE_INT_SIGNED);
        final ModbusLocator modbusLocator13 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 256, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator modbusLocator14 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 5, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator modbusLocator15 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 128, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator16 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 130, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator17 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 132, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator18 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 78, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator modbusLocator19 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 79, DataType.TWO_BYTE_INT_SIGNED);

        final ModbusLocator spk0 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 0, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk1 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 2, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk2 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 4, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk3 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 6, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk4 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 8, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk5 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 10, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk6 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 12, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk7 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 14, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk8 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 16, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk9 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 18, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator spk10 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 19, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk11 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 21, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk12 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 23, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator spk13 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 24, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk14 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 26, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk15 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 28, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator spk16 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 29, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk17 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 31, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk18 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 33, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator spk19 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 34, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk20 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 36, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk21 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 38, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator spk22 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 39, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk23 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 41, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk24 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 43, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator spk25 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 44, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk26 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 46, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk27 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 48, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator spk28 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 49, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk29 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 51, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk30 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 53, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator spk31 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 54, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk32 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 56, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk33 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 58, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator spk34 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 59, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk35 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 61, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk36 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 63, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator spk37 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 64, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk38 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 66, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk39 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 68, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator spk40 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 69, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk41 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 71, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk42 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 73, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator spk43 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 74, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk44 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 76, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk45 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 78, DataType.TWO_BYTE_INT_SIGNED);//write number of program here
        final ModbusLocator spk46 = new ModbusLocator(SlaveID, RegisterRange.HOLDING_REGISTER, 79, DataType.TWO_BYTE_INT_SIGNED);//write permission to save program: 2 is read, 1 is write, 0 is not.


        final ModbusLocator spk0_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 0, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk1_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 2, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk2_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 4, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk3_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 6, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk4_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 8, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk5_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 10, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk6_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 12, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk7_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 14, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk8_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 16, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk9_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 18, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator spk10_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 19, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk11_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 21, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk12_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 23, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator spk13_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 24, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk14_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 26, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk15_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 28, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator spk16_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 29, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk17_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 31, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk18_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 33, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator spk19_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 34, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk20_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 36, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk21_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 38, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator spk22_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 39, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk23_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 41, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk24_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 43, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator spk25_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 44, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk26_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 46, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk27_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 48, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator spk28_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 49, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk29_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 51, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk30_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 53, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator spk31_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 54, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk32_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 56, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk33_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 58, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator spk34_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 59, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk35_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 61, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk36_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 63, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator spk37_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 64, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk38_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 66, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk39_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 68, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator spk40_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 69, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk41_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 71, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk42_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 73, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator spk43_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 74, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk44_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 76, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator spk45_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 78, DataType.FOUR_BYTE_FLOAT);//read temperature
        final ModbusLocator spk46_r = new ModbusLocator(SlaveID, RegisterRange.INPUT_REGISTER, 80, DataType.TWO_BYTE_INT_SIGNED);//get program number
/*
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(10.2), spk0);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(11.2), spk1);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(12.2), spk2);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(13.2), spk3);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(14.2), spk4);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(15.2), spk5);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(16.2), spk6);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(17.2), spk7);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(18.2), spk8);

        modbusInteger.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Integer(1), spk9);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(20.2), spk10);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(21.2), spk11);

        modbusInteger.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Integer(2), spk12);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(23.2), spk13);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(24.2), spk14);

        modbusInteger.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Integer(1), spk15);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(26.2), spk16);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(27.2), spk17);

        modbusInteger.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Integer(2), spk18);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(29.2), spk19);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(30.2), spk20);

        modbusInteger.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Integer(1), spk21);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(32.2), spk22);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(33.2), spk23);

        modbusInteger.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Integer(2), spk24);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(35.2), spk25);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(36.2), spk26);

        modbusInteger.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Integer(1), spk27);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(38.2), spk28);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(39.2), spk29);

        modbusInteger.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Integer(2), spk30);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(41.2), spk31);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(42.2), spk32);

        modbusInteger.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Integer(1), spk33);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(44.2), spk34);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(45.2), spk35);

        modbusInteger.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Integer(2), spk36);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(47.2), spk37);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(48.2), spk38);

        modbusInteger.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Integer(1), spk39);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(50.2), spk40);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(51.2), spk41);

        modbusInteger.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Integer(2), spk42);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(53.2), spk43);
        modbusFloat.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Float(54.2), spk44);

        modbusInteger.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Integer(5), spk45);
        modbusInteger.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Integer(2), spk46);
        modbusInteger.writeDataToModBus(modbusMasterSerialModel7, SlaveID, new Integer(0), spk46);
*/

        int i = 0;
        while (true){
            System.out.println("----"+i);
            startTime = System.currentTimeMillis();
            BatchRead<Integer> batchRead = new BatchRead<>();
            List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialModel7, SlaveID, batchRead, false,
                    spk0_r,
                    spk1_r,
                    spk2_r,
                    spk3_r,
                    spk4_r,
                    spk5_r,
                    spk6_r,
                    spk7_r,
                    spk8_r,
//                    spk9_r,
                    spk10_r,
                    spk11_r,
//                    spk12_r,
                    spk13_r,
                    spk14_r,
//                    spk15_r,
                    spk16_r,
                    spk17_r,
//                    spk18_r,
                    spk19_r,
                    spk20_r,
//                    spk21_r,
                    spk22_r,
                    spk23_r,
//                    spk24_r,
                    spk25_r,
                    spk26_r,
//                    spk27_r,
                    spk28_r,
                    spk29_r,
//                    spk30_r,
                    spk31_r,
                    spk32_r,
//                    spk33_r,
                    spk34_r,
                    spk35_r,
//                    spk36_r,
                    spk37_r,
                    spk38_r,
//                    spk39_r,
                    spk40_r,
                    spk41_r,
//                    spk42_r,
                    spk43_r,
                    spk44_r,
                    spk45_r
//                    spk46_r
            );
            List<Short> listShort = modbusShort.readDataFromModBus(modbusMasterSerialModel7, SlaveID, batchRead, false,
//                    spk0_r,
//                    spk1_r,
//                    spk2_r,
//                    spk3_r,
//                    spk4_r,
//                    spk5_r,
//                    spk6_r,
//                    spk7_r,
//                    spk8_r,
                    spk9_r,
//                    spk10_r,
//                    spk11_r,
                    spk12_r,
//                    spk13_r,
//                    spk14_r,
                    spk15_r,
//                    spk16_r,
//                    spk17_r,
                    spk18_r,
//                    spk19_r,
//                    spk20_r,
                    spk21_r,
//                    spk22_r,
//                    spk23_r,
                    spk24_r,
//                    spk25_r,
//                    spk26_r,
                    spk27_r,
//                    spk28_r,
//                    spk29_r,
                    spk30_r,
//                    spk31_r,
//                    spk32_r,
                    spk33_r,
//                    spk34_r,
//                    spk35_r,
                    spk36_r,
//                    spk37_r,
//                    spk38_r,
                    spk39_r,
//                    spk40_r,
//                    spk41_r,
                    spk42_r,
//                    spk43_r,
//                    spk44_r,
//                    spk45_r
                    spk46_r
            );
            System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime) + "ms");
            listFloat.stream().forEachOrdered(System.out::println);
            listShort.stream().forEachOrdered(System.out::println);
            System.out.println("----------------------------------------------------------------------------------------");
            Thread.sleep(5000);
            i++;
        }
    }
}
