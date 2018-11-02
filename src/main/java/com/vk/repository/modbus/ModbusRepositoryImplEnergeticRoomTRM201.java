package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.vk.entity.device.DeviceModel;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.modbus.ModbusMasterSerialModel;
import com.vk.modbus.ModbusFloat;
import com.vk.modbus.RootModbus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by User on 2018-02-27.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class ModbusRepositoryImplEnergeticRoomTRM201
        extends RootModbusRepositoryImpl<Float, ModbusFloat, DeviceModelEnergeticRoomTRM201>
        implements ModbusRepositoryEnergeticRoomTRM201 {

    private final ModbusMasterSerialModel modbusMasterSerialFirst;

    private final DeviceModelEnergeticRoomTRM201 deviceModelEnergeticRoomTRM201;

    private final BatchRead batchRead;

    private final ModbusFloat modbusFloat;

    @Autowired
    public ModbusRepositoryImplEnergeticRoomTRM201(final ModbusMasterSerialModel modbusMasterSerialFirst,
                                                   final DeviceModelEnergeticRoomTRM201 deviceModelEnergeticRoomTRM201,
                                                   final BatchRead batchRead,
                                                   final ModbusFloat modbusFloat){
        super(modbusMasterSerialFirst, modbusFloat);
        this.modbusMasterSerialFirst = modbusMasterSerialFirst;
        this.deviceModelEnergeticRoomTRM201 = deviceModelEnergeticRoomTRM201;
        this.batchRead = batchRead;
        this.modbusFloat = modbusFloat;
    }

    @Override
    public DeviceModelEnergeticRoomTRM201 getDeviceModel(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterSerialFirst,
                deviceModelEnergeticRoomTRM201.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelEnergeticRoomTRM201.getModbusLocator0(),
                deviceModelEnergeticRoomTRM201.getModbusLocator1());
        deviceModelEnergeticRoomTRM201.setDeviceValuesRegister0(list.get(0));
        deviceModelEnergeticRoomTRM201.setDeviceValuesRegister1(list.get(1));
        return deviceModelEnergeticRoomTRM201;
    }

//    @Override
//    public boolean getModbusStatus() {
//        return modbusFloat.getModbusStatus();
//    }
//
//    @Override
//    public String getMasterName(){
//        return modbusMasterSerialFirst.getPort();
//    }
}
