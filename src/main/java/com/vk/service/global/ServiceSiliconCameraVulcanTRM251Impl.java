package com.vk.service.global;

import com.vk.entity.device.DeviceModelSiliconCameraVulkanTRM251;
import com.vk.entity.json.JsonBodyListForTableModelSiliconCameraVulkanTRM251;
import com.vk.entity.table.TableModelSiliconeCameraVulcanTRM251;
import com.vk.repository.data.RepositoryDataSiliconCameraVulcanTRM251;
import com.vk.repository.microservice.RepositoryMicroserviceSiliconCameraVulcanRaspberry;
import com.vk.repository.websocket.RepositoryWebsocketSiliconCameraVulcanTRM251;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@ComponentScan(basePackages = {"com.vk.entity.device","com.vk.repository"})
public class ServiceSiliconCameraVulcanTRM251Impl implements ServiceSiliconCameraVulcanTRM251{

    private final RepositoryDataSiliconCameraVulcanTRM251 repositoryDatabase;

    private final RepositoryMicroserviceSiliconCameraVulcanRaspberry repositoryRaspberry;

    private final RepositoryWebsocketSiliconCameraVulcanTRM251 websocketRepository;


    @Autowired
    public ServiceSiliconCameraVulcanTRM251Impl(final RepositoryDataSiliconCameraVulcanTRM251 repositoryDatabase,
                                                final RepositoryMicroserviceSiliconCameraVulcanRaspberry repositoryRaspberry,
                                                final RepositoryWebsocketSiliconCameraVulcanTRM251 websocketRepository){
        this.repositoryDatabase = repositoryDatabase;
        this.repositoryRaspberry = repositoryRaspberry;
        this.websocketRepository = websocketRepository;
    }
    @Override
    public JsonBodyListForTableModelSiliconCameraVulkanTRM251 jsonReadTableModelBetweenDate(final LocalDateTime start, final LocalDateTime end){
        return repositoryRaspberry.jsonReadTableModelBetweenDate(start, end);
    }
    @Override
    public TableModelSiliconeCameraVulcanTRM251 jsonReadTableModelLast(){
        return repositoryRaspberry.jsonReadTableModelLast();
    }
    @Override
    public DeviceModelSiliconCameraVulkanTRM251 jsonReadDeviceModelAllRegisters(){
        return repositoryRaspberry.jsonReadDeviceModelAllRegisters();
    }

    @Transactional(readOnly = true)
    @Override
    public List<TableModelSiliconeCameraVulcanTRM251> databaseFindByDateBetween (final LocalDateTime start, final LocalDateTime end) {
        return repositoryDatabase.findByDateBetween(start, end);
    }
    @Transactional(readOnly = true)
    @Override
    public TableModelSiliconeCameraVulcanTRM251 databaseFindLastValueByDate (){
        return repositoryDatabase.findLastValueByDate();
    }
    @Transactional
    @Override
    public void databaseAddTableDevice(final TableModelSiliconeCameraVulcanTRM251 tableModel) {
        repositoryDatabase.saveAndFlush(tableModel);
    }
    @Transactional
    @Override
    public void databaseAddAllTableDevice(final List<TableModelSiliconeCameraVulcanTRM251> tableModelList){
        repositoryDatabase.saveAll(tableModelList);
    }

    @Override
    public void messageSendDevice(final DeviceModelSiliconCameraVulkanTRM251 deviceModelDevice){
        websocketRepository.messageSendDevice(deviceModelDevice);
    }
}
