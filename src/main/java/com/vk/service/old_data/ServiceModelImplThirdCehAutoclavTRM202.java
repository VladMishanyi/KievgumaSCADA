//package com.vk.service;
//
//import com.vk.entity.device.DeviceModelThirdCehAutoclavTRM202;
//import com.vk.entity.table.TableModelThirdCehAutoclavTRM202;
//import com.vk.repository.old_jpql.BaseRepositoryThirdCehAutoclavTRM202;
//import com.vk.repository.old_modbus.ModbusRepositoryThirdCehAutoclavTRM202;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.Date;
//import java.util.List;
//
//@Service
//@ComponentScan(basePackages = {"com.vk.repository"})
//public class ServiceModelImplThirdCehAutoclavTRM202  /*extends ServiceModelImpl*/ implements ServiceModelThirdCehAutoclavTRM202{
//
//    @Autowired
//    private BaseRepositoryThirdCehAutoclavTRM202 baseRepositoryThirdCehAutoclavTRM202;
//
//    @Autowired
//    private ModbusRepositoryThirdCehAutoclavTRM202 modbusRepositoryThirdCehAutoclavTRM202;
//
//    public DeviceModelThirdCehAutoclavTRM202 getModbusDevice(){
//        return modbusRepositoryThirdCehAutoclavTRM202.getDeviceModel();
//    }
//
//    @Transactional
//    public void addTabeDevice(TableModelThirdCehAutoclavTRM202 tableModel){
//        baseRepositoryThirdCehAutoclavTRM202.addValue(tableModel);
//    }
//
//    @Transactional(readOnly = true)
//    public List<TableModelThirdCehAutoclavTRM202> rangeTimestamp(Date startTimestamp, Date endTimestamp){
//        return baseRepositoryThirdCehAutoclavTRM202.rangeTimestamp(startTimestamp, endTimestamp);
//    }
//}
