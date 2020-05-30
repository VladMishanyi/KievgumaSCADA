package com.vk.service.data;

import com.vk.entity.device.DeviceModelFirstCehSmesitel4KMSF1;
import com.vk.entity.table.TableModelFirstCehSmesitel4KMSF1;
import com.vk.repository.data.RootRepositoryData;
import com.vk.repository.modbus.RootModbusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

/**
 * Created by KIP-PC99 on 23.06.2018.
 */
@Service
@ComponentScan(basePackages = {"com.vk.repository"})
public class FirstCehSmesitel4KMSF1ServiceDataImpl extends RootServiceDataImpl<TableModelFirstCehSmesitel4KMSF1, DeviceModelFirstCehSmesitel4KMSF1> implements FirstCehSmesitel4KMSF1ServiceData{


    private final RootRepositoryData<TableModelFirstCehSmesitel4KMSF1> rootRepositoryData;

    private final RootModbusRepository<DeviceModelFirstCehSmesitel4KMSF1> rootModbusRepository;

    @Autowired
    public FirstCehSmesitel4KMSF1ServiceDataImpl(final RootRepositoryData<TableModelFirstCehSmesitel4KMSF1> rootRepositoryData,
                                                 final RootModbusRepository<DeviceModelFirstCehSmesitel4KMSF1> rootModbusRepository){
        super(rootRepositoryData, rootModbusRepository);
        this.rootRepositoryData = rootRepositoryData;
        this.rootModbusRepository = rootModbusRepository;
    }
}