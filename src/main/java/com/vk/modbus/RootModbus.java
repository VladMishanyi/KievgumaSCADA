package com.vk.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusLocator;
import com.vk.entity.modbus.ModbusMasterSerialModel;
import com.vk.entity.modbus.ModbusMasterTcpModel;

import java.util.List;

/**
 * Created by KIP-PC99 on 20.06.2018.
 */
public interface RootModbus<E extends Number> {

    void setUseBorders(boolean useBorders);

    List<E> readDataFromModBus(ModbusMasterSerialModel modbusMasterSerialModel,
                                      int adr, BatchRead<Integer> batch,
                                      boolean enableBatch,
                                      ModbusLocator... modbusLocator);

    List<E> readDataFromModBus(ModbusMasterTcpModel modbusMasterTcpModel,
                                      int adr, BatchRead<Integer> batch,
                                      boolean enableBatch,
                                      ModbusLocator... modbusLocator);

    void writeDataToModBus(ModbusMasterSerialModel modbusMasterSerialModel,
                                  int adr,
                                  E values,
                                  ModbusLocator modbusLocator);

    void writeDataToModBus(ModbusMasterTcpModel modbusMasterTcpModel,
                                  int adr,
                                  E values,
                                  ModbusLocator modbusLocator);
}
