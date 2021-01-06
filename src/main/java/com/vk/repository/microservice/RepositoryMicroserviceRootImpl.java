package com.vk.repository.microservice;

import com.vk.entity.device.DeviceModel;
import com.vk.entity.json.JsonBodyListRoot;
import com.vk.entity.table.TableModel;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

public class RepositoryMicroserviceRootImpl<T extends TableModel, J extends JsonBodyListRoot<T>, D extends DeviceModel> implements RepositoryMicroserviceRoot<T, J, D> {

    private D deviceModelRaspberry;

    private RestTemplate restTemplate;

    private D deviceModelDevice;

    public RepositoryMicroserviceRootImpl(final D deviceModelRaspberry,
                                          final RestTemplate restTemplate,
                                          final D deviceModelDevice) {
        this.deviceModelRaspberry = deviceModelRaspberry;
        this.restTemplate = restTemplate;
        this.deviceModelDevice = deviceModelDevice;
    }

    @Override
    public J jsonReadTableModelBetweenDate(LocalDateTime start, LocalDateTime end) {
        return null;
    }

    @Override
    public T jsonReadTableModelLast() {
        return null;
    }

    @Override
    public D jsonReadDeviceModelAllRegisters() {
        return null;
    }
}
