package com.vk.service.data;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel2MB110;
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
public class FirstCehSmesitel2MB110ServiceDataImpl extends RootServiceDataImpl<Float, TableModelFirstCehSmesitel2KMSF1, DeviceModelFirstCehSmesitel2MB110> implements FirstCehSmesitel2MB110ServiceData{


    private final RootRepositoryData<TableModelFirstCehSmesitel2KMSF1> rootRepositoryData;

    private final RootModbusRepository<DeviceModelFirstCehSmesitel2MB110> rootModbusRepository;

    @Autowired
    public FirstCehSmesitel2MB110ServiceDataImpl(final RootRepositoryData<TableModelFirstCehSmesitel2KMSF1> rootRepositoryData,
                                                 final RootModbusRepository<DeviceModelFirstCehSmesitel2MB110> rootModbusRepository){
        super(rootRepositoryData, rootModbusRepository);
        this.rootRepositoryData = rootRepositoryData;
        this.rootModbusRepository = rootModbusRepository;
    }
}
