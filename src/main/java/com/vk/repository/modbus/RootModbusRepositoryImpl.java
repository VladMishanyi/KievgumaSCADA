package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.vk.entity.device.DeviceModel;
import com.vk.entity.device.DeviceModelThirdCehAutoclavTRM202;
import com.vk.entity.modbus.ModbusMasterSerialModel;
import com.vk.modbus.ModbusFloat;
import com.vk.modbus.RootModbus;

/**
 * Created by KIP-PC99 on 31.10.2018.
 */
public abstract class RootModbusRepositoryImpl<N extends Number, T extends RootModbus<N>, D extends DeviceModel>
        implements RootModbusRepository<D>{

    private ModbusMasterSerialModel modbusMasterSerial;

    private T modbus;

    public RootModbusRepositoryImpl(){}

    public RootModbusRepositoryImpl(ModbusMasterSerialModel modbusMasterSerial,
                                    T modbus){
        this.modbusMasterSerial = modbusMasterSerial;
        this.modbus = modbus;
    }

    public abstract D getDeviceModel(final boolean enableBatch);

    @Override
    public boolean getModbusStatus(){
        return modbus.getModbusStatus();
    }

    @Override
    public String getBranchName(){
        return modbusMasterSerial.getPort();
    }
}
