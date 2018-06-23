//package com.vk.service;
//
//import com.vk.entity.device.DeviceModelLaboratoryAutoclavMV110;
//import com.vk.entity.table.TableModelLaboratoryAutoclavMV110;
//import com.vk.repository.old_jpql.BaseRepositoryLaboratoryAutoclavMV110;
//import com.vk.repository.old_modbus.ModbusRepositoryLaboratoryAutoclavMV110;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.Date;
//import java.util.List;
//
///**
// * Created by User on 2018-04-02.
// */
//@Service
//@ComponentScan(basePackages = {"com.vk.repository"})
//public class ServiceModelImplLaboratoryAutoclavMV110 implements ServiceModelLaboratoryAutoclavMV110{
//
//    @Autowired
//    private BaseRepositoryLaboratoryAutoclavMV110 baseRepositoryLaboratoryAutoclavMV110;
//
//    @Autowired
//    private ModbusRepositoryLaboratoryAutoclavMV110 modbusRepositoryLaboratoryAutoclavMV110;
//
//    public DeviceModelLaboratoryAutoclavMV110 getModbusDevice(){
//        return modbusRepositoryLaboratoryAutoclavMV110.getDeviceModel();
//    }
//
//    @Transactional
//    public void addTabeDevice(TableModelLaboratoryAutoclavMV110 tableModel){
//        baseRepositoryLaboratoryAutoclavMV110.addValue(tableModel);
//    }
//
//    @Transactional(readOnly = true)
//    public List<TableModelLaboratoryAutoclavMV110> rangeTimestamp(Date startTimestamp, Date endTimestamp){
//        return baseRepositoryLaboratoryAutoclavMV110.rangeTimestamp(startTimestamp, endTimestamp);
//    }
//}
