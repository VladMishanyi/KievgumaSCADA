package com.vk.service.data;

import com.vk.entity.device.DeviceModelSecondCehKameraVulcan1MPR51;
import com.vk.entity.table.TableModelSecondCehKameraVulcan1MPR51;
import com.vk.repository.data.RootRepositoryData;
import com.vk.repository.modbus.RootModbusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

/**
 * Created by KIP-PC99 on 21.11.2018.
 */
@Service
@ComponentScan(basePackages = {"com.vk.repository"})
public class SecondCehKameraVulcan1MPR51ServiceDataImpl extends RootServiceDataImpl<TableModelSecondCehKameraVulcan1MPR51, DeviceModelSecondCehKameraVulcan1MPR51> implements SecondCehKameraVulcan1MPR51ServiceData{

    private final RootRepositoryData<TableModelSecondCehKameraVulcan1MPR51> rootRepositoryData;

    private final RootModbusRepository<DeviceModelSecondCehKameraVulcan1MPR51> rootModbusRepository;

    @Autowired
    public SecondCehKameraVulcan1MPR51ServiceDataImpl(final RootRepositoryData<TableModelSecondCehKameraVulcan1MPR51> rootRepositoryData,
                                                      final RootModbusRepository<DeviceModelSecondCehKameraVulcan1MPR51> rootModbusRepository){
        super(rootRepositoryData, rootModbusRepository);
        this.rootRepositoryData = rootRepositoryData;
        this.rootModbusRepository = rootModbusRepository;
    }
}
