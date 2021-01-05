package com.vk.entity.device;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@PropertySource(value = "classpath:second-ceh-balon-raspberry.properties")
public class DeviceModelSecondCehBalonRaspberry implements DeviceModel{

    @Value("${raspberry.ip}")
    private String ip;

    @Value("${raspberry.tomcat-port}")
    private String tomcatPort;

    public DeviceModelSecondCehBalonRaspberry() {
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getTomcatPort() {
        return tomcatPort;
    }

    public void setTomcatPort(String tomcatPort) {
        this.tomcatPort = tomcatPort;
    }

    @Override
    public String toString() {
        return "DeviceModelSecondCehBalonRaspberry{" +
                "ip='" + ip + '\'' +
                ", tomcatPort='" + tomcatPort + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeviceModelSecondCehBalonRaspberry that = (DeviceModelSecondCehBalonRaspberry) o;
        return Objects.equals(ip, that.ip) && Objects.equals(tomcatPort, that.tomcatPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, tomcatPort);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
