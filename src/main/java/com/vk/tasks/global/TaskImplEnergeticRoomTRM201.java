package com.vk.tasks.global;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM202;
import com.vk.entity.json.JsonBodyListForTableModelTRM202;
import com.vk.entity.table.TableModelEnergeticRoomTRM202;
import com.vk.service.global.ServiceEnergeticRoomTRM201;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Created by KIP-PC99 on 03.08.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service", "com.vk.entity"})
public class TaskImplEnergeticRoomTRM201 implements TaskEnergeticRoomTRM201{

    private ServiceEnergeticRoomTRM201 service;

    private DeviceModelEnergeticRoomTRM202 device;

    @Autowired
    public TaskImplEnergeticRoomTRM201(final ServiceEnergeticRoomTRM201 service,
                                       final DeviceModelEnergeticRoomTRM202 device){
        this.service = service;
        this.device = device;

    }

    @Override
    public void readModbusAndSendMessage() {
        device = service.jsonReadDeviceModelAllRegisters();
        service.messageSendDevice(device);
    }

    @Override
    public void syncDatabase(){
        OffsetDateTime dateTimeCurrent = startOffsetLocalDateTime();
        OffsetDateTime dateTimeEnd = endOffsetLocalDateTime();
        OffsetDateTime current = dateTimeCurrent;
        while (current.isBefore(dateTimeEnd)) {
            OffsetDateTime next = current.plusHours(1);
            service.databaseAddAllTableDevice(readTableModelBetweenDate(current.toLocalDateTime(), next.toLocalDateTime()));
            current = next;
        }
    }

    private LocalDateTime readStartEndpoinDate(){
        LocalDateTime localDateTime = LocalDateTime.now().minusYears(1L);
        TableModelEnergeticRoomTRM202 tableModel = service.databaseFindLastValueByDate();
        if (Objects.isNull(tableModel)) return localDateTime;
        return tableModel.getDate();
    }

    private LocalDateTime readEndEndpoinDate(){
        TableModelEnergeticRoomTRM202 tableModel = service.jsonReadTableModelLast();
        return tableModel.getDate();
    }

    private List<TableModelEnergeticRoomTRM202> readTableModelBetweenDate(final LocalDateTime readStartEndpoinDate, final LocalDateTime readEndEndpoinDate){
        JsonBodyListForTableModelTRM202 jsonBodyListForTableModel = service.jsonReadTableModelBetweenDate(readStartEndpoinDate, readEndEndpoinDate);
        return jsonBodyListForTableModel.getTableModelList();
    }

    private OffsetDateTime localDateTomeToOffset(final LocalDateTime localDateTime){
        return OffsetDateTime.of(localDateTime, OffsetDateTime.now().getOffset());
    }

    private OffsetDateTime startOffsetLocalDateTime(){
        return localDateTomeToOffset(readStartEndpoinDate());
    }

    private OffsetDateTime endOffsetLocalDateTime(){
        return localDateTomeToOffset(readEndEndpoinDate());
    }
}
