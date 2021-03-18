package com.vk.service.global;

import com.vk.entity.table.TableModelAirSensor2;
import com.vk.entity.table.TableModelAirSensor3;

import java.time.LocalDateTime;
import java.util.List;

public interface ServiceAirSensor3 {

    List<TableModelAirSensor3> databaseFindByDateBetween (final LocalDateTime start, final LocalDateTime end);
    void databaseAddTableDevice(final TableModelAirSensor3 tableModel);

    void messageSendDevice(final TableModelAirSensor3 deviceModelDevice);
}
