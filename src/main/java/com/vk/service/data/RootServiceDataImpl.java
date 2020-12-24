package com.vk.service.data;

import com.vk.entity.device.DeviceModel;
import com.vk.entity.table.TableModel;
import com.vk.repository.data.RootRepositoryData;
import com.vk.repository.modbus.RootModbusRepository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * Created by KIP-PC99 on 15.06.2018.
 */

public class RootServiceDataImpl<E extends TableModel, T extends DeviceModel> implements RootServiceData<E, T>{

    private final RootRepositoryData<E> rootRepositoryData;

    private final RootModbusRepository<T> rootModbusRepository;

    public RootServiceDataImpl(final RootRepositoryData<E> rootRepositoryData,
                               final RootModbusRepository<T> rootModbusRepository){
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
        rootModbusRepository.setUseBorders(true);
        return rootModbusRepository.getDeviceModel(false);
    }

    @Transactional
    @Override
    public void addTabeDevice(final E tableModel){
        rootRepositoryData.saveAndFlush(tableModel);
    }

    @Transactional(readOnly = true)
    @Override
    public List<E> rangeTimestamp(final LocalDateTime startTimestamp, final LocalDateTime endTimestamp){
        return rootRepositoryData.findByDateBetween(startTimestamp, endTimestamp);
    }
}
