package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM202;
import com.vk.entity.table.TableModelEnergeticRoomTRM202;

import java.util.Date;

import com.vk.lib.FloatCut;
import com.vk.lib.ObjectValidator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by User on 2018-02-28.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class DeviceToTableImplEnergeticRoomTRM201/*
        extends DeviceToTableImpl<DeviceModelEnergeticRoomTRM202,
        DeviceModelEnergeticRoomTRM202,
        TableModelEnergeticRoomTRM202> implements DeviceToTableEnergeticRoomTRM201*/{

//    private TableModelEnergeticRoomTRM201 tableModelEnergeticRoomTRM201;

//    private Date date;

//    @Autowired
//    public DeviceToTableImplEnergeticRoomTRM201(TableModelEnergeticRoomTRM201 tableModelEnergeticRoomTRM201,
//                                                Date getDate){
//        this.tableModelEnergeticRoomTRM201 = tableModelEnergeticRoomTRM201;
//        this.date = date;
//    }

//    @Override
//    public TableModelEnergeticRoomTRM202 convert(final DeviceModelEnergeticRoomTRM202 deviceModelEnergeticRoomTRM202){
//
//        TableModelEnergeticRoomTRM202 tableModelEnergeticRoomTRM202 = null;
//        if (ObjectValidator.isNotNull(deviceModelEnergeticRoomTRM202)){
//            tableModelEnergeticRoomTRM202 = new TableModelEnergeticRoomTRM202();
//            tableModelEnergeticRoomTRM202.setDate(new Date());
//            tableModelEnergeticRoomTRM202.setValue1(0);
//            tableModelEnergeticRoomTRM202.setValue2(0);
//            tableModelEnergeticRoomTRM202.setValue3(FloatCut.floatTwoDigs(deviceModelEnergeticRoomTRM202.getDeviceValuesRegister0()));
//            tableModelEnergeticRoomTRM202.setValue4(FloatCut.floatTwoDigs(deviceModelEnergeticRoomTRM202.getDeviceValuesRegister1()));
//        }
//        return tableModelEnergeticRoomTRM202;
//    }
}
