package com.vk.repository;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.BatchResults;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.serotonin.modbus4j.exception.ModbusInitException;
import com.vk.entity.TRM201_Energrtic;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;

import java.util.Date;

/**
 * Created by User on 2018-02-27.
 */
public class ModbusRepositoryImplEnergeticRoomTRM201 extends ModbusRepositoryImpl<DeviceModelEnergeticRoomTRM201> {

    @Override
    public DeviceModelEnergeticRoomTRM201 getDeviceModel(){
        DeviceModelEnergeticRoomTRM201 deviceModelEnergeticRoomTRM201 = new DeviceModelEnergeticRoomTRM201();
        try {
            modbusMasterSerialFirst.init();
//            System.out.println("ModBus Listen slave address №"+slaveAdrr+"--"+modbusMasterSerial.testSlaveNode(slaveAdrr));
//            LOGGER.info("ModBus Listen slave address №"+slaveAdrr+"--"+modbusMasterSerial.testSlaveNode(slaveAdrr));
        }
        catch (ModbusInitException e){
//            System.out.println("ModBus Init problem, slave address №"+slaveAdrr+"--"+e.getMessage());
            LOGGER.error("ModBus Init problem, slave address №"+slaveAdrr+"--"+e.getMessage());
        }
        try {
            BatchRead batchRead = new BatchRead();
            batchRead.addLocator(1, slaveAdrr, RegisterRange.HOLDING_REGISTER, 1, DataType.TWO_BYTE_INT_SIGNED);
            batchRead.addLocator(2, slaveAdrr, RegisterRange.HOLDING_REGISTER, 2, DataType.TWO_BYTE_INT_SIGNED);
            batchRead.addLocator(3, slaveAdrr, RegisterRange.HOLDING_REGISTER, 4105, DataType.FOUR_BYTE_FLOAT);
            batchRead.addLocator(4, slaveAdrr, RegisterRange.HOLDING_REGISTER, 4107, DataType.FOUR_BYTE_FLOAT);
            BatchResults batchResults = modbusMasterSerialFirst.send(batchRead);
            int value1 = (short) batchResults.getValue(1);
            int value2 = (short) batchResults.getValue(2);
            float value3 = (float) batchResults.getValue(3);
            float value4 = (float) batchResults.getValue(4);
//            System.out.println(value1 +" : : "+value2+" : : "+value3+" : : "+value4);
            trm201_energrtic.setDate(new Date());
            trm201_energrtic.setValue1(value1);
            trm201_energrtic.setValue2(value2);
            trm201_energrtic.setValue3(value3);
            trm201_energrtic.setValue4(value4);
        }catch (Exception e){
//            System.out.println("ModBus Transport problem, slave address №"+slaveAdrr+"--"+e.getMessage());
            LOGGER.error("ModBus Transport problem, slave address №"+slaveAdrr+"--"+e.getMessage());
            trm201_energrtic.setDate(new Date());
            trm201_energrtic.setValue1(0);
            trm201_energrtic.setValue2(0);
            trm201_energrtic.setValue3(0);
            trm201_energrtic.setValue4(0);
            return trm201_energrtic;
        }
        finally {
            modbusMasterSerialFirst.destroy();
//            System.out.println("ModBus Close connection, slave address №"+slaveAdrr);
            LOGGER.info("ModBus Close connection (Transport problem), slave address №"+slaveAdrr);
        }
        return trm201_energrtic;
    }
}
