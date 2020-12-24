package com.vk.service.data;

import com.vk.entity.device.DeviceModel;
import com.vk.entity.table.TableModel;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * Created by KIP-PC99 on 11.06.2018.
 */
public interface RootServiceData<E extends TableModel, T extends DeviceModel> {

    List<BigInteger> readBaseSize();

     T getModbusDevice();

    void addTabeDevice(E tableModel);

    List<E> rangeTimestamp(LocalDateTime startTimestamp, LocalDateTime endTimestamp);
}
