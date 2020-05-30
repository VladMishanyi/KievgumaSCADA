package com.vk.service.data;

import com.vk.entity.device.DeviceModelSevenCehAutoclavSPK107;
import com.vk.entity.table.TableModelSevenCehAutoclavSPK107;
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
public class SevenCehAutoclavSPK107ServiceDataImpl extends RootServiceDataImpl<TableModelSevenCehAutoclavSPK107, DeviceModelSevenCehAutoclavSPK107> implements SevenCehAutoclavSPK107ServiceData{


    private final RootRepositoryData<TableModelSevenCehAutoclavSPK107> rootRepositoryData;

    private final RootModbusRepository<DeviceModelSevenCehAutoclavSPK107> rootModbusRepository;

    @Autowired
    public SevenCehAutoclavSPK107ServiceDataImpl(final RootRepositoryData<TableModelSevenCehAutoclavSPK107> rootRepositoryData,
                                                 final RootModbusRepository<DeviceModelSevenCehAutoclavSPK107> rootModbusRepository){
        super(rootRepositoryData, rootModbusRepository);
        this.rootRepositoryData = rootRepositoryData;
        this.rootModbusRepository = rootModbusRepository;
    }
}