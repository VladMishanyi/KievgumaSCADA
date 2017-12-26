package com.vk.threads;

import com.vk.entity.PLC;

/**
 * Created by User on 2017-06-19.
 */
public interface ThreadService {
    PLC getPlcThread(int slaveAdrr);
}
