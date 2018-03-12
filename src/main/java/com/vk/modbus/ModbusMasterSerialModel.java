package com.vk.modbus;

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

    public ModbusMasterSerialModel(String port, int baduRate, int dataBits,
                                   int stopBits, int parity, int timeout,
                                   int retries){
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
        master = factory.createRtuMaster(params);
        params.setCommPortId(port);
        params.setBaudRate(baduRate);
        params.setDataBits(dataBits);
        params.setStopBits(stopBits);
        params.setParity(parity);

        master.setTimeout(timeout);
        master.setRetries(retries);
        return master;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public int getBaduRate() {
        return baduRate;
    }

    public void setBaduRate(int baduRate) {
        this.baduRate = baduRate;
    }

    public int getDataBits() {
        return dataBits;
    }

    public void setDataBits(int dataBits) {
        this.dataBits = dataBits;
    }

    public int getStopBits() {
        return stopBits;
    }

    public void setStopBits(int stopBits) {
        this.stopBits = stopBits;
    }

    public int getParity() {
        return parity;
    }

    public void setParity(int parity) {
        this.parity = parity;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public int getRetries() {
        return retries;
    }

    public void setRetries(int retries) {
        this.retries = retries;
    }
}
