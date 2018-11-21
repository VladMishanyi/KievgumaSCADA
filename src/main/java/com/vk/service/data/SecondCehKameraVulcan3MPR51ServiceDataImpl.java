package com.vk.service.data;

import com.vk.entity.device.DeviceModelSecondCehKameraVulcan1MPR51;
import com.vk.entity.device.DeviceModelSecondCehKameraVulcan3MPR51;
import com.vk.entity.table.TableModelSecondCehKameraVulcan1MPR51;
import com.vk.entity.table.TableModelSecondCehKameraVulcan3MPR51;
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
public class SecondCehKameraVulcan3MPR51ServiceDataImpl extends RootServiceDataImpl<Float, TableModelSecondCehKameraVulcan3MPR51, DeviceModelSecondCehKameraVulcan3MPR51> implements SecondCehKameraVulcan3MPR51ServiceData{

    private final RootRepositoryData<TableModelSecondCehKameraVulcan3MPR51> rootRepositoryData;

    private final RootModbusRepository<DeviceModelSecondCehKameraVulcan3MPR51> rootModbusRepository;

    @Autowired
    public SecondCehKameraVulcan3MPR51ServiceDataImpl(final RootRepositoryData<TableModelSecondCehKameraVulcan3MPR51> rootRepositoryData,
                                                      final RootModbusRepository<DeviceModelSecondCehKameraVulcan3MPR51> rootModbusRepository){
        super(rootRepositoryData, rootModbusRepository);
        this.rootRepositoryData = rootRepositoryData;
        this.rootModbusRepository = rootModbusRepository;
    }
}
