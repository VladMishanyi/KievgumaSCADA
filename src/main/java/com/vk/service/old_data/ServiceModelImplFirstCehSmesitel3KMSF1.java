//package com.vk.service;
//
//import com.vk.entity.device.DeviceModelFirstCehSmesitel3KMSF1;
//import com.vk.entity.device.DeviceModelFirstCehSmesitel3MB110;
//import com.vk.entity.table.TableModelFirstCehSmesitel3KMSF1;
//import com.vk.repository.old_jpql.BaseRepositoryFirstCehSmesitel3KMSF1;
//import com.vk.repository.old_modbus.ModbusRepositoryFirstCehSmesitel3KMSF1;
//import com.vk.repository.old_modbus.ModbusRepositoryFirstCehSmesitel3MB110;
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
//public class ServiceModelImplFirstCehSmesitel3KMSF1  /*extends ServiceModelImpl*/ implements ServiceModelFirstCehSmesitel3KMSF1{
//
//    @Autowired
//    private BaseRepositoryFirstCehSmesitel3KMSF1 baseRepositoryFirstCehSmesitel3KMSF1;
//
//    @Autowired
//    private ModbusRepositoryFirstCehSmesitel3KMSF1 modbusRepositoryFirstCehSmesitel3KMSF1;
//
//    @Autowired
//    private ModbusRepositoryFirstCehSmesitel3MB110 modbusRepositoryFirstCehSmesitel3MB110;
//
//    @Override
//    public DeviceModelFirstCehSmesitel3KMSF1 getModbusDevice(){
//        return modbusRepositoryFirstCehSmesitel3KMSF1.getDeviceModel();
//    }
//
//    @Override
//    public DeviceModelFirstCehSmesitel3MB110 getModbusDevice2() {
//        return modbusRepositoryFirstCehSmesitel3MB110.getDeviceModel();
//    }
//
//    @Transactional
//    public void addTabeDevice(TableModelFirstCehSmesitel3KMSF1 tableModel){
//        baseRepositoryFirstCehSmesitel3KMSF1.addValue(tableModel);
//    }
//
//    @Transactional(readOnly = true)
//    public List<TableModelFirstCehSmesitel3KMSF1> rangeTimestamp(Date startTimestamp, Date endTimestamp){
//        return baseRepositoryFirstCehSmesitel3KMSF1.rangeTimestamp(startTimestamp, endTimestamp);
//    }
//}