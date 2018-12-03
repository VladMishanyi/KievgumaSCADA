package com.vk.repository;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel1KMSF1;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelFirstCehSmesitel1KMSF1;
import com.vk.repository.data.RootRepositoryData;
import com.vk.repository.modbus.RootModbusRepository;
import com.vk.service.data.FirstCehSmesitel1KMSF1ServiceData;
import com.vk.service.data.RootServiceDataImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by KIP-PC99 on 23.06.2018.
 */
@Service
@ComponentScan(basePackages = {"com.vk.repository"})
public class FirstCehSmesitel1KMSF1ServiceDataImpl extends RootServiceDataImpl<Integer, TableModelFirstCehSmesitel1KMSF1, DeviceModelFirstCehSmesitel1KMSF1> implements FirstCehSmesitel1KMSF1ServiceData {


    private final RootRepositoryData<TableModelFirstCehSmesitel1KMSF1> rootRepositoryData;

    private final RootModbusRepository<DeviceModelFirstCehSmesitel1KMSF1> rootModbusRepository;

    @Autowired
    public FirstCehSmesitel1KMSF1ServiceDataImpl(final RootRepositoryData<TableModelFirstCehSmesitel1KMSF1> rootRepositoryData,
                                                 final RootModbusRepository<DeviceModelFirstCehSmesitel1KMSF1> rootModbusRepository){
        super(rootRepositoryData, rootModbusRepository);
        this.rootRepositoryData = rootRepositoryData;
        this.rootModbusRepository = rootModbusRepository;
    }
}
