package com.vk.tasks.global;

import com.vk.entity.device.DeviceModelSiliconCameraVulkanTRM251;
import com.vk.entity.json.JsonBodyListForTableModelSiliconCameraVulkanTRM251;
import com.vk.entity.table.TableModelSiliconeCameraVulcanTRM251;
import com.vk.service.global.ServiceSiliconCameraVulcanTRM251;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

@Component
@ComponentScan(basePackages = {"com.vk.service", "com.vk.entity"})
public class TaskSiliconCameraVulcanTRM251Impl implements TaskSiliconCameraVulcanTRM251{

    private final ServiceSiliconCameraVulcanTRM251 service;

    private DeviceModelSiliconCameraVulkanTRM251 device;

    @Autowired
    public TaskSiliconCameraVulcanTRM251Impl(final ServiceSiliconCameraVulcanTRM251 service,
                                             final DeviceModelSiliconCameraVulkanTRM251 device){
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
                OffsetDateTime next = current.plusHours(3);
                service.databaseAddAllTableDevice(readTableModelBetweenDate(current.toLocalDateTime(), next.toLocalDateTime()));
                current = next;
            }
        }
    }

    private LocalDateTime readStartEndpoinDate(){
        LocalDateTime localDateTime = LocalDateTime.now().minusMonths(1L);
        TableModelSiliconeCameraVulcanTRM251 tableModel = service.databaseFindLastValueByDate();
        if (Objects.isNull(tableModel)) return localDateTime;
        return tableModel.getDate();
    }

    private LocalDateTime readEndEndpoinDate(){
        TableModelSiliconeCameraVulcanTRM251 tableModel = service.jsonReadTableModelLast();
        if (Objects.nonNull(tableModel)) return tableModel.getDate();
        return null;
    }

    private List<TableModelSiliconeCameraVulcanTRM251> readTableModelBetweenDate(final LocalDateTime readStartEndpoinDate, final LocalDateTime readEndEndpoinDate){
        JsonBodyListForTableModelSiliconCameraVulkanTRM251 jsonBodyListForTableModel = service.jsonReadTableModelBetweenDate(readStartEndpoinDate, readEndEndpoinDate);
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
