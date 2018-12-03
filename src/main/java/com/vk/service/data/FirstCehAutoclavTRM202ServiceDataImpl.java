package com.vk.service.data;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehAutoclavTRM202;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelFirstCehAutoclavTRM202;
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
public class FirstCehAutoclavTRM202ServiceDataImpl extends RootServiceDataImpl<Float, TableModelFirstCehAutoclavTRM202, DeviceModelFirstCehAutoclavTRM202> implements FirstCehAutoclavTRM202ServiceData{


    private final RootRepositoryData<TableModelFirstCehAutoclavTRM202> rootRepositoryData;

    private final RootModbusRepository<DeviceModelFirstCehAutoclavTRM202> rootModbusRepository;

    @Autowired
    public FirstCehAutoclavTRM202ServiceDataImpl(final RootRepositoryData<TableModelFirstCehAutoclavTRM202> rootRepositoryData,
                                                 final RootModbusRepository<DeviceModelFirstCehAutoclavTRM202> rootModbusRepository){
        super(rootRepositoryData, rootModbusRepository);
        this.rootRepositoryData = rootRepositoryData;
        this.rootModbusRepository = rootModbusRepository;
    }
}
