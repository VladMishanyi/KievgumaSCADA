package com.vk.service.data;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel3MB110;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelFirstCehSmesitel2KMSF1;
import com.vk.entity.table.TableModelFirstCehSmesitel3KMSF1;
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
public class FirstCehSmesitel3MB110ServiceDataImpl extends RootServiceDataImpl<Float, TableModelFirstCehSmesitel3KMSF1, DeviceModelFirstCehSmesitel3MB110> implements FirstCehSmesitel3MB110ServiceData{


    private RootRepositoryData<TableModelFirstCehSmesitel3KMSF1> rootRepositoryData;

    private RootModbusRepository<DeviceModelFirstCehSmesitel3MB110> rootModbusRepository;

    @Autowired
    public FirstCehSmesitel3MB110ServiceDataImpl(RootRepositoryData<TableModelFirstCehSmesitel3KMSF1> rootRepositoryData,
                                              RootModbusRepository<DeviceModelFirstCehSmesitel3MB110> rootModbusRepository){
        super(rootRepositoryData, rootModbusRepository);
        this.rootRepositoryData = rootRepositoryData;
        this.rootModbusRepository = rootModbusRepository;
    }
}