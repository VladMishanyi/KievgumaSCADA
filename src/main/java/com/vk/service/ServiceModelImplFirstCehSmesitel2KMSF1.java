package com.vk.service;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel2KMSF1;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelFirstCehSmesitel2KMSF1;
import com.vk.repository.BaseRepositoryEnergeticRoomTRM201;
import com.vk.repository.BaseRepositoryFirstCehSmesitel2KMSF1;
import com.vk.repository.ModbusRepositoryEnergeticRoomTRM201;
import com.vk.repository.ModbusRepositoryFirstCehSmesitel2KMSF1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@ComponentScan(basePackages = {"com.vk.repository"})
public class ServiceModelImplFirstCehSmesitel2KMSF1  /*extends ServiceModelImpl*/ implements ServiceModelFirstCehSmesitel2KMSF1{

    @Autowired
    private BaseRepositoryFirstCehSmesitel2KMSF1 baseRepositoryFirstCehSmesitel2KMSF1;

    @Autowired
    private ModbusRepositoryFirstCehSmesitel2KMSF1 modbusRepositoryFirstCehSmesitel2KMSF1;

    public DeviceModelFirstCehSmesitel2KMSF1 getModbusDevice(){
        return modbusRepositoryFirstCehSmesitel2KMSF1.getDeviceModel();
    }

    @Transactional
    public void addTabeDevice(TableModelFirstCehSmesitel2KMSF1 tableModel){
        baseRepositoryFirstCehSmesitel2KMSF1.addValue(tableModel);
    }

    @Transactional(readOnly = true)
    public List<TableModelFirstCehSmesitel2KMSF1> rangeTimestamp(Date startTimestamp, Date endTimestamp){
        return baseRepositoryFirstCehSmesitel2KMSF1.rangeTimestamp(startTimestamp, endTimestamp);
    }
}
