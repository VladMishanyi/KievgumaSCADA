package com.vk.ModbusSerial;

import com.serotonin.io.serial.SerialParameters;
import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.BatchResults;
import com.serotonin.modbus4j.ModbusFactory;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.serotonin.modbus4j.exception.ModbusInitException;

/**
 * Created by User on 2017-05-15.
 */

public class MasterSerialRTU {

    public static void main(String[] args) throws Exception {

        ModbusFactory factory = new ModbusFactory();

        SerialParameters params = new SerialParameters();
//        params.setCommPortId("/dev/ttyUSB0");
        params.setCommPortId("COM3");
        //for windows use COM0
        //for ubuntu use /dev/ttyUSB0
        params.setBaudRate(115200);
        params.setDataBits(8);
        params.setStopBits(1);
        params.setParity(0);

        ModbusMaster master = factory.createRtuMaster(params);
        master.setTimeout(2000);//1s timeout
        master.setRetries(1);// 10 repeats

        int slaveAdrr = 20;
        long startTime = 0;


        while (true){
            // Don't start if the RTU master can't be initialized.
            try {
                startTime = System.currentTimeMillis();
                master.init();
                System.out.println("ModBus Listen slave address №"+slaveAdrr+"--"+master.testSlaveNode(slaveAdrr));
            }
            catch (ModbusInitException e) {
                System.out.println("ModBus Init problem, slave address №"+slaveAdrr+"--"+e.getMessage());
            }

            try {
                // Set the point value
//        master.setValue(loc, 1800);

                // Get the point value
//                byte in0 = 0;
//                byte in1 = 1;
//                byte in2 = 2;
//                byte in3 = 3;
//                byte in4 = 4;
//                byte in5 = 5;
//                byte in6 = 6;
//                byte in7 = 7;
//                byte in8 = 8;
//                byte in9 = 9;
//                byte in10 = 10;
//                byte in11 = 11;
//                byte in12 = 12;
//                byte in13 = 13;
//                byte in14 = 14;
//                byte in15 = 15;

//                boolean output0 = master.getValue(1, RegisterRange.HOLDING_REGISTER, 0, in0);
//                boolean output1 = master.getValue(1, RegisterRange.HOLDING_REGISTER, 0, in1);
//                boolean output2 = master.getValue(1, RegisterRange.HOLDING_REGISTER, 0, in2);
//                boolean output3 = master.getValue(1, RegisterRange.HOLDING_REGISTER, 0, in3);
//                boolean output4 = master.getValue(1, RegisterRange.HOLDING_REGISTER, 0, in4);
//                boolean output5 = master.getValue(1, RegisterRange.HOLDING_REGISTER, 0, in5);
//                boolean output6 = master.getValue(1, RegisterRange.HOLDING_REGISTER, 0, in6);
//                boolean output7 = master.getValue(1, RegisterRange.HOLDING_REGISTER, 0, in7);
//                boolean output8 = master.getValue(1, RegisterRange.HOLDING_REGISTER, 0, in8);
//                boolean output9 = master.getValue(1, RegisterRange.HOLDING_REGISTER, 0, in9);
//                boolean output10 = master.getValue(1, RegisterRange.HOLDING_REGISTER, 0, in10);
//                boolean output11 = master.getValue(1, RegisterRange.HOLDING_REGISTER, 0, in11);
//                boolean output12 = master.getValue(1, RegisterRange.HOLDING_REGISTER, 0, in12);
//                boolean output13 = master.getValue(1, RegisterRange.HOLDING_REGISTER, 0, in13);
//                boolean output14 = master.getValue(1, RegisterRange.HOLDING_REGISTER, 0, in14);
//                boolean output15 = master.getValue(1, RegisterRange.HOLDING_REGISTER, 0, in15);
//
//                short value1 = (short) master.getValue(16, RegisterRange.HOLDING_REGISTER, 1, DataType.TWO_BYTE_INT_SIGNED);
//                short value2 = (short) master.getValue(16, RegisterRange.HOLDING_REGISTER, 2, DataType.TWO_BYTE_INT_SIGNED);
//                float value3 = (float) master.getValue(16, RegisterRange.HOLDING_REGISTER, 4105, DataType.FOUR_BYTE_FLOAT);
//                float value4 = (float) master.getValue(16, RegisterRange.HOLDING_REGISTER, 4107, DataType.FOUR_BYTE_FLOAT);
//                long value5 = (long) master.getValue(1, RegisterRange.HOLDING_REGISTER, 4, DataType.FOUR_BYTE_INT_UNSIGNED_SWAPPED);

                BatchRead batchRead = new BatchRead();
//                batchRead.addLocator(1,slaveAdrr, RegisterRange.HOLDING_REGISTER, 1, DataType.TWO_BYTE_INT_SIGNED);
//                batchRead.addLocator(2,slaveAdrr, RegisterRange.HOLDING_REGISTER, 2, DataType.TWO_BYTE_INT_SIGNED);
                batchRead.addLocator(3,slaveAdrr, RegisterRange.HOLDING_REGISTER, 1200, DataType.FOUR_BYTE_FLOAT_SWAPPED);
                batchRead.addLocator(4,slaveAdrr, RegisterRange.HOLDING_REGISTER , 1202, DataType.FOUR_BYTE_FLOAT_SWAPPED);
                batchRead.addLocator(5,slaveAdrr, RegisterRange.HOLDING_REGISTER , 1204, DataType.FOUR_BYTE_FLOAT_SWAPPED);
                batchRead.addLocator(6,slaveAdrr, RegisterRange.HOLDING_REGISTER , 1206, DataType.FOUR_BYTE_FLOAT_SWAPPED);

                BatchResults batchResults =  master.send(batchRead);
//                int value1 = (short) batchResults.getValue(1);
//                int value2 = (short) batchResults.getValue(2);
                float value3 = (float) batchResults.getValue(3);
                float value4 = (float) batchResults.getValue(4);
                float value5 = (float) batchResults.getValue(5);
                float value6 = (float) batchResults.getValue(6);

//                System.out.println("output0 :" + output0);
//                System.out.println("output1 :" + output1);
//                System.out.println("output2 :" + output2);
//                System.out.println("output3 :" + output3);
//                System.out.println("output4 :" + output4);
//                System.out.println("output5 :" + output5);
//                System.out.println("output6 :" + output6);
//                System.out.println("output7 :" + output7);
//                System.out.println("output8 :" + output8);
//                System.out.println("output9 :" + output9);
//                System.out.println("output10 :" + output10);
//                System.out.println("output11 :" + output11);
//                System.out.println("output12 :" + output12);
//                System.out.println("output13 :" + output13);
//                System.out.println("output14" + output14);
//                System.out.println("output15" + output15);
//
//                System.out.println("value1 :" + value1);
//                System.out.println("value2 :" + value2);
                System.out.println("value3 :" + value3);
                System.out.println("value4 :" + value4);
                System.out.println("value5 :" + value5);
                System.out.println("value6 :" + value6);

            }
            catch (Exception e){
                System.out.println("ModBus Transport problem, slave address №"+slaveAdrr+"--"+e.getMessage());
            }
            finally {
                master.destroy();
                System.out.println("ModBus Close connection, slave address №"+slaveAdrr);
                System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime) + "ms");
                System.out.println("----------------------------------------------------------------------------------------");
                Thread.sleep(1000);
            }
        }
    }
}
