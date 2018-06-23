package com.vk.service.data;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
//import com.vk.repository.BaseRepositoryEnergeticRoomTRM201;
import com.vk.repository.data.EnergeticRoomTRM201RepositoryData;
import com.vk.repository.data.RootRepositoryData;
import com.vk.repository.modbus.RootModbusRepository;
//import com.vk.repository.old_modbus.ModbusRepositoryEnergeticRoomTRM201;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

/**
 * Created by KIP-PC99 on 11.06.2018.
 */
@Service
@ComponentScan(basePackages = {"com.vk.repository"})
public class EnergeticRoomTRM201ServiceDataImpl extends RootServiceDataImpl<Float, TableModelEnergeticRoomTRM201, DeviceModelEnergeticRoomTRM201> implements EnergeticRoomTRM201ServiceData{


    private RootRepositoryData<TableModelEnergeticRoomTRM201> rootRepositoryData;

    private RootModbusRepository<Float, DeviceModelEnergeticRoomTRM201> rootModbusRepository;

    @Autowired
    public EnergeticRoomTRM201ServiceDataImpl(RootRepositoryData<TableModelEnergeticRoomTRM201> rootRepositoryData,
                                              RootModbusRepository<Float, DeviceModelEnergeticRoomTRM201> rootModbusRepository){
        super(rootRepositoryData, rootModbusRepository);
        this.rootRepositoryData = rootRepositoryData;
        this.rootModbusRepository = rootModbusRepository;
    }
}
