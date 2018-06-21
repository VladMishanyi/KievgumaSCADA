package com.vk.service;

import com.vk.entity.device.DeviceModelFirstCehSmesitel5KMSF1;
import com.vk.entity.device.DeviceModelFirstCehSmesitel5MB110;
import com.vk.entity.table.TableModelFirstCehSmesitel5KMSF1;
import com.vk.repository.old_jpql.BaseRepositoryFirstCehSmesitel5KMSF1;
import com.vk.repository.old_modbus.ModbusRepositoryFirstCehSmesitel5KMSF1;
import com.vk.repository.old_modbus.ModbusRepositoryFirstCehSmesitel5MB110;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@ComponentScan(basePackages = {"com.vk.repository"})
public class ServiceModelImplFirstCehSmesitel5KMSF1  /*extends ServiceModelImpl*/ implements ServiceModelFirstCehSmesitel5KMSF1{

    @Autowired
    private BaseRepositoryFirstCehSmesitel5KMSF1 baseRepositoryFirstCehSmesitel5KMSF1;

    @Autowired
    private ModbusRepositoryFirstCehSmesitel5KMSF1 modbusRepositoryFirstCehSmesitel5KMSF1;

    @Autowired
    private ModbusRepositoryFirstCehSmesitel5MB110 modbusRepositoryFirstCehSmesitel5MB110;

    @Override
    public DeviceModelFirstCehSmesitel5KMSF1 getModbusDevice(){
        return modbusRepositoryFirstCehSmesitel5KMSF1.getDeviceModel();
    }

    @Override
    public DeviceModelFirstCehSmesitel5MB110 getModbusDevice2() {
        return modbusRepositoryFirstCehSmesitel5MB110.getDeviceModel();
    }

    @Transactional
    public void addTabeDevice(TableModelFirstCehSmesitel5KMSF1 tableModel){
        baseRepositoryFirstCehSmesitel5KMSF1.addValue(tableModel);
    }

    @Transactional(readOnly = true)
    public List<TableModelFirstCehSmesitel5KMSF1> rangeTimestamp(Date startTimestamp, Date endTimestamp){
        return baseRepositoryFirstCehSmesitel5KMSF1.rangeTimestamp(startTimestamp, endTimestamp);
    }
}
