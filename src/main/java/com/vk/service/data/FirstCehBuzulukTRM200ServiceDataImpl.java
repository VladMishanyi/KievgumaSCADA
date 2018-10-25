package com.vk.repository;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehBuzulukTRM200;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelFirstCehBuzulukTRM200;
import com.vk.repository.data.RootRepositoryData;
import com.vk.repository.modbus.RootModbusRepository;
import com.vk.service.data.FirstCehBuzulukTRM200ServiceData;
import com.vk.service.data.RootServiceDataImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

/**
 * Created by KIP-PC99 on 23.06.2018.
 */
@Service
@ComponentScan(basePackages = {"com.vk.repository"})
public class FirstCehBuzulukTRM200ServiceDataImpl extends RootServiceDataImpl<Float, TableModelFirstCehBuzulukTRM200, DeviceModelFirstCehBuzulukTRM200> implements FirstCehBuzulukTRM200ServiceData {


    private final RootRepositoryData<TableModelFirstCehBuzulukTRM200> rootRepositoryData;

    private final RootModbusRepository<DeviceModelFirstCehBuzulukTRM200> rootModbusRepository;

    @Autowired
    public FirstCehBuzulukTRM200ServiceDataImpl(final RootRepositoryData<TableModelFirstCehBuzulukTRM200> rootRepositoryData,
                                                final RootModbusRepository<DeviceModelFirstCehBuzulukTRM200> rootModbusRepository){
        super(rootRepositoryData, rootModbusRepository);
        this.rootRepositoryData = rootRepositoryData;
        this.rootModbusRepository = rootModbusRepository;
    }
}
