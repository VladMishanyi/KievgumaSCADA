package com.vk.entity.device;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:raspberry-energetic-room.properties")
public class DeviceModelEnergeticRoomRaspberry {

    @Value("${raspberry.ip}")
    private String ip;

    @Value("${raspberry.tomcat-port}")
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
}
