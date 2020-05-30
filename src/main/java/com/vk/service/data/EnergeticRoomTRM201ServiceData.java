package com.vk.service.data;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;

/**
 * Created by KIP-PC99 on 11.06.2018.
 */
public interface EnergeticRoomTRM201ServiceData extends RootServiceData<TableModelEnergeticRoomTRM201, DeviceModelEnergeticRoomTRM201> {

    void writeValueFirstChanel(int value);

    void writeValueFirstChane2(int value);
}
