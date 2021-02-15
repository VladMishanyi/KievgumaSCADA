package com.vk.entity.device;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@PropertySource(value = "classpath:raspberry-energetic-room.properties")
public class DeviceModelEnergeticRoomRaspberry  implements DeviceModel{

    @Value("${raspberry-energetic.ip}")
    private String ip;

    @Value("${raspberry-energetic.tomcat-port}")
    private String tomcatPort;

    public DeviceModelEnergeticRoomRaspberry() {
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
        return "DeviceModelRaspberry{" +
                "ip='" + ip + '\'' +
                ", tomcatPort='" + tomcatPort + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeviceModelEnergeticRoomRaspberry that = (DeviceModelEnergeticRoomRaspberry) o;
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

    @Override
    public boolean hysteresis() {
        return false;
    }
}
