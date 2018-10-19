package com.vk.service.data;

import com.vk.entity.device.DeviceModel;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModel;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.repository.data.EnergeticRoomTRM201RepositoryData;
import com.vk.repository.data.RootRepositoryData;
import com.vk.repository.modbus.RootModbusRepository;
//import com.vk.repository.old_jpql.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

/**
 * Created by KIP-PC99 on 15.06.2018.
 */

public class RootServiceDataImpl<K extends Number, E extends TableModel, T extends DeviceModel> implements RootServiceData<E, T>{

    private RootRepositoryData<E> rootRepositoryData;

    private RootModbusRepository<T> rootModbusRepository;

    public RootServiceDataImpl(RootRepositoryData<E> rootRepositoryData,
                               RootModbusRepository<T> rootModbusRepository){
        this.rootRepositoryData = rootRepositoryData;
        this.rootModbusRepository = rootModbusRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<BigInteger> readBaseSize(){
        return rootRepositoryData.readBaseSize();
    }

    @Override
    public T getModbusDevice(){
        return rootModbusRepository.getDeviceModel(false);
    }

    @Transactional
    @Override
    public void addTabeDevice(E tableModel){
        rootRepositoryData.saveAndFlush(tableModel);
    }

    @Transactional(readOnly = true)
    @Override
    public List<E> rangeTimestamp(Date startTimestamp, Date endTimestamp){
        return rootRepositoryData.findByDateBetween(startTimestamp, endTimestamp);
    }
}
