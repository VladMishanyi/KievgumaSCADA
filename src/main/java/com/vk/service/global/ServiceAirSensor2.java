package com.vk.service.global;

import com.vk.entity.table.TableModelAirSensor1;
import com.vk.entity.table.TableModelAirSensor2;

import java.time.LocalDateTime;
import java.util.List;

public interface ServiceAirSensor2 {

    List<TableModelAirSensor2> databaseFindByDateBetween (final LocalDateTime start, final LocalDateTime end);
    void databaseAddTableDevice(final TableModelAirSensor2 tableModel);

    void messageSendDevice(final TableModelAirSensor2 deviceModelDevice);
}
