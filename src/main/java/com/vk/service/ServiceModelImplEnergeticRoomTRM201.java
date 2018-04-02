package com.vk.service;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by User on 2018-02-28.
 */
@Service
@ComponentScan(basePackages = {"com.vk.repository"})
public class ServiceModelImplEnergeticRoomTRM201 /*extends ServiceModelImpl*/ implements ServiceModelEnergeticRoomTRM201{

    @Autowired
    private BaseRepositoryEnergeticRoomTRM201 baseRepositoryEnergeticRoomTRM201;

    @Autowired
    private ModbusRepositoryEnergeticRoomTRM201 modbusRepositoryEnergeticRoomTRM201;

    public DeviceModelEnergeticRoomTRM201 getModbusDevice(){
        return modbusRepositoryEnergeticRoomTRM201.getDeviceModel();
    }

    @Transactional
    public void addTabeDevice(TableModelEnergeticRoomTRM201 tableModel){
        baseRepositoryEnergeticRoomTRM201.addValue(tableModel);
    }

    @Transactional(readOnly = true)
    public List<TableModelEnergeticRoomTRM201> rangeTimestamp(Date startTimestamp, Date endTimestamp){
        return baseRepositoryEnergeticRoomTRM201.rangeTimestamp(startTimestamp, endTimestamp);
    }
}
