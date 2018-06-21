//package com.vk.repository.old_modbus;
//
//import com.serotonin.modbus4j.BatchRead;
//import com.serotonin.modbus4j.BatchResults;
//import com.serotonin.modbus4j.ModbusMaster;
//import com.serotonin.modbus4j.exception.ModbusInitException;
//import com.vk.entity.device.DeviceModelFirstCehSmesitel5MB110;
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.stereotype.Component;
//
///**
// * Created by User on 2018-04-28.
// */
//@Component
//@ComponentScan(basePackages = {"com.vk.configuration"})
//public class ModbusRepositoryImplFirstCehSmesitel5MB110 implements ModbusRepositoryFirstCehSmesitel5MB110{
//
//    @Autowired
//    private ModbusMaster modbusMasterSerialThird;
//
//    private final Logger LOGGER = Logger.getLogger(ModbusRepositoryImplFirstCehSmesitel5MB110.class);
//
//    @Override
//    public DeviceModelFirstCehSmesitel5MB110 getDeviceModel(){
//        DeviceModelFirstCehSmesitel5MB110 deviceModelFirstCehSmesitel5MB110 = new DeviceModelFirstCehSmesitel5MB110();
//        try {
//            modbusMasterSerialThird.init();
//            LOGGER.info("ModBus Listen slave address №"+
//                    deviceModelFirstCehSmesitel5MB110.getDeviceAddress()+
//                    "--"+modbusMasterSerialThird.testSlaveNode(deviceModelFirstCehSmesitel5MB110.getDeviceAddress()));
//        }
//        catch (ModbusInitException e){
//            LOGGER.error("ModBus Init problem, slave address №"+
//                    deviceModelFirstCehSmesitel5MB110.getDeviceAddress()+
//                    "--"+e.getMessage());
//        }
//        try {
//            BatchRead batchRead = new BatchRead();
//            for (int i=0; i<deviceModelFirstCehSmesitel5MB110.getArraySize(); i++){
//                batchRead.addLocator(deviceModelFirstCehSmesitel5MB110.getDeviceId()[i],
//                        deviceModelFirstCehSmesitel5MB110.getDeviceAddress(),
//                        deviceModelFirstCehSmesitel5MB110.getDeviceRegisterRange()[i],
//                        deviceModelFirstCehSmesitel5MB110.getDeviceAddressRegisters()[i],
//                        deviceModelFirstCehSmesitel5MB110.getDeviceDataType()[i]);
//            }
//            BatchResults batchResults = modbusMasterSerialThird.send(batchRead);
//            Float[] arr = new Float[deviceModelFirstCehSmesitel5MB110.getArraySize()];
//            for (int i=0; i<deviceModelFirstCehSmesitel5MB110.getArraySize(); i++){
//                deviceModelFirstCehSmesitel5MB110.setDeviceValuesRegistersIndex(i,
//                        (Float) batchResults.getValue(deviceModelFirstCehSmesitel5MB110.getDeviceId()[i]) );
//            }
//        }catch (Exception e){
//            LOGGER.error("ModBus Transport problem, slave address №"+
//                    deviceModelFirstCehSmesitel5MB110.getDeviceAddress()+
//                    "--"+e.getMessage());
//            Float[] arr = new Float[deviceModelFirstCehSmesitel5MB110.getArraySize()];
//            for (int i=0; i<deviceModelFirstCehSmesitel5MB110.getArraySize(); i++){
//                arr[i] = 0F;
//            }
//            deviceModelFirstCehSmesitel5MB110.setDeviceValuesRegisters(arr);
//        }
//        finally {
//            modbusMasterSerialThird.destroy();
//            LOGGER.info("ModBus Close connection (Transport problem), slave address №"+
//                    deviceModelFirstCehSmesitel5MB110.getDeviceAddress());
//        }
//        return deviceModelFirstCehSmesitel5MB110;
//    }
//}
