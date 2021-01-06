package com.vk.service.global;

import com.vk.entity.device.DeviceModel;
import com.vk.entity.device.DeviceModelSecondCehBalonTRM138;
import com.vk.entity.json.JsonBodyListForTableModelSecondCehBalonTRM138;
import com.vk.entity.json.JsonBodyListRoot;
import com.vk.entity.table.TableModel;
import com.vk.entity.table.TableModelSecondCehBalonTRM138;

import java.time.LocalDateTime;
import java.util.List;

public interface ServiceRoot<T extends TableModel, J extends JsonBodyListRoot<T>, D extends DeviceModel> {

    J jsonReadTableModelBetweenDate(final LocalDateTime start, final LocalDateTime end);
    T jsonReadTableModelLast();
    D jsonReadDeviceModelAllRegisters();

    List<T> databaseFindByDateBetween (final LocalDateTime start, final LocalDateTime end);
    T databaseFindLastValueByDate ();
    void databaseAddTableDevice(final T tableModel);
    void databaseAddAllTableDevice(final List<T> tableModelList);

    void messageSendDevice(final D deviceModelDevice);
}
