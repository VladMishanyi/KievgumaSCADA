package com.vk.service.data;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelThirdCehAutoclavTRM202;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelThirdCehAutoclavTRM202;
import com.vk.repository.data.RootRepositoryData;
import com.vk.repository.modbus.RootModbusRepository;
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
public class ThirdCehAutoclavTRM202ServiceDataImpl extends RootServiceDataImpl<Float, TableModelThirdCehAutoclavTRM202, DeviceModelThirdCehAutoclavTRM202> implements ThirdCehAutoclavTRM202ServiceData{


    private final RootRepositoryData<TableModelThirdCehAutoclavTRM202> rootRepositoryData;

    private final RootModbusRepository<DeviceModelThirdCehAutoclavTRM202> rootModbusRepository;

    @Autowired
    public ThirdCehAutoclavTRM202ServiceDataImpl(final RootRepositoryData<TableModelThirdCehAutoclavTRM202> rootRepositoryData,
                                                 final RootModbusRepository<DeviceModelThirdCehAutoclavTRM202> rootModbusRepository){
        super(rootRepositoryData, rootModbusRepository);
        this.rootRepositoryData = rootRepositoryData;
        this.rootModbusRepository = rootModbusRepository;
    }
}