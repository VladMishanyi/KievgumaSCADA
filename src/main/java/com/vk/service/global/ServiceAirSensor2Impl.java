package com.vk.service.global;

import com.vk.entity.table.TableModelAirSensor1;
import com.vk.entity.table.TableModelAirSensor2;
import com.vk.repository.data.RepositoryDataAirSensor1;
import com.vk.repository.data.RepositoryDataAirSensor2;
import com.vk.repository.websocket.RepositoryWebsocketAirSensor1;
import com.vk.repository.websocket.RepositoryWebsocketAirSensor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@ComponentScan(basePackages = {"com.vk.entity.device","com.vk.repository"})
public class ServiceAirSensor2Impl implements ServiceAirSensor2{

    private final RepositoryDataAirSensor2 repositoryDatabase;

    private final RepositoryWebsocketAirSensor2 websocketRepository;


    @Autowired
    public ServiceAirSensor2Impl(final RepositoryDataAirSensor2 repositoryDatabase,
                                 final RepositoryWebsocketAirSensor2 websocketRepository){
        this.repositoryDatabase = repositoryDatabase;
        this.websocketRepository = websocketRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<TableModelAirSensor2> databaseFindByDateBetween (final LocalDateTime start, final LocalDateTime end) {
        return repositoryDatabase.findByDateBetween(start, end);
    }
    @Transactional
    @Override
    public void databaseAddTableDevice(final TableModelAirSensor2 tableModel) {
        repositoryDatabase.saveAndFlush(tableModel);
    }

    @Override
    public void messageSendDevice(final TableModelAirSensor2 deviceModelDevice){
        websocketRepository.messageSendDevice(deviceModelDevice);
    }
}
