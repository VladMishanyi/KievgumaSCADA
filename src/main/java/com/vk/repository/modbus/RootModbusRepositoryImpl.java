package com.vk.repository.modbus;

import com.vk.entity.device.DeviceModel;
import com.vk.modbus.RootModbus;

/**
 * Created by KIP-PC99 on 31.10.2018.
 */
public abstract class RootModbusRepositoryImpl<N extends Number, T extends RootModbus<N>, D extends DeviceModel> implements RootModbusRepository<D>{

    private T modbus;

    public RootModbusRepositoryImpl(){}

    public RootModbusRepositoryImpl(T modbus){
        this.modbus = modbus;
    }

    @Override
    public void setUseBorders(final boolean state){
        modbus.setUseBorders(state);
    }

    @Override
    public abstract D getDeviceModel(final boolean enableBatch);
}
