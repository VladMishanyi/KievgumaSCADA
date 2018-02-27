package com.vk.repository;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.BatchResults;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.serotonin.modbus4j.exception.ModbusInitException;
import com.vk.entity.TRM201_Energrtic;
import com.vk.entity.device.DeviceModel;

import java.util.Date;

/**
 * Created by User on 2018-02-27.
 */
public abstract class ModbusRepositoryImpl<T extends DeviceModel> implements ModbusRepository<T>{

    @Override
    public abstract T getDeviceModel();
}
