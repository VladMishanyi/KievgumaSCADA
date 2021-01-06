package com.vk.service.global;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM202;
import com.vk.entity.json.JsonBodyListForTableModelTRM202;
import com.vk.entity.table.TableModelEnergeticRoomTRM202;
import com.vk.repository.data.RepositoryDataEnergeticRoomTRM201;
import com.vk.repository.microservice.RepositoryMicroserviceEnergeticRoomRaspberry;
import com.vk.repository.websocket.RepositoryWebsocketEnergeticRoomTRM202;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by KIP-PC99 on 11.06.2018.
 */
@Repository
@ComponentScan(basePackages = {"com.vk.entity.device","com.vk.repository"})
public class ServiceEnergeticRoomTRM201Impl implements ServiceEnergeticRoomTRM201 {

    private final RepositoryDataEnergeticRoomTRM201 repositoryDatabase;

    private final RepositoryMicroserviceEnergeticRoomRaspberry repositoryRaspberry;

    private final RepositoryWebsocketEnergeticRoomTRM202 websocketRepository;


    @Autowired
    public ServiceEnergeticRoomTRM201Impl(final RepositoryDataEnergeticRoomTRM201 repositoryDatabase,
                                          final RepositoryMicroserviceEnergeticRoomRaspberry repositoryRaspberry,
                                          final RepositoryWebsocketEnergeticRoomTRM202 websocketRepository){
        this.repositoryDatabase = repositoryDatabase;
        this.repositoryRaspberry = repositoryRaspberry;
        this.websocketRepository = websocketRepository;
    }
    @Override
    public JsonBodyListForTableModelTRM202 jsonReadTableModelBetweenDate(final LocalDateTime start, final LocalDateTime end){
        return repositoryRaspberry.jsonReadTableModelBetweenDate(start, end);
    }
    @Override
    public TableModelEnergeticRoomTRM202 jsonReadTableModelLast(){
        return repositoryRaspberry.jsonReadTableModelLast();
    }
    @Override
    public DeviceModelEnergeticRoomTRM202 jsonReadDeviceModelAllRegisters(){
        return repositoryRaspberry.jsonReadDeviceModelAllRegisters();
    }

    @Transactional(readOnly = true)
    @Override
    public List<TableModelEnergeticRoomTRM202> databaseFindByDateBetween (final LocalDateTime start, final LocalDateTime end) {
        return repositoryDatabase.findByDateBetween(start, end);
    }
    @Transactional(readOnly = true)
    @Override
    public TableModelEnergeticRoomTRM202 databaseFindLastValueByDate (){
        return repositoryDatabase.findLastValueByDate();
    }
    @Transactional
    @Override
    public void databaseAddTableDevice(final TableModelEnergeticRoomTRM202 tableModel) {
        repositoryDatabase.saveAndFlush(tableModel);
    }
    @Transactional
    @Override
    public void databaseAddAllTableDevice(final List<TableModelEnergeticRoomTRM202> tableModelList){
        repositoryDatabase.saveAll(tableModelList);
    }

    @Override
    public void messageSendDevice(final DeviceModelEnergeticRoomTRM202 deviceModelDevice){
        websocketRepository.messageSendDevice(deviceModelDevice);
    }
}
