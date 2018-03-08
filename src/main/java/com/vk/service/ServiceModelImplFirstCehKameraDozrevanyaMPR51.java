package com.vk.service;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaMPR51;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelFirstCehKameraDozrevanyaMPR51;
import com.vk.repository.BaseRepositoryEnergeticRoomTRM201;
import com.vk.repository.BaseRepositoryFirstCehKameraDozrevanyaMPR51;
import com.vk.repository.ModbusRepositoryEnergeticRoomTRM201;
import com.vk.repository.ModbusRepositoryFirstCehKameraDozrevanyaMPR51;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@ComponentScan(basePackages = {"com.vk.repository"})
public class ServiceModelImplFirstCehKameraDozrevanyaMPR51 implements ServiceModelFirstCehKameraDozrevanyaMPR51{

    @Autowired
    private BaseRepositoryFirstCehKameraDozrevanyaMPR51 baseRepositoryFirstCehKameraDozrevanyaMPR51;

    @Autowired
    private ModbusRepositoryFirstCehKameraDozrevanyaMPR51 modbusRepositoryFirstCehKameraDozrevanyaMPR51;

    public DeviceModelFirstCehKameraDozrevanyaMPR51 getModbusDevice(){
        return modbusRepositoryFirstCehKameraDozrevanyaMPR51.getDeviceModel();
    }

    @Transactional
    public void addTabeDevice(TableModelFirstCehKameraDozrevanyaMPR51 tableModel){
        baseRepositoryFirstCehKameraDozrevanyaMPR51.addValue(tableModel);
    }

    @Transactional(readOnly = true)
    public List<TableModelFirstCehKameraDozrevanyaMPR51> rangeTimestamp(Date startTimestamp, Date endTimestamp){
        return baseRepositoryFirstCehKameraDozrevanyaMPR51.rangeTimestamp(startTimestamp, endTimestamp);
    }
}
