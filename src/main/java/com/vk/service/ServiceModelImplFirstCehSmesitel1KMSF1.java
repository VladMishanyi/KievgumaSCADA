package com.vk.service;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel1KMSF1;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelFirstCehSmesitel1KMSF1;
import com.vk.repository.BaseRepositoryEnergeticRoomTRM201;
import com.vk.repository.BaseRepositoryFirstCehSmesitel1KMSF1;
import com.vk.repository.ModbusRepositoryEnergeticRoomTRM201;
import com.vk.repository.ModbusRepositoryFirstCehSmesitel1KMSF1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@ComponentScan(basePackages = {"com.vk.repository"})
public class ServiceModelImplFirstCehSmesitel1KMSF1 implements ServiceModelFirstCehSmesitel1KMSF1{

    @Autowired
    private BaseRepositoryFirstCehSmesitel1KMSF1 baseRepositoryFirstCehSmesitel1KMSF1;

    @Autowired
    private ModbusRepositoryFirstCehSmesitel1KMSF1 modbusRepositoryFirstCehSmesitel1KMSF1;

    public DeviceModelFirstCehSmesitel1KMSF1 getModbusDevice(){
        return modbusRepositoryFirstCehSmesitel1KMSF1.getDeviceModel();
    }

    @Transactional
    public void addTabeDevice(TableModelFirstCehSmesitel1KMSF1 tableModel){
        baseRepositoryFirstCehSmesitel1KMSF1.addValue(tableModel);
    }

    @Transactional(readOnly = true)
    public List<TableModelFirstCehSmesitel1KMSF1> rangeTimestamp(Date startTimestamp, Date endTimestamp){
        return baseRepositoryFirstCehSmesitel1KMSF1.rangeTimestamp(startTimestamp, endTimestamp);
    }
}
