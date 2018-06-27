package com.vk.service.data;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel2KMSF1;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelFirstCehSmesitel2KMSF1;
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
public class FirstCehSmesitel2KMSF1ServiceDataImpl extends RootServiceDataImpl<Integer, TableModelFirstCehSmesitel2KMSF1, DeviceModelFirstCehSmesitel2KMSF1> implements FirstCehSmesitel2KMSF1ServiceData{


    private RootRepositoryData<TableModelFirstCehSmesitel2KMSF1> rootRepositoryData;

    private RootModbusRepository<Integer, DeviceModelFirstCehSmesitel2KMSF1> rootModbusRepository;

    @Autowired
    public FirstCehSmesitel2KMSF1ServiceDataImpl(RootRepositoryData<TableModelFirstCehSmesitel2KMSF1> rootRepositoryData,
                                              RootModbusRepository<Integer, DeviceModelFirstCehSmesitel2KMSF1> rootModbusRepository){
        super(rootRepositoryData, rootModbusRepository);
        this.rootRepositoryData = rootRepositoryData;
        this.rootModbusRepository = rootModbusRepository;
    }
}