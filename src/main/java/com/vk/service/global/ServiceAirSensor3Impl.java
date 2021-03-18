package com.vk.service.global;

import com.vk.entity.table.TableModelAirSensor2;
import com.vk.entity.table.TableModelAirSensor3;
import com.vk.repository.data.RepositoryDataAirSensor2;
import com.vk.repository.data.RepositoryDataAirSensor3;
import com.vk.repository.websocket.RepositoryWebsocketAirSensor2;
import com.vk.repository.websocket.RepositoryWebsocketAirSensor3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@ComponentScan(basePackages = {"com.vk.entity.device","com.vk.repository"})
public class ServiceAirSensor3Impl implements ServiceAirSensor3{

    private final RepositoryDataAirSensor3 repositoryDatabase;

    private final RepositoryWebsocketAirSensor3 websocketRepository;


    @Autowired
    public ServiceAirSensor3Impl(final RepositoryDataAirSensor3 repositoryDatabase,
                                 final RepositoryWebsocketAirSensor3 websocketRepository){
        this.repositoryDatabase = repositoryDatabase;
        this.websocketRepository = websocketRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<TableModelAirSensor3> databaseFindByDateBetween (final LocalDateTime start, final LocalDateTime end) {
        return repositoryDatabase.findByDateBetween(start, end);
    }
    @Transactional
    @Override
    public void databaseAddTableDevice(final TableModelAirSensor3 tableModel) {
        repositoryDatabase.saveAndFlush(tableModel);
    }

    @Override
    public void messageSendDevice(final TableModelAirSensor3 deviceModelDevice){
        websocketRepository.messageSendDevice(deviceModelDevice);
    }
}
