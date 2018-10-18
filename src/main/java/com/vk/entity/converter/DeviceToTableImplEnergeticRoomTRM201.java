package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel1MB110;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;

import java.util.Date;

import com.vk.entity.table.TableModelFirstCehAutoclavTRM202;
import com.vk.lib.FloatCut;
import com.vk.lib.ObjectValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * Created by User on 2018-02-28.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class DeviceToTableImplEnergeticRoomTRM201
        extends DeviceToTableImpl<DeviceModelEnergeticRoomTRM201,
        DeviceModelEnergeticRoomTRM201,
        TableModelEnergeticRoomTRM201> implements DeviceToTableEnergeticRoomTRM201{

//    private TableModelEnergeticRoomTRM201 tableModelEnergeticRoomTRM201;

//    private Date date;

//    @Autowired
//    public DeviceToTableImplEnergeticRoomTRM201(TableModelEnergeticRoomTRM201 tableModelEnergeticRoomTRM201,
//                                                Date getDate){
//        this.tableModelEnergeticRoomTRM201 = tableModelEnergeticRoomTRM201;
//        this.date = date;
//    }

    @Override
    public TableModelEnergeticRoomTRM201 convert(DeviceModelEnergeticRoomTRM201 deviceModelEnergeticRoomTRM201){

        TableModelEnergeticRoomTRM201 tableModelEnergeticRoomTRM201 = null;
        if (ObjectValidator.isNotNull(deviceModelEnergeticRoomTRM201)){
            tableModelEnergeticRoomTRM201 = new TableModelEnergeticRoomTRM201();
            tableModelEnergeticRoomTRM201.setDate(new Date());
            tableModelEnergeticRoomTRM201.setValue1(0);
            tableModelEnergeticRoomTRM201.setValue2(0);
            tableModelEnergeticRoomTRM201.setValue3(FloatCut.floatTwoDigs(DeviceModelEnergeticRoomTRM201.getDeviceValuesRegister0()));
            tableModelEnergeticRoomTRM201.setValue4(FloatCut.floatTwoDigs(DeviceModelEnergeticRoomTRM201.getDeviceValuesRegister1()));
        }
        return tableModelEnergeticRoomTRM201;
    }
}
