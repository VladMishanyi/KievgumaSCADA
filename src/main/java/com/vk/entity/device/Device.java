package com.vk.entity.device;

import com.vk.entity.register.Register;

/**
 * Created by User on 2018-02-20.
 */
public interface Device<E extends Number, K extends Register> {

    K[] getRegisters();

    void setRegisters(K[] registers);
}
