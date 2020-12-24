package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelThirdCehAutoclavTRM202;
import com.vk.entity.table.TableModelThirdCehAutoclavTRM202;
import com.vk.lib.FloatCut;
import com.vk.lib.ObjectValidator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by User on 2018-03-07.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class DeviceToTableImplThirdCehAutoclavTRM202
        extends DeviceToTableImpl<DeviceModelThirdCehAutoclavTRM202,
        DeviceModelThirdCehAutoclavTRM202,
        TableModelThirdCehAutoclavTRM202> implements DeviceToTableThirdCehAutoclavTRM202 {

//    private TableModelThirdCehAutoclavTRM202 tableModelThirdCehAutoclavTRM202;

//    private Date date;

//    @Autowired
//    public DeviceToTableImplThirdCehAutoclavTRM202(TableModelThirdCehAutoclavTRM202 tableModelThirdCehAutoclavTRM202,
//                                                Date getDate){
//        this.tableModelThirdCehAutoclavTRM202 = tableModelThirdCehAutoclavTRM202;
//        this.date = date;
//    }

    @Override
    public TableModelThirdCehAutoclavTRM202 convert(final DeviceModelThirdCehAutoclavTRM202 deviceModelThirdCehAutoclavTRM202){

        TableModelThirdCehAutoclavTRM202 tableModelThirdCehAutoclavTRM202 = null;
        if (ObjectValidator.isNotNull(deviceModelThirdCehAutoclavTRM202)){
            tableModelThirdCehAutoclavTRM202 = new TableModelThirdCehAutoclavTRM202();
            tableModelThirdCehAutoclavTRM202.setDate(LocalDateTime.now());
            tableModelThirdCehAutoclavTRM202.setChannel1(FloatCut.floatTwoDigs(deviceModelThirdCehAutoclavTRM202.getDeviceValuesRegister0()));
            tableModelThirdCehAutoclavTRM202.setChannel2(FloatCut.floatTwoDigs(deviceModelThirdCehAutoclavTRM202.getDeviceValuesRegister1()));
        }
        return tableModelThirdCehAutoclavTRM202;
    }
}
