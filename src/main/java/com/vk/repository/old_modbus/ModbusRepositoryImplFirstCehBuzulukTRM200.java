//package com.vk.repository.old_modbus;
//
//import com.serotonin.modbus4j.BatchRead;
//import com.serotonin.modbus4j.BatchResults;
//import com.serotonin.modbus4j.ModbusMaster;
//import com.serotonin.modbus4j.exception.ModbusInitException;
//import com.vk.entity.device.DeviceModelFirstCehBuzulukTRM200;
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.stereotype.Component;
//
//@Component
//@ComponentScan(basePackages = {"com.vk.configuration"})
//public class ModbusRepositoryImplFirstCehBuzulukTRM200 implements ModbusRepositoryFirstCehBuzulukTRM200{
//
//    @Autowired
//    private ModbusMaster modbusMasterSerialFirst;
//
//    private final Logger LOGGER = Logger.getLogger(ModbusRepositoryImplFirstCehBuzulukTRM200.class);
//
//    @Override
//    public DeviceModelFirstCehBuzulukTRM200 getDeviceModel(){
//        DeviceModelFirstCehBuzulukTRM200 deviceModelFirstCehBuzulukTRM200 = new DeviceModelFirstCehBuzulukTRM200();
//        try {
//            modbusMasterSerialFirst.init();
//            LOGGER.info("ModBus Listen slave address №"+
//                    deviceModelFirstCehBuzulukTRM200.getDeviceAddress()+
//                    "--"+modbusMasterSerialFirst.testSlaveNode(deviceModelFirstCehBuzulukTRM200.getDeviceAddress()));
//        }
//        catch (ModbusInitException e){
//            LOGGER.error("ModBus Init problem, slave address №"+
//                    deviceModelFirstCehBuzulukTRM200.getDeviceAddress()+
//                    "--"+e.getMessage());
//        }
//        try {
//            BatchRead batchRead = new BatchRead();
//            for (int i=0; i<deviceModelFirstCehBuzulukTRM200.getArraySize(); i++){
//                batchRead.addLocator(deviceModelFirstCehBuzulukTRM200.getDeviceId()[i],
//                        deviceModelFirstCehBuzulukTRM200.getDeviceAddress(),
//                        deviceModelFirstCehBuzulukTRM200.getDeviceRegisterRange()[i],
//                        deviceModelFirstCehBuzulukTRM200.getDeviceAddressRegisters()[i],
//                        deviceModelFirstCehBuzulukTRM200.getDeviceDataType()[i]);
//            }
//            BatchResults batchResults = modbusMasterSerialFirst.send(batchRead);
//            Float[] arr = new Float[deviceModelFirstCehBuzulukTRM200.getArraySize()];
//            for (int i=0; i<deviceModelFirstCehBuzulukTRM200.getArraySize(); i++){
//                deviceModelFirstCehBuzulukTRM200.setDeviceValuesRegistersIndex(i,
//                        (Float) batchResults.getValue(deviceModelFirstCehBuzulukTRM200.getDeviceId()[i]) );
//            }
//        }catch (Exception e){
//            LOGGER.error("ModBus Transport problem, slave address №"+
//                    deviceModelFirstCehBuzulukTRM200.getDeviceAddress()+
//                    "--"+e.getMessage());
//            Float[] arr = new Float[deviceModelFirstCehBuzulukTRM200.getArraySize()];
//            for (int i=0; i<deviceModelFirstCehBuzulukTRM200.getArraySize(); i++){
//                arr[i] = 0F;
//            }
//            deviceModelFirstCehBuzulukTRM200.setDeviceValuesRegisters(arr);
//        }
//        finally {
//            modbusMasterSerialFirst.destroy();
//            LOGGER.info("ModBus Close connection (Transport problem), slave address №"+
//                    deviceModelFirstCehBuzulukTRM200.getDeviceAddress());
//        }
//        return deviceModelFirstCehBuzulukTRM200;
//    }
//}
