package com.vk.service.data;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM202;
import com.vk.entity.json.JsonBodyListForTableModelTRM202;
import com.vk.entity.table.TableModelEnergeticRoomTRM202;
import com.vk.repository.data.EnergeticRoomTRM201RepositoryData;
import com.vk.repository.data.RootRepositoryData;
import com.vk.repository.microservice.RepositoryRaspberryEnergeticRoom;
import com.vk.repository.modbus.ModbusRepositoryEnergeticRoomTRM201;
import com.vk.repository.modbus.RootModbusRepository;
import com.vk.repository.websocket.WebsocketRepositoryEnergeticRoomTRM202;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by KIP-PC99 on 11.06.2018.
 */
@Repository
@ComponentScan(basePackages = {"com.vk.entity.device","com.vk.repository"})
public class EnergeticRoomTRM201ServiceDataImpl implements EnergeticRoomTRM201ServiceData{

    private final EnergeticRoomTRM201RepositoryData repositoryDatabaseTRM202;

    private final RepositoryRaspberryEnergeticRoom repositoryRaspberryBalon;

    private final WebsocketRepositoryEnergeticRoomTRM202 websocketRepositoryEnergeticRoomTRM202;


    @Autowired
    public EnergeticRoomTRM201ServiceDataImpl(final EnergeticRoomTRM201RepositoryData repositoryDatabaseTRM202,
                                              final RepositoryRaspberryEnergeticRoom repositoryRaspberryBalon,
                                              final WebsocketRepositoryEnergeticRoomTRM202 websocketRepositoryEnergeticRoomTRM202){
        this.repositoryDatabaseTRM202 = repositoryDatabaseTRM202;
        this.repositoryRaspberryBalon = repositoryRaspberryBalon;
        this.websocketRepositoryEnergeticRoomTRM202 = websocketRepositoryEnergeticRoomTRM202;
    }
    @Override
    public JsonBodyListForTableModelTRM202 jsonReadTableModelTRM202BetweenDate(LocalDateTime start, LocalDateTime end){
        return repositoryRaspberryBalon.jsonReadTableModelTRM202BetweenDate(start, end);
    }
    @Override
    public TableModelEnergeticRoomTRM202 jsonReadTableModelTRM202Last(){
        return repositoryRaspberryBalon.jsonReadTableModelTRM202Last();
    }
    @Override
    public DeviceModelEnergeticRoomTRM202 jsonReadDeviceModelTRM202allRegisters(){
        return repositoryRaspberryBalon.jsonReadDeviceModelTRM202allRegisters();
    }

    @Transactional(readOnly = true)
    @Override
    public List<TableModelEnergeticRoomTRM202> databaseFindByDateBetween (LocalDateTime start, LocalDateTime end) {
        return repositoryDatabaseTRM202.findByDateBetween(start, end);
    }
    @Transactional(readOnly = true)
    @Override
    public TableModelEnergeticRoomTRM202 databaseFindLastValueByDate (){
        return repositoryDatabaseTRM202.findLastValueByDate();
    }
    @Transactional
    @Override
    public void databaseAddTableDevice(TableModelEnergeticRoomTRM202 tableModel) {
        repositoryDatabaseTRM202.saveAndFlush(tableModel);
    }
    @Transactional
    @Override
    public void databaseAddAllTableDevice(List<TableModelEnergeticRoomTRM202> tableModelTRM202List){
        repositoryDatabaseTRM202.saveAll(tableModelTRM202List);
    }

    @Override
    public void messageSendDevice(DeviceModelEnergeticRoomTRM202 deviceModelEnergeticRoomTRM202){
        websocketRepositoryEnergeticRoomTRM202.messageSendDevice(deviceModelEnergeticRoomTRM202);
    }
}
