package com.vk.service.data;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaMPR51;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
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
public class KameraDozrevanyaMPR51ServiceDataImpl extends RootServiceDataImpl<Float, TableModelFirstCehKameraDozrevanyaMPR51, DeviceModelFirstCehKameraDozrevanyaMPR51> implements KameraDozrevanyaMPR51ServiceData{


    private RootRepositoryData<TableModelFirstCehKameraDozrevanyaMPR51> rootRepositoryData;

    private RootModbusRepository<Float, DeviceModelFirstCehKameraDozrevanyaMPR51> rootModbusRepository;

    @Autowired
    public KameraDozrevanyaMPR51ServiceDataImpl(RootRepositoryData<TableModelFirstCehKameraDozrevanyaMPR51> rootRepositoryData,
                                              RootModbusRepository<Float, DeviceModelFirstCehKameraDozrevanyaMPR51> rootModbusRepository){
        super(rootRepositoryData, rootModbusRepository);
        this.rootRepositoryData = rootRepositoryData;
        this.rootModbusRepository = rootModbusRepository;
    }
}