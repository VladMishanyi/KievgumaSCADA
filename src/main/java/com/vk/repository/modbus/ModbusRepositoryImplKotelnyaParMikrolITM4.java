package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.vk.entity.device.DeviceModelKotelnyaParMikrolITM4;
import com.vk.entity.modbus.ModbusMasterSerialModel;
import com.vk.modbus.ModbusFloat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KIP-PC99 on 08.08.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class ModbusRepositoryImplKotelnyaParMikrolITM4
        extends RootModbusRepositoryImpl<Float, ModbusFloat, DeviceModelKotelnyaParMikrolITM4>
        implements ModbusRepositoryKotelnyaParMikrolITM4 {

    private final ModbusMasterSerialModel modbusMasterSerialFirst;

    private final DeviceModelKotelnyaParMikrolITM4 deviceModelKotelnyaParMikrolITM4;

    private final BatchRead<Integer> batchRead;

    private final ModbusFloat modbusFloat;

    @Autowired
    public ModbusRepositoryImplKotelnyaParMikrolITM4(final ModbusMasterSerialModel modbusMasterSerialFirst,
                                                     final DeviceModelKotelnyaParMikrolITM4 deviceModelKotelnyaParMikrolITM4,
                                                     final BatchRead<Integer> batchRead,
                                                     final ModbusFloat modbusFloat){
        super(modbusFloat);
        this.modbusMasterSerialFirst = modbusMasterSerialFirst;
        this.deviceModelKotelnyaParMikrolITM4 = deviceModelKotelnyaParMikrolITM4;
        this.batchRead = batchRead;
        this.modbusFloat = modbusFloat;
    }

    @Override
    public DeviceModelKotelnyaParMikrolITM4 getDeviceModel(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterSerialFirst,
                deviceModelKotelnyaParMikrolITM4.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelKotelnyaParMikrolITM4.getModbusLocator0(),
                deviceModelKotelnyaParMikrolITM4.getModbusLocator1(),
                deviceModelKotelnyaParMikrolITM4.getModbusLocator2(),
                deviceModelKotelnyaParMikrolITM4.getModbusLocator3());
        deviceModelKotelnyaParMikrolITM4.setDeviceValuesRegister0(list.get(0));
        deviceModelKotelnyaParMikrolITM4.setDeviceValuesRegister1(list.get(1));
        deviceModelKotelnyaParMikrolITM4.setDeviceValuesRegister2(list.get(2));
        deviceModelKotelnyaParMikrolITM4.setDeviceValuesRegister3(list.get(3));
        return deviceModelKotelnyaParMikrolITM4;
    }
}
