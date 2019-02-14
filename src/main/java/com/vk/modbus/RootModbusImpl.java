package com.vk.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.BatchResults;
import com.serotonin.modbus4j.ModbusLocator;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.exception.ModbusInitException;
import com.vk.entity.modbus.ModbusMasterSerialModel;
import com.vk.entity.modbus.ModbusMasterTcpModel;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KIP-PC99 on 15.06.2018.
 */

public abstract class RootModbusImpl<E extends Number> implements RootModbus<E> {

    private Logger LOGGER = Logger.getLogger(RootModbusImpl.class);

    public RootModbusImpl(){}

    @Override
    public synchronized List<E> readDataFromModBus(ModbusMasterSerialModel modbusMasterSerialModel,
                                      final int adr,
                                      final BatchRead batch,
                                      final boolean enableBatch,
                                      final ModbusLocator ... modbusLocator){
        ModbusMaster modbusMaster = modbusMasterSerialModel.getMaster();
        return readData(modbusMaster, adr, batch, enableBatch, modbusLocator);
    }

    @Override
    public synchronized List<E> readDataFromModBus(ModbusMasterTcpModel modbusMasterTcpModel,
                                                   final int adr,
                                                   final BatchRead batch,
                                                   final boolean enableBatch,
                                                   final ModbusLocator ... modbusLocator){
        ModbusMaster modbusMaster = modbusMasterTcpModel.getMaster();
        return readData(modbusMaster, adr, batch, enableBatch, modbusLocator);
    }

    private synchronized List<E> readData(ModbusMaster modbusMaster,
                                         final int adr,
                                         final BatchRead batch,
                                         final boolean enableBatch,
                                         final ModbusLocator ... modbusLocator){
        List<E> list = new ArrayList<>();
        try {
            modbusMaster.init();
            boolean test = modbusMaster.testSlaveNode(adr);
            LOGGER.info("ModBus Listen slave address №"+ adr + "--"+test);
            System.out.println("ModBus Listen slave address №"+ adr + "--"+test);
        }
        catch (ModbusInitException e){
            String message = e.getMessage();
            LOGGER.error("ModBus Init problem, slave address №"+ adr+ "--"+message);
            System.out.println("ModBus Init problem, slave address №"+ adr+ "--"+message);
        }
        finally {
            try {
                if (enableBatch){
                    for (int i=0; i < modbusLocator.length; i++){
                        batch.addLocator(i,modbusLocator[i]);
                    }
                    BatchResults batchResults = modbusMaster.send(batch);
                    for (int i=0; i < modbusLocator.length; i++){
                        list.add(i, (E) batchResults.getValue(i));
                    }
                }else {
                    for (int i=0; i < modbusLocator.length; i++){
                        list.add(i, (E) modbusMaster.getValue(modbusLocator[i]));
                    }
                }

            }catch (Exception e){
                String message = e.getMessage();
                LOGGER.error("ModBus Transport problem, slave address №"+ adr+ "--"+message);
                System.out.println("ModBus Transport problem, slave address №"+ adr+ "--"+message);
                setValuesDefault(list, modbusLocator.length);
            }
            finally {
                LOGGER.info("ModBus Close connection, slave address №"+ adr);
                System.out.println("ModBus Close connection, slave address №"+ adr);
                modbusMaster.destroy();
            }
            //-----------------------------------------------------------------------------
            String form = "---";
            for (int i=0; i < modbusLocator.length; i++){
                form = form + list.get(i) + "---";
            }
            System.out.println("Device №" + adr + "  "+ form);
            //-----------------------------------------------------------------------------
        }
        return list;
    }

    @Override
    public synchronized void writeDataToModBus(ModbusMasterSerialModel modbusMasterSerialModel,
                                  final int adr,
                                  final E values,
                                  final ModbusLocator modbusLocator){
        ModbusMaster modbusMaster = modbusMasterSerialModel.getMaster();
        writeData(modbusMaster, adr, values, modbusLocator);
    }

    @Override
    public synchronized void writeDataToModBus(ModbusMasterTcpModel modbusMasterTcpModel,
                                               final int adr,
                                               final E values,
                                               final ModbusLocator modbusLocator){
        ModbusMaster modbusMaster = modbusMasterTcpModel.getMaster();
        writeData(modbusMaster, adr, values, modbusLocator);
    }

    private synchronized void writeData(ModbusMaster modbusMaster, final int adr,
                                       final E values,
                                       final ModbusLocator modbusLocator){
        try {
            modbusMaster.init();
            boolean test = modbusMaster.testSlaveNode(adr);
            LOGGER.info("ModBus Listen slave address №"+ adr + "--"+test);
            System.out.println("ModBus Listen slave address №"+ adr + "--"+test);
        }
        catch (ModbusInitException e){
            String message = e.getMessage();
            LOGGER.error("ModBus Init problem, slave address №"+ adr+ "--"+message);
            System.out.println("ModBus Init problem, slave address №"+ adr+ "--"+message);
        }
        finally {
            try {
                modbusMaster.setValue(modbusLocator, values);
            }catch (Exception e){
                String message = e.getMessage();
                LOGGER.error("ModBus Transport problem, slave address №"+ adr+ "--"+message);
                System.out.println("ModBus Transport problem, slave address №"+ adr+ "--"+message);
            }
            finally {
                LOGGER.info("ModBus Close connection, slave address №"+ adr);
                System.out.println("ModBus Close connection, slave address №"+ adr);
                modbusMaster.destroy();
            }
        }
    }

    abstract void setValuesDefault(List<E> list, int length);
}
