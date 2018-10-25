package com.vk.service.data;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelLaboratoryAutoclavMV110;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelLaboratoryAutoclavMV110;
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
public class LaboratoryAutoclavMV110ServiceDataImpl extends RootServiceDataImpl<Float, TableModelLaboratoryAutoclavMV110, DeviceModelLaboratoryAutoclavMV110> implements LaboratoryAutoclavMV110ServiceData{


    private final RootRepositoryData<TableModelLaboratoryAutoclavMV110> rootRepositoryData;

    private final RootModbusRepository<DeviceModelLaboratoryAutoclavMV110> rootModbusRepository;

    @Autowired
    public LaboratoryAutoclavMV110ServiceDataImpl(final RootRepositoryData<TableModelLaboratoryAutoclavMV110> rootRepositoryData,
                                                  final RootModbusRepository<DeviceModelLaboratoryAutoclavMV110> rootModbusRepository){
        super(rootRepositoryData, rootModbusRepository);
        this.rootRepositoryData = rootRepositoryData;
        this.rootModbusRepository = rootModbusRepository;
    }
}