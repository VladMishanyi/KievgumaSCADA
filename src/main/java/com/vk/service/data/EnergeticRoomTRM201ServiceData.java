package com.vk.service.data;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModel;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;

import java.util.Date;
import java.util.List;

/**
 * Created by KIP-PC99 on 11.06.2018.
 */
public interface EnergeticRoomTRM201ServiceData extends RootServiceData<TableModelEnergeticRoomTRM201, DeviceModelEnergeticRoomTRM201> {

    public void writeValueFirstChanel(int value);

    public void writeValueFirstChane2(int value);
}
