package com.vk.tasks.global;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM202;
import com.vk.entity.device.DeviceModelSecondCehBalonTRM138;
import com.vk.entity.json.JsonBodyListForTableModelSecondCehBalonTRM138;
import com.vk.entity.json.JsonBodyListForTableModelTRM202;
import com.vk.entity.table.TableModelEnergeticRoomTRM202;
import com.vk.entity.table.TableModelSecondCehBalonTRM138;
import com.vk.service.global.ServiceEnergeticRoomTRM201;
import com.vk.service.global.ServiceSecondCheBalonTRM138;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

@Component
@ComponentScan(basePackages = {"com.vk.service", "com.vk.entity"})
public class TaskSecondCehBalonTRM138Impl implements TaskSecondCehBalonTRM138{

    private ServiceSecondCheBalonTRM138 service;

    private DeviceModelSecondCehBalonTRM138 device;

    @Autowired
    public TaskSecondCehBalonTRM138Impl(final ServiceSecondCheBalonTRM138 service,
                                       final DeviceModelSecondCehBalonTRM138 device){
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
        if (Objects.nonNull(dateTimeCurrent) && Objects.nonNull(dateTimeEnd)){
            while (current.isBefore(dateTimeEnd)) {
                OffsetDateTime next = current.plusHours(1);
                service.databaseAddAllTableDevice(readTableModelBetweenDate(current.toLocalDateTime(), next.toLocalDateTime()));
                current = next;
            }
        }
    }

    private LocalDateTime readStartEndpoinDate(){
        LocalDateTime localDateTime = LocalDateTime.now().minusMonths(1L);
        TableModelSecondCehBalonTRM138 tableModel = service.databaseFindLastValueByDate();
        if (Objects.isNull(tableModel)) return localDateTime;
        return tableModel.getDate();
    }

    private LocalDateTime readEndEndpoinDate(){
        TableModelSecondCehBalonTRM138 tableModel = service.jsonReadTableModelLast();
        if (Objects.nonNull(tableModel)) return tableModel.getDate();
        return null;
    }

    private List<TableModelSecondCehBalonTRM138> readTableModelBetweenDate(final LocalDateTime readStartEndpoinDate, final LocalDateTime readEndEndpoinDate){
        JsonBodyListForTableModelSecondCehBalonTRM138 jsonBodyListForTableModel = service.jsonReadTableModelBetweenDate(readStartEndpoinDate, readEndEndpoinDate);
        return jsonBodyListForTableModel.getTableModelList();
    }

    private OffsetDateTime localDateTomeToOffset(final LocalDateTime localDateTime){
        if (Objects.nonNull(localDateTime)) return OffsetDateTime.of(localDateTime, OffsetDateTime.now().getOffset());
        return null;
    }

    private OffsetDateTime startOffsetLocalDateTime(){
        return localDateTomeToOffset(readStartEndpoinDate());
    }

    private OffsetDateTime endOffsetLocalDateTime(){
        return localDateTomeToOffset(readEndEndpoinDate());
    }
}
