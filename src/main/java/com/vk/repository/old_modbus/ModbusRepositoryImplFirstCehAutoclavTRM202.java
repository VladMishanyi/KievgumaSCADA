//package com.vk.repository.old_modbus;
//
//import com.serotonin.modbus4j.BatchRead;
//import com.serotonin.modbus4j.BatchResults;
//import com.serotonin.modbus4j.ModbusMaster;
//import com.serotonin.modbus4j.exception.ModbusInitException;
//import com.vk.entity.device.DeviceModelFirstCehAutoclavTRM202;
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.stereotype.Component;
//
//@Component
//@ComponentScan(basePackages = {"com.vk.configuration"})
//public class ModbusRepositoryImplFirstCehAutoclavTRM202 implements ModbusRepositoryFirstCehAutoclavTRM202{
//
//    @Autowired
//    private ModbusMaster modbusMasterSerialFirst;
//
//    private final Logger LOGGER = Logger.getLogger(ModbusRepositoryImplFirstCehAutoclavTRM202.class);
//
//    @Override
//    public DeviceModelFirstCehAutoclavTRM202 getDeviceModel(){
//        DeviceModelFirstCehAutoclavTRM202 deviceModelFirstCehAutoclavTRM202 = new DeviceModelFirstCehAutoclavTRM202();
//        try {
//            modbusMasterSerialFirst.init();
//            LOGGER.info("ModBus Listen slave address №"+
//                    deviceModelFirstCehAutoclavTRM202.getDeviceAddress()+
//                    "--"+modbusMasterSerialFirst.testSlaveNode(deviceModelFirstCehAutoclavTRM202.getDeviceAddress()));
//        }
//        catch (ModbusInitException e){
//            LOGGER.error("ModBus Init problem, slave address №"+
//                    deviceModelFirstCehAutoclavTRM202.getDeviceAddress()+
//                    "--"+e.getMessage());
//        }
//        try {
//            BatchRead batchRead = new BatchRead();
//            for (int i=0; i<deviceModelFirstCehAutoclavTRM202.getArraySize(); i++){
//                batchRead.addLocator(deviceModelFirstCehAutoclavTRM202.getDeviceId()[i],
//                        deviceModelFirstCehAutoclavTRM202.getDeviceAddress(),
//                        deviceModelFirstCehAutoclavTRM202.getDeviceRegisterRange()[i],
//                        deviceModelFirstCehAutoclavTRM202.getDeviceAddressRegisters()[i],
//                        deviceModelFirstCehAutoclavTRM202.getDeviceDataType()[i]);
//            }
//            BatchResults batchResults = modbusMasterSerialFirst.send(batchRead);
//            Float[] arr = new Float[deviceModelFirstCehAutoclavTRM202.getArraySize()];
//            for (int i=0; i<deviceModelFirstCehAutoclavTRM202.getArraySize(); i++){
//                deviceModelFirstCehAutoclavTRM202.setDeviceValuesRegistersIndex(i,
//                        (Float) batchResults.getValue(deviceModelFirstCehAutoclavTRM202.getDeviceId()[i]) );
//            }
//        }catch (Exception e){
//            LOGGER.error("ModBus Transport problem, slave address №"+
//                    deviceModelFirstCehAutoclavTRM202.getDeviceAddress()+
//                    "--"+e.getMessage());
//            Float[] arr = new Float[deviceModelFirstCehAutoclavTRM202.getArraySize()];
//            for (int i=0; i<deviceModelFirstCehAutoclavTRM202.getArraySize(); i++){
//                arr[i] = 0F;
//            }
//            deviceModelFirstCehAutoclavTRM202.setDeviceValuesRegisters(arr);
//        }
//        finally {
//            modbusMasterSerialFirst.destroy();
//            LOGGER.info("ModBus Close connection (Transport problem), slave address №"+
//                    deviceModelFirstCehAutoclavTRM202.getDeviceAddress());
//        }
//        return deviceModelFirstCehAutoclavTRM202;
//    }
//}
