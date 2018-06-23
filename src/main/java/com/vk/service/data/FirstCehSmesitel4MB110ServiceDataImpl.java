package com.vk.service.data;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel4MB110;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
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
public class FirstCehSmesitel4MB110ServiceDataImpl extends RootServiceDataImpl<Float, TableModelFirstCehSmesitel4KMSF1, DeviceModelFirstCehSmesitel4MB110> implements FirstCehSmesitel4MB110ServiceData{


    private RootRepositoryData<TableModelFirstCehSmesitel4KMSF1> rootRepositoryData;

    private RootModbusRepository<Float, DeviceModelFirstCehSmesitel4MB110> rootModbusRepository;

    @Autowired
    public FirstCehSmesitel4MB110ServiceDataImpl(RootRepositoryData<TableModelFirstCehSmesitel4KMSF1> rootRepositoryData,
                                              RootModbusRepository<Float, DeviceModelFirstCehSmesitel4MB110> rootModbusRepository){
        super(rootRepositoryData, rootModbusRepository);
        this.rootRepositoryData = rootRepositoryData;
        this.rootModbusRepository = rootModbusRepository;
    }
}