package com.vk.service;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehBuzulukTRM200;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelFirstCehBuzulukTRM200;
import com.vk.repository.BaseRepositoryEnergeticRoomTRM201;
import com.vk.repository.BaseRepositoryFirstCehBuzulukTRM200;
import com.vk.repository.ModbusRepositoryEnergeticRoomTRM201;
import com.vk.repository.ModbusRepositoryFirstCehBuzulukTRM200;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@ComponentScan(basePackages = {"com.vk.repository"})
public class ServiceModelImplFirstCehBuzulukTRM200 implements ServiceModelFirstCehBuzulukTRM200{

    @Autowired
    private BaseRepositoryFirstCehBuzulukTRM200 baseRepositoryFirstCehBuzulukTRM200;

    @Autowired
    private ModbusRepositoryFirstCehBuzulukTRM200 modbusRepositoryFirstCehBuzulukTRM200;

    public DeviceModelFirstCehBuzulukTRM200 getModbusDevice(){
        return modbusRepositoryFirstCehBuzulukTRM200.getDeviceModel();
    }

    @Transactional
    public void addTabeDevice(TableModelFirstCehBuzulukTRM200 tableModel){
        baseRepositoryFirstCehBuzulukTRM200.addValue(tableModel);
    }

    @Transactional(readOnly = true)
    public List<TableModelFirstCehBuzulukTRM200> rangeTimestamp(Date startTimestamp, Date endTimestamp){
        return baseRepositoryFirstCehBuzulukTRM200.rangeTimestamp(startTimestamp, endTimestamp);
    }
}
