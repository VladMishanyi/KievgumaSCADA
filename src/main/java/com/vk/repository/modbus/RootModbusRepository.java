package com.vk.repository.modbus;

import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModel;

/**
 * Created by KIP-PC99 on 20.06.2018.
 */
public interface RootModbusRepository<T extends DeviceModel> {

    public T getDeviceModel(final boolean enableBatch);

    public boolean getModbusStatus();

    public String getBranchName();
}
