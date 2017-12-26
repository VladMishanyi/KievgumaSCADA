//package com.vk.repository;
//
//import com.serotonin.modbus4j.BatchRead;
//import com.serotonin.modbus4j.BatchResults;
//import com.serotonin.modbus4j.ModbusLocator;
//import com.serotonin.modbus4j.ModbusMaster;
//import com.serotonin.modbus4j.code.DataType;
//import com.serotonin.modbus4j.code.RegisterRange;
//import com.serotonin.modbus4j.exception.ErrorResponseException;
//import com.serotonin.modbus4j.exception.ModbusInitException;
//import com.serotonin.modbus4j.exception.ModbusTransportException;
//import com.vk.entity.PLC;
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
///**
// * Created by User on 2017-05-23.
// */
////@Repository
//public class PLCRepositoryImpl implements PLCRepository{
//
////    @Autowired
////    private ModbusMaster modbusMasterTCP;
//
//    @Autowired
//    private ModbusMaster modbusMasterSerialSecond;
//
////    @PersistenceContext
////    private EntityManager entityManager;
//
//    private final Logger LOGGER = Logger.getLogger(PLCRepositoryImpl.class);
//
//    @Override
//    public String setRegBit(int slaveAdrr, int reg, byte bit, boolean value){
//        String stat = "";
//        try {
//            modbusMasterSerialSecond.init();
//            LOGGER.info("ModBus Listen slave address №"+slaveAdrr+"--"+modbusMasterSerialSecond.testSlaveNode(slaveAdrr));
//        }
//        catch (ModbusInitException e){
////            System.out.println("Modbus init problem :"+e.getMessage());
//            LOGGER.error("ModBus Init problem, slave address №"+slaveAdrr+"--"+e.getClass());
//            stat = "ERROR";
//        }
//        try {
//            modbusMasterSerialSecond.setValue(slaveAdrr, RegisterRange.HOLDING_REGISTER, reg, bit, value);
//            boolean x = modbusMasterSerialSecond.getValue(slaveAdrr, RegisterRange.HOLDING_REGISTER, reg, bit);
//            stat = x ? "ON" : "OFF";
//        }
//        catch (ModbusTransportException | ErrorResponseException e){
////            System.out.println("Modbus transport problem :"+e.getMessage());
//            LOGGER.error("ModBus Transport problem, slave address №"+slaveAdrr+"--"+e.getClass());
//            stat = "ERROR";
//        }
//        finally {
//            modbusMasterSerialSecond.destroy();
//            LOGGER.info("ModBus Close connection, slave address №"+slaveAdrr);
//        }
//        return stat;
//    }
//
//    @Override
//    public String getRegBit(int slaveAdrr, int reg, byte bit){
//        String stat = "";
//        try {
//            modbusMasterSerialSecond.init();
//            LOGGER.info("ModBus Listen slave address №"+slaveAdrr+"--"+modbusMasterSerialSecond.testSlaveNode(slaveAdrr));
//        }
//        catch (ModbusInitException e){
////            System.out.println("Modbus init problem :"+e.getMessage());
//            LOGGER.error("ModBus Init problem, slave address №"+slaveAdrr+"--"+e.getClass());
//            stat = "ERROR";
//        }
//        try {
//            boolean x = modbusMasterSerialSecond.getValue(slaveAdrr, RegisterRange.HOLDING_REGISTER, reg, bit);
//            stat = x ? "ON" : "OFF";
//        }
//        catch (ModbusTransportException | ErrorResponseException e){
////            System.out.println("Modbus transport problem :"+e.getMessage());
//            LOGGER.error("ModBus Transport problem, slave address №"+slaveAdrr+"--"+e.getClass());
//            stat = "ERROR";
//        }
//        finally {
//            modbusMasterSerialSecond.destroy();
//            LOGGER.info("ModBus Close connection, slave address №"+slaveAdrr);
//        }
//        return stat;
//    }
//
//    @Override
//    public void setReg(int slaveAdrr, int reg, Object value){
//        String stat = "";
//        try {
//            modbusMasterSerialSecond.init();
//            LOGGER.info("ModBus Listen slave address №"+slaveAdrr+"--"+modbusMasterSerialSecond.testSlaveNode(slaveAdrr));
//        }
//        catch (ModbusInitException e){
////            System.out.println("Modbus init problem :"+e.getMessage());
//            LOGGER.error("ModBus Init problem, slave address №"+slaveAdrr+"--"+e.getClass());
//            stat = "ERROR";
//        }
//        try {
//            modbusMasterSerialSecond.setValue(slaveAdrr, RegisterRange.HOLDING_REGISTER, reg, DataType.TWO_BYTE_INT_UNSIGNED, value);
//            Object x = modbusMasterSerialSecond.getValue(slaveAdrr, RegisterRange.HOLDING_REGISTER, reg, DataType.TWO_BYTE_INT_UNSIGNED);
//            stat = x.toString();
//        }
//        catch (ModbusTransportException | ErrorResponseException e){
////            System.out.println("Modbus transport problem :"+e.getMessage());
//            LOGGER.error("ModBus Transport problem, slave address №"+slaveAdrr+"--"+e.getClass());
//            stat = "ERROR";
//        }
//        finally {
//            modbusMasterSerialSecond.destroy();
//            LOGGER.info("ModBus Close connection, slave address №"+slaveAdrr);
//        }
//    }
//
//    @Override
//    public String getReg(int slaveAdrr, int reg){
//        String stat = "";
//        try {
//            modbusMasterSerialSecond.init();
//            LOGGER.info("ModBus Listen slave address №"+slaveAdrr+"--"+modbusMasterSerialSecond.testSlaveNode(slaveAdrr));
//        }
//        catch (ModbusInitException e){
////            System.out.println("Modbus init problem :"+e.getMessage());
//            LOGGER.error("ModBus Init problem, slave address №"+slaveAdrr+"--"+e.getClass());
//            stat = "ERROR";
//        }
//        try {
//            Object x = modbusMasterSerialSecond.getValue(slaveAdrr, RegisterRange.HOLDING_REGISTER, reg, DataType.TWO_BYTE_INT_UNSIGNED);
//            stat = x.toString();
//        }
//        catch (ModbusTransportException | ErrorResponseException e){
////            System.out.println("Modbus transport problem :"+e.getMessage());
//            LOGGER.error("ModBus Transport problem, slave address №"+slaveAdrr+"--"+e.getClass());
//            stat = "ERROR";
//        }
//        finally {
//            modbusMasterSerialSecond.destroy();
//            LOGGER.info("ModBus Close connection, slave address №"+slaveAdrr);
//        }
//        return stat;
//    }
//
//    @Override
//    public PLC getPlc(int slaveAdrr){
//
//       PLC plc = new PLC();
//
//        try {
//            modbusMasterSerialSecond.init();
////            System.out.println("ModBus Listen slave address №"+slaveAdrr+"--"+modbusMasterTCP.testSlaveNode(slaveAdrr));
//            LOGGER.info("ModBus Listen slave address №"+slaveAdrr+"--"+modbusMasterSerialSecond.testSlaveNode(slaveAdrr));
//        }
//        catch (ModbusInitException e){
////            System.out.println("ModBus Init problem, slave address №"+slaveAdrr+"--"+e.getMessage());
//            LOGGER.error("ModBus Init problem, slave address №"+slaveAdrr+"--"+e.getClass());
//        }
//        try {
//            byte in0 = 0;
//            byte in1 = 1;
//            byte in2 = 2;
//            byte in3 = 3;
//            byte in4 = 4;
//            byte in5 = 5;
//            byte in6 = 6;
//            byte in7 = 7;
//            byte in8 = 8;
//            byte in9 = 9;
//            byte in10 = 10;
//            byte in11 = 11;
//            byte in12 = 12;
//            byte in13 = 13;
//            byte in14 = 14;
//            byte in15 = 15;
//
////            plc.setReg0Bit0(modbusMasterTCP.getValue(slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in0));
////            plc.setReg0Bit1(modbusMasterTCP.getValue(slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in1));
////            plc.setReg0Bit2(modbusMasterTCP.getValue(slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in2));
////            plc.setReg0Bit3(modbusMasterTCP.getValue(slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in3));
////            plc.setReg0Bit4(modbusMasterTCP.getValue(slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in4));
////            plc.setReg0Bit5(modbusMasterTCP.getValue(slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in5));
////            plc.setReg0Bit6(modbusMasterTCP.getValue(slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in6));
////            plc.setReg0Bit7(modbusMasterTCP.getValue(slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in7));
////            plc.setReg0Bit8(modbusMasterTCP.getValue(slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in8));
////            plc.setReg0Bit9(modbusMasterTCP.getValue(slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in9));
////            plc.setReg0Bit10(modbusMasterTCP.getValue(slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in10));
////            plc.setReg0Bit11(modbusMasterTCP.getValue(slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in11));
////            plc.setReg0Bit12(modbusMasterTCP.getValue(slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in12));
////            plc.setReg0Bit13(modbusMasterTCP.getValue(slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in13));
////            plc.setReg0Bit14(modbusMasterTCP.getValue(slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in14));
////            plc.setReg0Bit15(modbusMasterTCP.getValue(slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in15));
////
////            plc.setReg1TwoByte( (int) modbusMasterTCP.getValue(slaveAdrr, RegisterRange.HOLDING_REGISTER, 1, DataType.TWO_BYTE_INT_UNSIGNED));
////            plc.setReg2FourByte((float) modbusMasterTCP.getValue(slaveAdrr, RegisterRange.HOLDING_REGISTER, 2, DataType.FOUR_BYTE_FLOAT_SWAPPED));
////            plc.setReg4FourByte( (long) modbusMasterTCP.getValue(slaveAdrr, RegisterRange.HOLDING_REGISTER, 4, DataType.FOUR_BYTE_INT_UNSIGNED_SWAPPED));
//
//            BatchRead batchRead = new BatchRead();
//            batchRead.addLocator(0.0,slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in0);
//            batchRead.addLocator(0.1,slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in1);
//            batchRead.addLocator(0.2,slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in2);
//            batchRead.addLocator(0.3,slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in3);
//            batchRead.addLocator(0.4,slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in4);
//            batchRead.addLocator(0.5,slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in5);
//            batchRead.addLocator(0.6,slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in6);
//            batchRead.addLocator(0.7,slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in7);
//            batchRead.addLocator(0.8,slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in8);
//            batchRead.addLocator(0.9,slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in9);
//            batchRead.addLocator(0.10,slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in10);
//            batchRead.addLocator(0.11,slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in11);
//            batchRead.addLocator(0.12,slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in12);
//            batchRead.addLocator(0.13,slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in13);
//            batchRead.addLocator(0.14,slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in14);
//            batchRead.addLocator(0.15,slaveAdrr, RegisterRange.HOLDING_REGISTER, 0, in15);
//            batchRead.addLocator(1,slaveAdrr, RegisterRange.HOLDING_REGISTER, 1, DataType.TWO_BYTE_INT_UNSIGNED);
//            batchRead.addLocator(2,slaveAdrr, RegisterRange.HOLDING_REGISTER, 2, DataType.FOUR_BYTE_FLOAT_SWAPPED);
//            batchRead.addLocator(4,slaveAdrr, RegisterRange.HOLDING_REGISTER, 4, DataType.FOUR_BYTE_INT_UNSIGNED_SWAPPED);
//
//            BatchResults batchResults =  modbusMasterSerialSecond.send(batchRead);
//            boolean output0 = (boolean) batchResults.getValue(0.0);
//            boolean output1 = (boolean) batchResults.getValue(0.1);
//            boolean output2 = (boolean) batchResults.getValue(0.2);
//            boolean output3 = (boolean) batchResults.getValue(0.3);
//            boolean output4 = (boolean) batchResults.getValue(0.4);
//            boolean output5 = (boolean) batchResults.getValue(0.5);
//            boolean output6 = (boolean) batchResults.getValue(0.6);
//            boolean output7 = (boolean) batchResults.getValue(0.7);
//            boolean output8 = (boolean) batchResults.getValue(0.8);
//            boolean output9 = (boolean) batchResults.getValue(0.9);
//            boolean output10 = (boolean) batchResults.getValue(0.10);
//            boolean output11 = (boolean) batchResults.getValue(0.11);
//            boolean output12 = (boolean) batchResults.getValue(0.12);
//            boolean output13 = (boolean) batchResults.getValue(0.13);
//            boolean output14 = (boolean) batchResults.getValue(0.14);
//            boolean output15 = (boolean) batchResults.getValue(0.15);
//
//            int value1 = (int) batchResults.getValue(1);
//            float value2 = (float) batchResults.getValue(2);
//            long value3 = (long) batchResults.getValue(4);
//
//            plc.setReg0Bit0(output0);
//            plc.setReg0Bit1(output1);
//            plc.setReg0Bit2(output2);
//            plc.setReg0Bit3(output3);
//            plc.setReg0Bit4(output4);
//            plc.setReg0Bit5(output5);
//            plc.setReg0Bit6(output6);
//            plc.setReg0Bit7(output7);
//            plc.setReg0Bit8(output8);
//            plc.setReg0Bit9(output9);
//            plc.setReg0Bit10(output10);
//            plc.setReg0Bit11(output11);
//            plc.setReg0Bit12(output12);
//            plc.setReg0Bit13(output13);
//            plc.setReg0Bit14(output14);
//            plc.setReg0Bit15(output15);
//
//            plc.setReg1TwoByte(value1);
//            plc.setReg2FourByte(value2);
//            plc.setReg4FourByte(value3);
//
//        }
//        catch (ModbusTransportException | ErrorResponseException e){
////            System.out.println("ModBus Transport problem, slave address №"+slaveAdrr+"--"+e.getMessage());
//            LOGGER.error("ModBus Transport problem, slave address №"+slaveAdrr+"--"+e.getClass());
//
//        }
//        finally {
//            modbusMasterSerialSecond.destroy();
////            System.out.println("ModBus Close connection, slave address №"+slaveAdrr);
//            LOGGER.info("ModBus Close connection, slave address №"+slaveAdrr);
//        }
//        return plc;
//    }
//
//}
