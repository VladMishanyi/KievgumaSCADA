package com.vk.service.data;

import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaTRM138;
import com.vk.entity.table.TableModelFirstCehKameraDozrevanyaMPR51;
import com.vk.repository.data.RootRepositoryData;
import com.vk.repository.modbus.RootModbusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

/**
 * Created by KIP-PC99 on 20.09.2018.
 */
@Service
@ComponentScan(basePackages = {"com.vk.repository"})
public class KameraDozrevanyaTRM138ServiceDataImpl extends RootServiceDataImpl<TableModelFirstCehKameraDozrevanyaMPR51, DeviceModelFirstCehKameraDozrevanyaTRM138> implements KameraDozrevanyaTRM138ServiceData {

    private final RootRepositoryData<TableModelFirstCehKameraDozrevanyaMPR51> rootRepositoryData;

    private final RootModbusRepository<DeviceModelFirstCehKameraDozrevanyaTRM138> rootModbusRepository;

    @Autowired
    public KameraDozrevanyaTRM138ServiceDataImpl(final RootRepositoryData<TableModelFirstCehKameraDozrevanyaMPR51> rootRepositoryData,
                                                 final RootModbusRepository<DeviceModelFirstCehKameraDozrevanyaTRM138> rootModbusRepository){
        super(rootRepositoryData, rootModbusRepository);
        this.rootRepositoryData = rootRepositoryData;
        this.rootModbusRepository = rootModbusRepository;
    }
}
