package com.vk.service.data;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel5KMSF1;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelFirstCehSmesitel5KMSF1;
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
public class FirstCehSmesitel5KMSF1ServiceDataImpl extends RootServiceDataImpl<Integer, TableModelFirstCehSmesitel5KMSF1, DeviceModelFirstCehSmesitel5KMSF1> implements FirstCehSmesitel5KMSF1ServiceData{


    private RootRepositoryData<TableModelFirstCehSmesitel5KMSF1> rootRepositoryData;

    private RootModbusRepository<DeviceModelFirstCehSmesitel5KMSF1> rootModbusRepository;

    @Autowired
    public FirstCehSmesitel5KMSF1ServiceDataImpl(RootRepositoryData<TableModelFirstCehSmesitel5KMSF1> rootRepositoryData,
                                              RootModbusRepository<DeviceModelFirstCehSmesitel5KMSF1> rootModbusRepository){
        super(rootRepositoryData, rootModbusRepository);
        this.rootRepositoryData = rootRepositoryData;
        this.rootModbusRepository = rootModbusRepository;
    }
}