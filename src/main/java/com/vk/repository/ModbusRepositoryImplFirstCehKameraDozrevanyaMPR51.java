package com.vk.repository;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.BatchResults;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.exception.ModbusInitException;
import com.vk.entity.device.DeviceModelFirstCehBuzulukTRM200;
import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaMPR51;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"com.vk.configuration"})
public class ModbusRepositoryImplFirstCehKameraDozrevanyaMPR51 implements ModbusRepositoryFirstCehKameraDozrevanyaMPR51{

    @Autowired
    private ModbusMaster modbusMasterSerialFirst;

    private final Logger LOGGER = Logger.getLogger(ModbusRepositoryImplFirstCehKameraDozrevanyaMPR51.class);

    @Override
    public DeviceModelFirstCehKameraDozrevanyaMPR51 getDeviceModel(){
        DeviceModelFirstCehKameraDozrevanyaMPR51 deviceModelFirstCehKameraDozrevanyaMPR51 = new DeviceModelFirstCehKameraDozrevanyaMPR51();
        try {
            modbusMasterSerialFirst.init();
            LOGGER.info("ModBus Listen slave address №"+
                    deviceModelFirstCehKameraDozrevanyaMPR51.getDeviceAddress()+
                    "--"+modbusMasterSerialFirst.testSlaveNode(deviceModelFirstCehKameraDozrevanyaMPR51.getDeviceAddress()));
        }
        catch (ModbusInitException e){
            LOGGER.error("ModBus Init problem, slave address №"+
                    deviceModelFirstCehKameraDozrevanyaMPR51.getDeviceAddress()+
                    "--"+e.getMessage());
        }
        try {
            BatchRead batchRead = new BatchRead();
            for (int i=0; i<deviceModelFirstCehKameraDozrevanyaMPR51.getArraySize(); i++){
                batchRead.addLocator(deviceModelFirstCehKameraDozrevanyaMPR51.getDeviceId()[i],
                        deviceModelFirstCehKameraDozrevanyaMPR51.getDeviceAddress(),
                        deviceModelFirstCehKameraDozrevanyaMPR51.getDeviceRegisterRange()[i],
                        deviceModelFirstCehKameraDozrevanyaMPR51.getDeviceAddressRegisters()[i],
                        deviceModelFirstCehKameraDozrevanyaMPR51.getDeviceDataType()[i]);
            }
            BatchResults batchResults = modbusMasterSerialFirst.send(batchRead);
            Float[] arr = new Float[deviceModelFirstCehKameraDozrevanyaMPR51.getArraySize()];
            for (int i=0; i<deviceModelFirstCehKameraDozrevanyaMPR51.getArraySize(); i++){
                deviceModelFirstCehKameraDozrevanyaMPR51.setDeviceValuesRegistersIndex(i,
                        (Float) batchResults.getValue(deviceModelFirstCehKameraDozrevanyaMPR51.getDeviceId()[i]) );
            }
        }catch (Exception e){
            LOGGER.error("ModBus Transport problem, slave address №"+
                    deviceModelFirstCehKameraDozrevanyaMPR51.getDeviceAddress()+
                    "--"+e.getMessage());
            Float[] arr = new Float[deviceModelFirstCehKameraDozrevanyaMPR51.getArraySize()];
            for (int i=0; i<deviceModelFirstCehKameraDozrevanyaMPR51.getArraySize(); i++){
                arr[i] = 0F;
            }
            deviceModelFirstCehKameraDozrevanyaMPR51.setDeviceValuesRegisters(arr);
        }
        finally {
            modbusMasterSerialFirst.destroy();
            LOGGER.info("ModBus Close connection (Transport problem), slave address №"+
                    deviceModelFirstCehKameraDozrevanyaMPR51.getDeviceAddress());
        }
        return deviceModelFirstCehKameraDozrevanyaMPR51;
    }
}
