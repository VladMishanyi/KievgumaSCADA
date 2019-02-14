package com.vk.entity.modbus;

import com.serotonin.modbus4j.ModbusFactory;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.ip.IpParameters;

/**
 * Created by KIP-PC99 on 03.01.2019.
 */
public class ModbusMasterTcpModel {
    private String host;
    private int port;
    private int timeout;
    private int retries;
    private ModbusFactory modbusFactory;
    private IpParameters ipParameters;
    private ModbusMaster modbusMaster;

    public ModbusMasterTcpModel(){}

    public ModbusMasterTcpModel(String host,
                                int port,
                                int timeout,
                                int retries){
        this.host = host;
        this.port = port;
        this.timeout = timeout;
        this.retries = retries;
    }

    public ModbusMaster getMaster(){
        modbusFactory = new ModbusFactory();
        ipParameters = new IpParameters();
        ipParameters.setHost(host);
        ipParameters.setPort(port);

        modbusMaster = modbusFactory.createTcpMaster(ipParameters, true);
        modbusMaster.setTimeout(timeout);
        modbusMaster.setRetries(retries);
        return modbusMaster;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
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

    public ModbusFactory getModbusFactory() {
        return modbusFactory;
    }

    public void setModbusFactory(ModbusFactory modbusFactory) {
        this.modbusFactory = modbusFactory;
    }

    public IpParameters getIpParameters() {
        return ipParameters;
    }

    public void setIpParameters(IpParameters ipParameters) {
        this.ipParameters = ipParameters;
    }

    public ModbusMaster getModbusMaster() {
        return modbusMaster;
    }

    public void setModbusMaster(ModbusMaster modbusMaster) {
        this.modbusMaster = modbusMaster;
    }
}
