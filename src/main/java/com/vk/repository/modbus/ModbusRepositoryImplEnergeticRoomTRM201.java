package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM202;
import com.vk.entity.modbus.ModbusMasterSerialModel;
import com.vk.modbus.ModbusFloat;
import com.vk.modbus.ModbusInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by User on 2018-02-27.
 */
@Repository
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class ModbusRepositoryImplEnergeticRoomTRM201
        extends RootModbusRepositoryImpl<Float, ModbusFloat, DeviceModelEnergeticRoomTRM202>
        implements ModbusRepositoryEnergeticRoomTRM201 {

    private final ModbusMasterSerialModel modbusMasterSerialFirst;

    private final DeviceModelEnergeticRoomTRM202 deviceModelEnergeticRoomTRM202;

    private final BatchRead<Integer> batchRead;

    private final ModbusFloat modbusFloat;

    private final ModbusInteger modbusInteger;

    @Autowired
    public ModbusRepositoryImplEnergeticRoomTRM201(final ModbusMasterSerialModel modbusMasterSerialFirst,
                                                   final DeviceModelEnergeticRoomTRM202 deviceModelEnergeticRoomTRM202,
                                                   final BatchRead<Integer> batchRead,
                                                   final ModbusFloat modbusFloat,
                                                   final ModbusInteger modbusInteger){
        super(modbusFloat);
        this.modbusMasterSerialFirst = modbusMasterSerialFirst;
        this.deviceModelEnergeticRoomTRM202 = deviceModelEnergeticRoomTRM202;
        this.batchRead = batchRead;
        this.modbusFloat = modbusFloat;
        this.modbusInteger = modbusInteger;
    }

    @Override
    public DeviceModelEnergeticRoomTRM202 getDeviceModel(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterSerialFirst,
                deviceModelEnergeticRoomTRM202.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelEnergeticRoomTRM202.getModbusLocator0h(),
                deviceModelEnergeticRoomTRM202.getModbusLocator1h());
        deviceModelEnergeticRoomTRM202.setHoldingRegister0(list.get(0));
        deviceModelEnergeticRoomTRM202.setHoldingRegister1(list.get(1));
        return deviceModelEnergeticRoomTRM202;
    }

    @Override
    public void writeValueFirstChanel(int value){
        modbusInteger.writeDataToModBus(modbusMasterSerialFirst,
                deviceModelEnergeticRoomTRM202.getDeviceAddress(),
                value,
                deviceModelEnergeticRoomTRM202.getModbusLocator2h());
        deviceModelEnergeticRoomTRM202.setHoldingRegister2(value);
    }

    @Override
    public void writeValueFirstChane2(int value){
        modbusInteger.writeDataToModBus(modbusMasterSerialFirst,
                deviceModelEnergeticRoomTRM202.getDeviceAddress(),
                value,
                deviceModelEnergeticRoomTRM202.getModbusLocator3h());
        deviceModelEnergeticRoomTRM202.setHoldingRegister3(value);
    }
}
