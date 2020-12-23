package com.vk.tasks;

import com.vk.service.data.EnergeticRoomTRM201ServiceData;

/**
 * Created by KIP-PC99 on 06.08.2018.
 */
public interface TaskEnergeticRoomTRM201 {

    void readModbusAndSendMessage();

    void syncDatabase();
}
