package com.vk.service.global;

import com.vk.entity.device.DeviceModelSecondCehBalonTRM138;
import com.vk.entity.json.JsonBodyListForTableModelSecondCehBalonTRM138;
import com.vk.entity.table.TableModelAirSensor1;
import com.vk.entity.table.TableModelSecondCehBalonTRM138;
import com.vk.repository.data.RepositoryDataAirSensor1;
import com.vk.repository.data.RepositoryDataSecondCehBalonTRM138;
import com.vk.repository.microservice.RepositoryMicroserviceSecondCehBalonRaspberry;
import com.vk.repository.websocket.RepositoryWebsocketAirSensor1;
import com.vk.repository.websocket.RepositoryWebsocketSecondCehBalonTRM138;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@ComponentScan(basePackages = {"com.vk.entity.device","com.vk.repository"})
public class ServiceAirSensor1Impl implements ServiceAirSensor1{

    private final RepositoryDataAirSensor1 repositoryDatabase;

    private final RepositoryWebsocketAirSensor1 websocketRepository;


    @Autowired
    public ServiceAirSensor1Impl(final RepositoryDataAirSensor1 repositoryDatabase,
                                 final RepositoryWebsocketAirSensor1 websocketRepository){
        this.repositoryDatabase = repositoryDatabase;
        this.websocketRepository = websocketRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<TableModelAirSensor1> databaseFindByDateBetween (final LocalDateTime start, final LocalDateTime end) {
        return repositoryDatabase.findByDateBetween(start, end);
    }
    @Transactional
    @Override
    public void databaseAddTableDevice(final TableModelAirSensor1 tableModel) {
        repositoryDatabase.saveAndFlush(tableModel);
    }

    @Override
    public void messageSendDevice(final TableModelAirSensor1 deviceModelDevice){
        websocketRepository.messageSendDevice(deviceModelDevice);
    }
}
