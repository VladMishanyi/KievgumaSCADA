package com.vk.threads;

//import com.serotonin.modbus4j.Modbus;
//
//import javax.jws.soap.SOAPBinding;

/**
 * Created by User on 2017-06-15.
 */
public class ModbusThread extends Thread {

    private String name;
    private User user;
    private boolean control = false;

    ModbusThread(){}

    ModbusThread(Thread thread){
        this.start();
    }

    ModbusThread(String name, User user){
        this.name = name;
        this.user = user;
        this.start();
    }

    @Override
    public void run() {
        user.getGods(name, control);
    }

    public boolean isControl() {
        return control;
    }

    public void setControl(boolean control) {
        this.control = control;
    }
}
