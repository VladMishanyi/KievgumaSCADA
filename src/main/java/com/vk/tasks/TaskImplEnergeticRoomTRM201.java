package com.vk.tasks;

import com.vk.entity.converter.DeviceToTableEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM202;
import com.vk.entity.json.JsonBodyListForTableModelTRM202;
import com.vk.entity.table.TableModelEnergeticRoomTRM202;
import com.vk.service.data.EnergeticRoomTRM201ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Created by KIP-PC99 on 03.08.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service.data", "com.vk.entity.converter"})
public class TaskImplEnergeticRoomTRM201 implements TaskEnergeticRoomTRM201{

    private final EnergeticRoomTRM201ServiceData energeticRoomTRM201ServiceData;

    private DeviceModelEnergeticRoomTRM202 deviceModelEnergeticRoomTRM202;

    @Autowired
    public TaskImplEnergeticRoomTRM201(final EnergeticRoomTRM201ServiceData energeticRoomTRM201ServiceData,
                                       DeviceModelEnergeticRoomTRM202 deviceModelEnergeticRoomTRM202){
        this.energeticRoomTRM201ServiceData = energeticRoomTRM201ServiceData;
        this.deviceModelEnergeticRoomTRM202 = deviceModelEnergeticRoomTRM202;

    }

    @Override
    public void readModbusAndSendMessage() {
        deviceModelEnergeticRoomTRM202 = energeticRoomTRM201ServiceData.jsonReadDeviceModelTRM202allRegisters();
        energeticRoomTRM201ServiceData.messageSendDevice(deviceModelEnergeticRoomTRM202);
    }

    @Override
    public void syncDatabase(){
        OffsetDateTime dateTimeCurrent = startOffsetLocalDateTime();
        OffsetDateTime dateTimeEnd = endOffsetLocalDateTime();
        OffsetDateTime current = dateTimeCurrent;
        while (current.isBefore(dateTimeEnd)) {
            OffsetDateTime next = current.plusHours(1);
            energeticRoomTRM201ServiceData.databaseAddAllTableDevice(readTableModelBetweenDate(current.toLocalDateTime(), next.toLocalDateTime()));
            current = next;
        }
    }

    private LocalDateTime readStartEndpoinDate(){
        LocalDateTime localDateTime = LocalDateTime.now().minusYears(1L);
        TableModelEnergeticRoomTRM202 tableModelTRM202 = energeticRoomTRM201ServiceData.databaseFindLastValueByDate();
        if (Objects.isNull(tableModelTRM202)) return localDateTime;
        return tableModelTRM202.getDate();
    }

    private LocalDateTime readEndEndpoinDate(){
        TableModelEnergeticRoomTRM202 tableModelTRM202 = energeticRoomTRM201ServiceData.jsonReadTableModelTRM202Last();
        return tableModelTRM202.getDate();
    }

    private List<TableModelEnergeticRoomTRM202> readTableModelBetweenDate(LocalDateTime readStartEndpoinDate, LocalDateTime readEndEndpoinDate){
        JsonBodyListForTableModelTRM202 jsonBodyListForTableModelTRM202 = energeticRoomTRM201ServiceData.jsonReadTableModelTRM202BetweenDate(readStartEndpoinDate, readEndEndpoinDate);
        return jsonBodyListForTableModelTRM202.getTableModelTRM202List();
    }

    private OffsetDateTime localDateTomeToOffset(LocalDateTime localDateTime){
        return OffsetDateTime.of(localDateTime, OffsetDateTime.now().getOffset());
    }

    private OffsetDateTime startOffsetLocalDateTime(){
        return localDateTomeToOffset(readStartEndpoinDate());
    }

    private OffsetDateTime endOffsetLocalDateTime(){
        return localDateTomeToOffset(readEndEndpoinDate());
    }
}
