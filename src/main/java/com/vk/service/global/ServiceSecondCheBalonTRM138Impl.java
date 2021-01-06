package com.vk.service.global;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM202;
import com.vk.entity.device.DeviceModelSecondCehBalonTRM138;
import com.vk.entity.json.JsonBodyListForTableModelSecondCehBalonTRM138;
import com.vk.entity.json.JsonBodyListForTableModelTRM202;
import com.vk.entity.table.TableModelEnergeticRoomTRM202;
import com.vk.entity.table.TableModelSecondCehBalonTRM138;
import com.vk.repository.data.RepositoryDataEnergeticRoomTRM201;
import com.vk.repository.data.RepositoryDataSecondCehBalonTRM138;
import com.vk.repository.microservice.RepositoryMicroserviceEnergeticRoomRaspberry;
import com.vk.repository.microservice.RepositoryMicroserviceSecondCehBalonRaspberry;
import com.vk.repository.websocket.RepositoryWebsocketEnergeticRoomTRM202;
import com.vk.repository.websocket.RepositoryWebsocketSecondCehBalonTRM138;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Repository
@ComponentScan(basePackages = {"com.vk.entity.device","com.vk.repository"})
public class ServiceSecondCheBalonTRM138Impl implements ServiceSecondCheBalonTRM138{

    private final RepositoryDataSecondCehBalonTRM138 repositoryDatabase;

    private final RepositoryMicroserviceSecondCehBalonRaspberry repositoryRaspberry;

    private final RepositoryWebsocketSecondCehBalonTRM138 websocketRepository;


    @Autowired
    public ServiceSecondCheBalonTRM138Impl(final RepositoryDataSecondCehBalonTRM138 repositoryDatabase,
                                          final RepositoryMicroserviceSecondCehBalonRaspberry repositoryRaspberry,
                                          final RepositoryWebsocketSecondCehBalonTRM138 websocketRepository){
        this.repositoryDatabase = repositoryDatabase;
        this.repositoryRaspberry = repositoryRaspberry;
        this.websocketRepository = websocketRepository;
    }
    @Override
    public JsonBodyListForTableModelSecondCehBalonTRM138 jsonReadTableModelBetweenDate(final LocalDateTime start, final LocalDateTime end){
        return repositoryRaspberry.jsonReadTableModelBetweenDate(start, end);
    }
    @Override
    public TableModelSecondCehBalonTRM138 jsonReadTableModelLast(){
        return repositoryRaspberry.jsonReadTableModelLast();
    }
    @Override
    public DeviceModelSecondCehBalonTRM138 jsonReadDeviceModelAllRegisters(){
        return repositoryRaspberry.jsonReadDeviceModelAllRegisters();
    }

    @Transactional(readOnly = true)
    @Override
    public List<TableModelSecondCehBalonTRM138> databaseFindByDateBetween (final LocalDateTime start, final LocalDateTime end) {
        return repositoryDatabase.findByDateBetween(start, end);
    }
    @Transactional(readOnly = true)
    @Override
    public TableModelSecondCehBalonTRM138 databaseFindLastValueByDate (){
        return repositoryDatabase.findLastValueByDate();
    }
    @Transactional
    @Override
    public void databaseAddTableDevice(final TableModelSecondCehBalonTRM138 tableModel) {
        repositoryDatabase.saveAndFlush(tableModel);
    }
    @Transactional
    @Override
    public void databaseAddAllTableDevice(final List<TableModelSecondCehBalonTRM138> tableModelList){
        repositoryDatabase.saveAll(tableModelList);
    }

    @Override
    public void messageSendDevice(final DeviceModelSecondCehBalonTRM138 deviceModelDevice){
        websocketRepository.messageSendDevice(deviceModelDevice);
    }
}
