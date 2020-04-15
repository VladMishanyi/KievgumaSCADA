package com.vk.tasks;

import com.vk.entity.converter.DeviceToTable;
import com.vk.entity.converter.DeviceToTableEnergeticRoomTRM201;
import com.vk.entity.converter.DeviceToTableImplEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModel;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModel;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.service.data.EnergeticRoomTRM201ServiceData;
import com.vk.service.data.RootServiceData;
import com.vk.service.data.RootServiceDataImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.core.MessageSendingOperations;

/**
 * Created by KIP-PC99 on 03.08.2018.
 */
public class TaskImplRoot<I extends Number,
        S extends Number,
        T extends RootServiceData,
        G extends RootServiceData,
        K extends DeviceModel,
        F extends DeviceModel,
        A extends TableModel,
        E extends DeviceToTable<K, F, A>> implements TaskRoot{

    private MessageSendingOperations<String> messageSendingOperations;

    private T serviceData1;

    private G serviceData2;

    private E deviceToTable1;

    private String message = "/table";

    private String message1 = "/device1";

    private String message2 = "/device2";

    public TaskImplRoot(){}

    public TaskImplRoot(final MessageSendingOperations<String> messageSendingOperations,
                        final E deviceToTable1,
                        final T serviceData1){
        this.messageSendingOperations = messageSendingOperations;
        this.deviceToTable1 = deviceToTable1;
        this.serviceData1 = serviceData1;
    }

    public TaskImplRoot(final MessageSendingOperations<String> messageSendingOperations,
                        final E deviceToTable1,
                        final T serviceData1,
                        final G serviceData2){
        this.messageSendingOperations = messageSendingOperations;
        this.deviceToTable1 = deviceToTable1;
        this.serviceData1 = serviceData1;
        this.serviceData2 = serviceData2;

    }

    public synchronized MessageSendingOperations<String> getMessageSendingOperations() {
        return messageSendingOperations;
    }

    public synchronized void setMessageSendingOperations(final MessageSendingOperations<String> messageSendingOperations) {
        this.messageSendingOperations = messageSendingOperations;
    }

    public synchronized T getServiceData1() {
        return serviceData1;
    }

    public synchronized void setServiceData1(final T serviceData1) {
        this.serviceData1 = serviceData1;
    }

    public synchronized G getServiceData2() {
        return serviceData2;
    }

    public synchronized void setServiceData2(final G serviceData2) {
        this.serviceData2 = serviceData2;
    }

    public synchronized E getDeviceToTable1() {
        return deviceToTable1;
    }

    public synchronized void setDeviceToTable1(final E deviceToTable1) {
        this.deviceToTable1 = deviceToTable1;
    }

    public synchronized String getMessage() {
        return message;
    }

    public synchronized void setMessage(final String message) {
        this.message = message;
    }

    public String getMessage1() {
        return message1;
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    public String getMessage2() {
        return message2;
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    @Override
    public synchronized void work1() {
        final K deviceModel1 = (K) serviceData1.getModbusDevice();
        final A tableModel = deviceToTable1.convert(deviceModel1);
        messageSendingOperations.convertAndSend(message, tableModel);
        messageSendingOperations.convertAndSend(message1, deviceModel1);
        if (deviceModel1.hysteresis()){
            serviceData1.addTabeDevice(tableModel);
        }
    }

    @Override
    public synchronized void work2() {
        final K deviceModel1 = (K) serviceData1.getModbusDevice();
        final F deviceModel2 = (F) serviceData2.getModbusDevice();
        final A tableModel = deviceToTable1.convert(deviceModel1, deviceModel2);
        messageSendingOperations.convertAndSend(message, tableModel);
        messageSendingOperations.convertAndSend(message1, deviceModel1);
        messageSendingOperations.convertAndSend(message2, deviceModel2);
        if (deviceModel1.hysteresis() || deviceModel2.hysteresis()){
            serviceData1.addTabeDevice(tableModel);
        }
    }
}
