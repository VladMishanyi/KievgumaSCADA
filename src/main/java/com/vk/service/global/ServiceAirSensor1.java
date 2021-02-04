package com.vk.service.global;

import com.vk.entity.table.TableModelAirSensor1;

import java.time.LocalDateTime;
import java.util.List;

public interface ServiceAirSensor1 {

    List<TableModelAirSensor1> databaseFindByDateBetween (final LocalDateTime start, final LocalDateTime end);
    void databaseAddTableDevice(final TableModelAirSensor1 tableModel);

    void messageSendDevice(final TableModelAirSensor1 deviceModelDevice);
}
