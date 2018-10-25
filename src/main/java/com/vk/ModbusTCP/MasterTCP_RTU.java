package com.vk.ModbusTCP;

import com.serotonin.modbus4j.*;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.serotonin.modbus4j.exception.ModbusInitException;
import com.serotonin.modbus4j.ip.IpParameters;
import com.serotonin.modbus4j.msg.ModbusRequest;


/**
 * Created by User on 2017-05-18.
 */
public class MasterTCP_RTU {

    public static void main(String[] args) throws Exception{

        ModbusFactory factory = new ModbusFactory();

        IpParameters params = new IpParameters();
        params.setHost("192.168.9.9");
        params.setPort(1991);

        ModbusMaster master = factory.createTcpMaster(params, true);
        master.setTimeout(1000);
        master.setRetries(0);



        // Don't start if the RTU master can't be initialized.
        try {
            master.init();
            System.out.println(master.testSlaveNode(1));
        }
        catch (ModbusInitException e) {
            System.out.println( "Modbus Master Init Error: " + e.getMessage());
            return;
        }

        try {
            while (true){
                long start = System.currentTimeMillis();
                byte in0 = 0;
                byte in1 = 1;
                byte in2 = 2;
                byte in3 = 3;
                byte in4 = 4;
                byte in5 = 5;
                byte in6 = 6;
                byte in7 = 7;
                byte in8 = 8;
                byte in9 = 9;
                byte in10 = 10;
                byte in11 = 11;
                byte in12 = 12;
                byte in13 = 13;
                byte in14 = 14;
                byte in15 = 15;

                final BatchRead batchRead = new BatchRead();
                batchRead.addLocator(0.0,1, RegisterRange.HOLDING_REGISTER, 0, in0);
                batchRead.addLocator(0.1,1, RegisterRange.HOLDING_REGISTER, 0, in1);
                batchRead.addLocator(0.2,1, RegisterRange.HOLDING_REGISTER, 0, in2);
                batchRead.addLocator(0.3,1, RegisterRange.HOLDING_REGISTER, 0, in3);
                batchRead.addLocator(0.4,1, RegisterRange.HOLDING_REGISTER, 0, in4);
                batchRead.addLocator(0.5,1, RegisterRange.HOLDING_REGISTER, 0, in5);
                batchRead.addLocator(0.6,1, RegisterRange.HOLDING_REGISTER, 0, in6);
                batchRead.addLocator(0.7,1, RegisterRange.HOLDING_REGISTER, 0, in7);
                batchRead.addLocator(0.8,1, RegisterRange.HOLDING_REGISTER, 0, in8);
                batchRead.addLocator(0.9,1, RegisterRange.HOLDING_REGISTER, 0, in9);
                batchRead.addLocator(0.10,1, RegisterRange.HOLDING_REGISTER, 0, in10);
                batchRead.addLocator(0.11,1, RegisterRange.HOLDING_REGISTER, 0, in11);
                batchRead.addLocator(0.12,1, RegisterRange.HOLDING_REGISTER, 0, in12);
                batchRead.addLocator(0.13,1, RegisterRange.HOLDING_REGISTER, 0, in13);
                batchRead.addLocator(0.14,1, RegisterRange.HOLDING_REGISTER, 0, in14);
                batchRead.addLocator(0.15,1, RegisterRange.HOLDING_REGISTER, 0, in15);
                batchRead.addLocator(1,1, RegisterRange.HOLDING_REGISTER, 1, DataType.TWO_BYTE_INT_UNSIGNED);
                batchRead.addLocator(2,1, RegisterRange.HOLDING_REGISTER, 2, DataType.FOUR_BYTE_FLOAT_SWAPPED);
                batchRead.addLocator(4,1, RegisterRange.HOLDING_REGISTER, 4, DataType.FOUR_BYTE_INT_UNSIGNED_SWAPPED);

                final BatchResults batchResults =  master.send(batchRead);
                boolean output0 = (boolean) batchResults.getValue(0.0);
                boolean output1 = (boolean) batchResults.getValue(0.1);
                boolean output2 = (boolean) batchResults.getValue(0.2);
                boolean output3 = (boolean) batchResults.getValue(0.3);
                boolean output4 = (boolean) batchResults.getValue(0.4);
                boolean output5 = (boolean) batchResults.getValue(0.5);
                boolean output6 = (boolean) batchResults.getValue(0.6);
                boolean output7 = (boolean) batchResults.getValue(0.7);
                boolean output8 = (boolean) batchResults.getValue(0.8);
                boolean output9 = (boolean) batchResults.getValue(0.9);
                boolean output10 = (boolean) batchResults.getValue(0.10);
                boolean output11 = (boolean) batchResults.getValue(0.11);
                boolean output12 = (boolean) batchResults.getValue(0.12);
                boolean output13 = (boolean) batchResults.getValue(0.13);
                boolean output14 = (boolean) batchResults.getValue(0.14);
                boolean output15 = (boolean) batchResults.getValue(0.15);

                final int value1 = (int) batchResults.getValue(1);
                final float value2 = (float) batchResults.getValue(2);
                final long value3 = (long) batchResults.getValue(4);

                System.out.println("output0 :" + output0);
                System.out.println("output1 :" + output1);
                System.out.println("output2 :" + output2);
                System.out.println("output3 :" + output3);
                System.out.println("output4 :" + output4);
                System.out.println("output5 :" + output5);
                System.out.println("output6 :" + output6);
                System.out.println("output7 :" + output7);
                System.out.println("output8 :" + output8);
                System.out.println("output9 :" + output9);
                System.out.println("output10 :" + output10);
                System.out.println("output11 :" + output11);
                System.out.println("output12 :" + output12);
                System.out.println("output13 :" + output13);
                System.out.println("output14" + output14);
                System.out.println("output15" + output15);

                System.out.println("value1 :" + value1);
                System.out.println("value2 :" + value2);
                System.out.println("value3 :" + value3);

                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("Time elapsed: " + (System.currentTimeMillis() - start) + "ms");
                Thread.sleep(1000);
            }
        }
        finally {
            master.destroy();
        }
    }
}
