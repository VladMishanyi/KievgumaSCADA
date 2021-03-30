package com.vk.service.global;

import com.vk.entity.table.TableModelAirSensor3;
import com.vk.entity.table.TableModelAirSensor4;

import java.time.LocalDateTime;
import java.util.List;

public interface ServiceAirSensor4 {

    List<TableModelAirSensor4> databaseFindByDateBetween (final LocalDateTime start, final LocalDateTime end);
    void databaseAddTableDevice(final TableModelAirSensor4 tableModel);

    void messageSendDevice(final TableModelAirSensor4 deviceModelDevice);
}
