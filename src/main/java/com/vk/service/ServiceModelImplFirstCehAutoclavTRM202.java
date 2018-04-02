package com.vk.service;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehAutoclavTRM202;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelFirstCehAutoclavTRM202;
import com.vk.repository.BaseRepositoryEnergeticRoomTRM201;
import com.vk.repository.BaseRepositoryFirstCehAutoclavTRM202;
import com.vk.repository.ModbusRepositoryEnergeticRoomTRM201;
import com.vk.repository.ModbusRepositoryFirstCehAutoclavTRM202;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@ComponentScan(basePackages = {"com.vk.repository"})
public class ServiceModelImplFirstCehAutoclavTRM202  /*extends ServiceModelImpl*/ implements ServiceModelFirstCehAutoclavTRM202{

    @Autowired
    private BaseRepositoryFirstCehAutoclavTRM202 baseRepositoryFirstCehAutoclavTRM202;

    @Autowired
    private ModbusRepositoryFirstCehAutoclavTRM202 modbusRepositoryFirstCehAutoclavTRM202;

    public DeviceModelFirstCehAutoclavTRM202 getModbusDevice(){
        return modbusRepositoryFirstCehAutoclavTRM202.getDeviceModel();
    }

    @Transactional
    public void addTabeDevice(TableModelFirstCehAutoclavTRM202 tableModel){
        baseRepositoryFirstCehAutoclavTRM202.addValue(tableModel);
    }

    @Transactional(readOnly = true)
    public List<TableModelFirstCehAutoclavTRM202> rangeTimestamp(Date startTimestamp, Date endTimestamp){
        return baseRepositoryFirstCehAutoclavTRM202.rangeTimestamp(startTimestamp, endTimestamp);
    }
}
