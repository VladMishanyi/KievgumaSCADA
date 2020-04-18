package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelKotelnyaParMikrolITM4;
import com.vk.entity.table.TableModelKotelnyaParMikrolITM4;
import com.vk.lib.FloatCut;
import com.vk.lib.ObjectValidator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by KIP-PC99 on 08.08.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class DeviceToTableImplKotelnyaParMikrolITM4
        extends DeviceToTableImpl<DeviceModelKotelnyaParMikrolITM4,
        DeviceModelKotelnyaParMikrolITM4,
        TableModelKotelnyaParMikrolITM4> implements DeviceToTableKotelnyaParMikrolITM4 {

    @Override
    public TableModelKotelnyaParMikrolITM4 convert(final DeviceModelKotelnyaParMikrolITM4 deviceModelKotelnyaParMikrolITM4){
        TableModelKotelnyaParMikrolITM4 tableModelKotelnyaParMikrolITM4 = null;
        if (ObjectValidator.isNotNull(deviceModelKotelnyaParMikrolITM4)){
            tableModelKotelnyaParMikrolITM4 = new TableModelKotelnyaParMikrolITM4();
            tableModelKotelnyaParMikrolITM4.setDate(new Date());
            tableModelKotelnyaParMikrolITM4.setChannel1(FloatCut.floatTwoDigs(deviceModelKotelnyaParMikrolITM4.getDeviceValuesRegister0()));
            tableModelKotelnyaParMikrolITM4.setChannel2(FloatCut.floatTwoDigs(deviceModelKotelnyaParMikrolITM4.getDeviceValuesRegister1()));
            tableModelKotelnyaParMikrolITM4.setChannel3(FloatCut.floatTwoDigs(deviceModelKotelnyaParMikrolITM4.getDeviceValuesRegister2()));
            tableModelKotelnyaParMikrolITM4.setChannel4(FloatCut.floatTwoDigs(deviceModelKotelnyaParMikrolITM4.getDeviceValuesRegister3()));
        }
        return tableModelKotelnyaParMikrolITM4;
    }
}
