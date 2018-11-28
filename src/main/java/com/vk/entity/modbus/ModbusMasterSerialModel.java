package com.vk.entity.modbus;

import com.serotonin.io.serial.SerialParameters;
import com.serotonin.modbus4j.ModbusFactory;
import com.serotonin.modbus4j.ModbusMaster;


/**
 * Created by User on 2018-02-22.
 */
public class ModbusMasterSerialModel {
    private String port;
    private int baduRate;
    private int dataBits;
    private int stopBits;
    private int parity;
    private int timeout;
    private int retries;
    private ModbusFactory factory;
    private SerialParameters params;
    private ModbusMaster master;

    public ModbusMasterSerialModel(){}

    public ModbusMasterSerialModel(final String port,
                                   final int baduRate,
                                   final int dataBits,
                                   final int stopBits,
                                   final int parity,
                                   final int timeout,
                                   final int retries){
        this.port = port;
        this.baduRate = baduRate;
        this.dataBits = dataBits;
        this.stopBits = stopBits;
        this.parity = parity;
        this.timeout = timeout;
        this.retries = retries;
    }

    public ModbusMaster getMaster(){
        factory = new ModbusFactory();
        params = new SerialParameters();
        params.setCommPortId(port);
        params.setBaudRate(baduRate);
        params.setDataBits(dataBits);
        params.setStopBits(stopBits);
        params.setParity(parity);

        master = factory.createRtuMaster(params);
        master.setTimeout(timeout);
        master.setRetries(retries);
        return master;
    }

    public String getPort() {
        return port;
    }

    public void setPort(final String port) {
        this.port = port;
    }

    public int getBaduRate() {
        return baduRate;
    }

    public void setBaduRate(final int baduRate) {
        this.baduRate = baduRate;
    }

    public int getDataBits() {
        return dataBits;
    }

    public void setDataBits(final int dataBits) {
        this.dataBits = dataBits;
    }

    public int getStopBits() {
        return stopBits;
    }

    public void setStopBits(final int stopBits) {
        this.stopBits = stopBits;
    }

    public int getParity() {
        return parity;
    }

    public void setParity(final int parity) {
        this.parity = parity;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(final int timeout) {
        this.timeout = timeout;
    }

    public int getRetries() {
        return retries;
    }

    public void setRetries(final int retries) {
        this.retries = retries;
    }
}
