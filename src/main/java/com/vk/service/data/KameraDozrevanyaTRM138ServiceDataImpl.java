package com.vk.service.data;

import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaMPR51;
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
public class KameraDozrevanyaTRM138ServiceDataImpl extends RootServiceDataImpl<Float, TableModelFirstCehKameraDozrevanyaMPR51, DeviceModelFirstCehKameraDozrevanyaTRM138> implements KameraDozrevanyaTRM138ServiceData {

    private RootRepositoryData<TableModelFirstCehKameraDozrevanyaMPR51> rootRepositoryData;

    private RootModbusRepository<DeviceModelFirstCehKameraDozrevanyaTRM138> rootModbusRepository;

    @Autowired
    public KameraDozrevanyaTRM138ServiceDataImpl(RootRepositoryData<TableModelFirstCehKameraDozrevanyaMPR51> rootRepositoryData,
                                                RootModbusRepository<DeviceModelFirstCehKameraDozrevanyaTRM138> rootModbusRepository){
        super(rootRepositoryData, rootModbusRepository);
        this.rootRepositoryData = rootRepositoryData;
        this.rootModbusRepository = rootModbusRepository;
    }
}
