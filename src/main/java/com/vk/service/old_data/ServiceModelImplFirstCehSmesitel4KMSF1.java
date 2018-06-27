//package com.vk.service;
//
//import com.vk.entity.device.DeviceModelFirstCehSmesitel4KMSF1;
//import com.vk.entity.device.DeviceModelFirstCehSmesitel4MB110;
//import com.vk.entity.table.TableModelFirstCehSmesitel4KMSF1;
//import com.vk.repository.old_jpql.BaseRepositoryFirstCehSmesitel4KMSF1;
//import com.vk.repository.old_modbus.ModbusRepositoryFirstCehSmesitel4KMSF1;
//import com.vk.repository.old_modbus.ModbusRepositoryFirstCehSmesitel4MB110;
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
//public class ServiceModelImplFirstCehSmesitel4KMSF1  /*extends ServiceModelImpl*/ implements ServiceModelFirstCehSmesitel4KMSF1{
//
//    @Autowired
//    private BaseRepositoryFirstCehSmesitel4KMSF1 baseRepositoryFirstCehSmesitel4KMSF1;
//
//    @Autowired
//    private ModbusRepositoryFirstCehSmesitel4KMSF1 modbusRepositoryFirstCehSmesitel4KMSF1;
//
//    @Autowired
//    private ModbusRepositoryFirstCehSmesitel4MB110 modbusRepositoryFirstCehSmesitel4MB110;
//
//    @Override
//    public DeviceModelFirstCehSmesitel4KMSF1 getModbusDevice(){
//        return modbusRepositoryFirstCehSmesitel4KMSF1.getDeviceModel();
//    }
//
//    @Override
//    public DeviceModelFirstCehSmesitel4MB110 getModbusDevice2() {
//        return modbusRepositoryFirstCehSmesitel4MB110.getDeviceModel();
//    }
//
//    @Transactional
//    public void addTabeDevice(TableModelFirstCehSmesitel4KMSF1 tableModel){
//        baseRepositoryFirstCehSmesitel4KMSF1.addValue(tableModel);
//    }
//
//    @Transactional(readOnly = true)
//    public List<TableModelFirstCehSmesitel4KMSF1> rangeTimestamp(Date startTimestamp, Date endTimestamp){
//        return baseRepositoryFirstCehSmesitel4KMSF1.rangeTimestamp(startTimestamp, endTimestamp);
//    }
//}