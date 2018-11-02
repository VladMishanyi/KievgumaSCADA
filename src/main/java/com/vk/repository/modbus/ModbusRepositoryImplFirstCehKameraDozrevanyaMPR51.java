package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.vk.entity.device.DeviceModelFirstCehBuzulukTRM200;
import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaMPR51;
import com.vk.entity.modbus.ModbusMasterSerialModel;
import com.vk.modbus.ModbusFloat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KIP-PC99 on 21.06.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class ModbusRepositoryImplFirstCehKameraDozrevanyaMPR51
        extends RootModbusRepositoryImpl<Float, ModbusFloat, DeviceModelFirstCehKameraDozrevanyaMPR51>
        implements ModbusRepositoryFirstCehKameraDozrevanyaMPR51 {

    private final ModbusMasterSerialModel modbusMasterSerialFirst;

    private final DeviceModelFirstCehKameraDozrevanyaMPR51 deviceModelFirstCehKameraDozrevanyaMPR51;

    private final BatchRead batchRead;

    private final ModbusFloat modbusFloat;

    @Autowired
    public ModbusRepositoryImplFirstCehKameraDozrevanyaMPR51(final ModbusMasterSerialModel modbusMasterSerialFirst,
                                                             final DeviceModelFirstCehKameraDozrevanyaMPR51 deviceModelFirstCehKameraDozrevanyaMPR51,
                                                             final BatchRead batchRead,
                                                             final ModbusFloat modbusFloat){
        super(modbusMasterSerialFirst, modbusFloat);
        this.modbusMasterSerialFirst = modbusMasterSerialFirst;
        this.deviceModelFirstCehKameraDozrevanyaMPR51 = deviceModelFirstCehKameraDozrevanyaMPR51;
        this.batchRead = batchRead;
        this.modbusFloat = modbusFloat;
    }

    @Override
    public DeviceModelFirstCehKameraDozrevanyaMPR51 getDeviceModel(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterSerialFirst,
                deviceModelFirstCehKameraDozrevanyaMPR51.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelFirstCehKameraDozrevanyaMPR51.getModbusLocator0(),
                deviceModelFirstCehKameraDozrevanyaMPR51.getModbusLocator1(),
                deviceModelFirstCehKameraDozrevanyaMPR51.getModbusLocator2());
        deviceModelFirstCehKameraDozrevanyaMPR51.setDeviceValuesRegister0(list.get(0));
        deviceModelFirstCehKameraDozrevanyaMPR51.setDeviceValuesRegister1(list.get(1));
        deviceModelFirstCehKameraDozrevanyaMPR51.setDeviceValuesRegister2(list.get(2));
        return deviceModelFirstCehKameraDozrevanyaMPR51;
    }

//    @Override
//    public boolean getModbusStatus() {
//        return modbusFloat.getModbusStatus();
//    }
//
//    @Override
//    public String getMasterName(){
//        return modbusMasterSerialFirst.getPort();
//    }
}
