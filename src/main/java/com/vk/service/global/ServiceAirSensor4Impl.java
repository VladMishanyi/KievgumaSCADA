package com.vk.service.global;

import com.vk.entity.table.TableModelAirSensor3;
import com.vk.entity.table.TableModelAirSensor4;
import com.vk.repository.data.RepositoryDataAirSensor3;
import com.vk.repository.data.RepositoryDataAirSensor4;
import com.vk.repository.websocket.RepositoryWebsocketAirSensor3;
import com.vk.repository.websocket.RepositoryWebsocketAirSensor4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@ComponentScan(basePackages = {"com.vk.entity.device","com.vk.repository"})
public class ServiceAirSensor4Impl implements ServiceAirSensor4{

    private final RepositoryDataAirSensor4 repositoryDatabase;

    private final RepositoryWebsocketAirSensor4 websocketRepository;


    @Autowired
    public ServiceAirSensor4Impl(final RepositoryDataAirSensor4 repositoryDatabase,
                                 final RepositoryWebsocketAirSensor4 websocketRepository){
        this.repositoryDatabase = repositoryDatabase;
        this.websocketRepository = websocketRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<TableModelAirSensor4> databaseFindByDateBetween (final LocalDateTime start, final LocalDateTime end) {
        return repositoryDatabase.findByDateBetween(start, end);
    }
    @Transactional
    @Override
    public void databaseAddTableDevice(final TableModelAirSensor4 tableModel) {
        repositoryDatabase.saveAndFlush(tableModel);
    }

    @Override
    public void messageSendDevice(final TableModelAirSensor4 deviceModelDevice){
        websocketRepository.messageSendDevice(deviceModelDevice);
    }
}
