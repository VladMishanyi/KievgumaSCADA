//package com.vk.service;
//
//import com.vk.entity.device.DeviceModelFirstCehSmesitel1KMSF1;
//import com.vk.entity.device.DeviceModelFirstCehSmesitel1MB110;
//import com.vk.entity.table.TableModelFirstCehSmesitel1KMSF1;
//import com.vk.repository.old_jpql.BaseRepositoryFirstCehSmesitel1KMSF1;
//import com.vk.repository.old_modbus.ModbusRepositoryFirstCehSmesitel1KMSF1;
//import com.vk.repository.old_modbus.ModbusRepositoryFirstCehSmesitel1MB110;
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
//public class ServiceModelImplFirstCehSmesitel1KMSF1  /*extends ServiceModelImpl*/ implements ServiceModelFirstCehSmesitel1KMSF1{
//
//    @Autowired
//    private BaseRepositoryFirstCehSmesitel1KMSF1 baseRepositoryFirstCehSmesitel1KMSF1;
//
//    @Autowired
//    private ModbusRepositoryFirstCehSmesitel1KMSF1 modbusRepositoryFirstCehSmesitel1KMSF1;
//
//    @Autowired
//    private ModbusRepositoryFirstCehSmesitel1MB110 modbusRepositoryFirstCehSmesitel1MB110;
//
//    @Override
//    public DeviceModelFirstCehSmesitel1KMSF1 getModbusDevice(){
//        return modbusRepositoryFirstCehSmesitel1KMSF1.getDeviceModel();
//    }
//
//    @Override
//    public DeviceModelFirstCehSmesitel1MB110 getModbusDevice2() {
//        return modbusRepositoryFirstCehSmesitel1MB110.getDeviceModel();
//    }
//
//    @Transactional
//    public void addTabeDevice(TableModelFirstCehSmesitel1KMSF1 tableModel){
//        baseRepositoryFirstCehSmesitel1KMSF1.addValue(tableModel);
//    }
//
//    @Transactional(readOnly = true)
//    public List<TableModelFirstCehSmesitel1KMSF1> rangeTimestamp(Date startTimestamp, Date endTimestamp){
//        return baseRepositoryFirstCehSmesitel1KMSF1.rangeTimestamp(startTimestamp, endTimestamp);
//    }
//}
