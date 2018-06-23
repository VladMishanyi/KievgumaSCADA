//package com.vk.service;
//
//import com.vk.entity.device.DeviceModelSevenCehAutoclavSPK107;
//import com.vk.entity.table.TableModelSevenCehAutoclavSPK107;
//import com.vk.repository.old_jpql.BaseRepositorySevenCehAutoclavSPK107;
//import com.vk.repository.old_modbus.ModbusRepositorySevenCehAutoclavSPK107;
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
//public class ServiceModelImplSevenCehAutoclavSPK107  /*extends ServiceModelImpl*/ implements ServiceModelSevenCehAutoclavSPK107{
//
//    @Autowired
//    private BaseRepositorySevenCehAutoclavSPK107 baseRepositorySevenCehAutoclavSPK107;
//
//    @Autowired
//    private ModbusRepositorySevenCehAutoclavSPK107 modbusRepositorySevenCehAutoclavSPK107;
//
//    public DeviceModelSevenCehAutoclavSPK107 getModbusDevice(){
//        return modbusRepositorySevenCehAutoclavSPK107.getDeviceModel();
//    }
//
//    @Transactional
//    public void addTabeDevice(TableModelSevenCehAutoclavSPK107 tableModel){
//        baseRepositorySevenCehAutoclavSPK107.addValue(tableModel);
//    }
//
//    @Transactional(readOnly = true)
//    public List<TableModelSevenCehAutoclavSPK107> rangeTimestamp(Date startTimestamp, Date endTimestamp){
//        return baseRepositorySevenCehAutoclavSPK107.rangeTimestamp(startTimestamp, endTimestamp);
//    }
//}
