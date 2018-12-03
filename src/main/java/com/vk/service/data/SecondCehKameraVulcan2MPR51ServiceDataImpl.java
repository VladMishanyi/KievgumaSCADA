package com.vk.service.data;

import com.vk.entity.device.DeviceModelSecondCehKameraVulcan1MPR51;
import com.vk.entity.device.DeviceModelSecondCehKameraVulcan2MPR51;
import com.vk.entity.table.TableModelSecondCehKameraVulcan1MPR51;
import com.vk.entity.table.TableModelSecondCehKameraVulcan2MPR51;
import com.vk.repository.data.RootRepositoryData;
import com.vk.repository.modbus.RootModbusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by KIP-PC99 on 21.11.2018.
 */
@Service
@ComponentScan(basePackages = {"com.vk.repository"})
public class SecondCehKameraVulcan2MPR51ServiceDataImpl extends RootServiceDataImpl<Float, TableModelSecondCehKameraVulcan2MPR51, DeviceModelSecondCehKameraVulcan2MPR51> implements SecondCehKameraVulcan2MPR51ServiceData{

    private final RootRepositoryData<TableModelSecondCehKameraVulcan2MPR51> rootRepositoryData;

    private final RootModbusRepository<DeviceModelSecondCehKameraVulcan2MPR51> rootModbusRepository;

    @Autowired
    public SecondCehKameraVulcan2MPR51ServiceDataImpl(final RootRepositoryData<TableModelSecondCehKameraVulcan2MPR51> rootRepositoryData,
                                                      final RootModbusRepository<DeviceModelSecondCehKameraVulcan2MPR51> rootModbusRepository){
        super(rootRepositoryData, rootModbusRepository);
        this.rootRepositoryData = rootRepositoryData;
        this.rootModbusRepository = rootModbusRepository;
    }
}
