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

    public List<E> readDataFromModBus(ModbusMasterSerialModel modbusMasterSerialModel,
                                      int adr, BatchRead batch,
                                      boolean enableBatch,
                                      ModbusLocator... modbusLocator);

    public List<E> readDataFromModBus(ModbusMasterTcpModel modbusMasterTcpModel,
                                      int adr, BatchRead batch,
                                      boolean enableBatch,
                                      ModbusLocator... modbusLocator);

    public void writeDataToModBus(ModbusMasterSerialModel modbusMasterSerialModel,
                                  int adr,
                                  E values,
                                  ModbusLocator modbusLocator);

    public void writeDataToModBus(ModbusMasterTcpModel modbusMasterTcpModel,
                                  int adr,
                                  E values,
                                  ModbusLocator modbusLocator);
}
