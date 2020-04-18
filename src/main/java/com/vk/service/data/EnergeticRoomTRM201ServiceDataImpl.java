package com.vk.service.data;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.repository.data.RootRepositoryData;
import com.vk.repository.modbus.ModbusRepositoryEnergeticRoomTRM201;
import com.vk.repository.modbus.RootModbusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

/**
 * Created by KIP-PC99 on 11.06.2018.
 */
@Service
@ComponentScan(basePackages = {"com.vk.repository"})
public class EnergeticRoomTRM201ServiceDataImpl extends RootServiceDataImpl<TableModelEnergeticRoomTRM201, DeviceModelEnergeticRoomTRM201> implements EnergeticRoomTRM201ServiceData{


    private final RootRepositoryData<TableModelEnergeticRoomTRM201> rootRepositoryData;

    private final RootModbusRepository<DeviceModelEnergeticRoomTRM201> rootModbusRepository;

    private final ModbusRepositoryEnergeticRoomTRM201 modbusRepositoryEnergeticRoomTRM201;

    @Autowired
    public EnergeticRoomTRM201ServiceDataImpl(final RootRepositoryData<TableModelEnergeticRoomTRM201> rootRepositoryData,
                                              final RootModbusRepository<DeviceModelEnergeticRoomTRM201> rootModbusRepository,
                                              final ModbusRepositoryEnergeticRoomTRM201 modbusRepositoryEnergeticRoomTRM201){
        super(rootRepositoryData, rootModbusRepository);
        this.rootRepositoryData = rootRepositoryData;
        this.rootModbusRepository = rootModbusRepository;
        this.modbusRepositoryEnergeticRoomTRM201 = modbusRepositoryEnergeticRoomTRM201;
    }

    @Override
    public void writeValueFirstChanel(int value){
        modbusRepositoryEnergeticRoomTRM201.writeValueFirstChanel(value);
    }

    @Override
    public void writeValueFirstChane2(int value){
        modbusRepositoryEnergeticRoomTRM201.writeValueFirstChane2(value);
    }
}
