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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.core.MessageSendingOperations;

/**
 * Created by KIP-PC99 on 03.08.2018.
 */
public class TaskImplRoot<I extends Number,
        T extends RootServiceData,
        G extends RootServiceData,
        K extends DeviceModel<I>,
        F extends DeviceModel<I>,
        A extends TableModel,
        E extends DeviceToTable<K, F, A>> implements TaskRoot{

    private MessageSendingOperations<String> messageSendingOperations;

    private T serviceData1;

    private G serviceData2;

    private E deviceToTable1;

    private String message;

    public TaskImplRoot(){}

    public TaskImplRoot(MessageSendingOperations<String> messageSendingOperations,
                        E deviceToTable1,
                        T serviceData1){
        this.messageSendingOperations = messageSendingOperations;
        this.deviceToTable1 = deviceToTable1;
        this.serviceData1 = serviceData1;
    }

    public TaskImplRoot(MessageSendingOperations<String> messageSendingOperations,
                        E deviceToTable1,
                        T serviceData1,
                        G serviceData2){
        this.messageSendingOperations = messageSendingOperations;
        this.deviceToTable1 = deviceToTable1;
        this.serviceData1 = serviceData1;
        this.serviceData2 = serviceData2;

    }

    public MessageSendingOperations<String> getMessageSendingOperations() {
        return messageSendingOperations;
    }

    public void setMessageSendingOperations(MessageSendingOperations<String> messageSendingOperations) {
        this.messageSendingOperations = messageSendingOperations;
    }

    public T getServiceData1() {
        return serviceData1;
    }

    public void setServiceData1(T serviceData1) {
        this.serviceData1 = serviceData1;
    }

    public G getServiceData2() {
        return serviceData2;
    }

    public void setServiceData2(G serviceData2) {
        this.serviceData2 = serviceData2;
    }

    public E getDeviceToTable1() {
        return deviceToTable1;
    }

    public void setDeviceToTable1(E deviceToTable1) {
        this.deviceToTable1 = deviceToTable1;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void work1() {
        K deviceModel1 = (K) serviceData1.getModbusDevice();
        A tableModel = deviceToTable1.convert(deviceModel1);
        messageSendingOperations.convertAndSend(message, tableModel);
        if (deviceModel1.hysteresis()){
            serviceData1.addTabeDevice(tableModel);
        }
    }

    @Override
    public void work2() {
        K deviceModel1 = (K) serviceData1.getModbusDevice();
        F deviceModel2 = (F) serviceData2.getModbusDevice();
        A tableModel = deviceToTable1.convert(deviceModel1, deviceModel2);
        messageSendingOperations.convertAndSend(message, tableModel);
        if (deviceModel1.hysteresis() || deviceModel2.hysteresis()){
            serviceData1.addTabeDevice(tableModel);
        }
    }
}
