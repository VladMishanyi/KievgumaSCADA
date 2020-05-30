package com.vk.service.data;

import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaMPR51;
import com.vk.entity.table.TableModelFirstCehKameraDozrevanyaMPR51;
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
public class KameraDozrevanyaMPR51ServiceDataImpl extends RootServiceDataImpl<TableModelFirstCehKameraDozrevanyaMPR51, DeviceModelFirstCehKameraDozrevanyaMPR51> implements KameraDozrevanyaMPR51ServiceData{

    private final RootRepositoryData<TableModelFirstCehKameraDozrevanyaMPR51> rootRepositoryData;

    private final RootModbusRepository<DeviceModelFirstCehKameraDozrevanyaMPR51> rootModbusRepository;

    @Autowired
    public KameraDozrevanyaMPR51ServiceDataImpl(final RootRepositoryData<TableModelFirstCehKameraDozrevanyaMPR51> rootRepositoryData,
                                                final RootModbusRepository<DeviceModelFirstCehKameraDozrevanyaMPR51> rootModbusRepository){
        super(rootRepositoryData, rootModbusRepository);
        this.rootRepositoryData = rootRepositoryData;
        this.rootModbusRepository = rootModbusRepository;
    }
}