package com.vk.service;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel5KMSF1;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelFirstCehSmesitel5KMSF1;
import com.vk.repository.BaseRepositoryEnergeticRoomTRM201;
import com.vk.repository.BaseRepositoryFirstCehSmesitel5KMSF1;
import com.vk.repository.ModbusRepositoryEnergeticRoomTRM201;
import com.vk.repository.ModbusRepositoryFirstCehSmesitel5KMSF1;
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

    public DeviceModelFirstCehSmesitel5KMSF1 getModbusDevice(){
        return modbusRepositoryFirstCehSmesitel5KMSF1.getDeviceModel();
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
