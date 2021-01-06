package com.vk.repository.microservice;

import com.vk.entity.device.DeviceModelEnergeticRoomRaspberry;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM202;
import com.vk.entity.json.JsonBodyListForTableModelTRM202;
import com.vk.entity.table.TableModelEnergeticRoomTRM202;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@Repository
@ComponentScan(basePackages = {"com.vk.entity.device","com.vk.configuration"})
public class RepositoryMicroserviceEnergeticRoomRaspberryImpl implements RepositoryMicroserviceEnergeticRoomRaspberry {

    private DeviceModelEnergeticRoomRaspberry deviceModelRaspberry;

    private RestTemplate restTemplate;

    private DeviceModelEnergeticRoomTRM202 deviceModelDevice;

    @Autowired
    public RepositoryMicroserviceEnergeticRoomRaspberryImpl(final DeviceModelEnergeticRoomRaspberry deviceModelRaspberry,
                                                            final RestTemplate restTemplate,
                                                            final DeviceModelEnergeticRoomTRM202 deviceModelDevice) {
        this.deviceModelRaspberry = deviceModelRaspberry;
        this.restTemplate = restTemplate;
        this.deviceModelDevice = deviceModelDevice;
    }

    @Override
    public JsonBodyListForTableModelTRM202 jsonReadTableModelBetweenDate(final LocalDateTime start, final LocalDateTime end) {
        return restTemplate.postForObject(createUrlAdress()+"/database/range", createHttpEntity(start, end), JsonBodyListForTableModelTRM202.class);
    }

    @Override
    public TableModelEnergeticRoomTRM202 jsonReadTableModelLast() {
        return restTemplate.getForObject(createUrlAdress()+"/database/get-last-row", TableModelEnergeticRoomTRM202.class);
    }

    @Override
    public DeviceModelEnergeticRoomTRM202 jsonReadDeviceModelAllRegisters(){
        try {
            deviceModelDevice = restTemplate.getForObject(createUrlAdress()+"/modbus/read-all", DeviceModelEnergeticRoomTRM202.class);
        }catch (Exception e){
            deviceModelDevice.setHoldingRegister0(0F);
            deviceModelDevice.setHoldingRegister1(0F);
        }
        return deviceModelDevice;
    }

    private HttpHeaders createHttpHeaders(){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        return httpHeaders;
    }

    private String createJSONObject(LocalDateTime from, LocalDateTime to) {
        JSONObject jsonpObject = new JSONObject();
        try {
            jsonpObject.put("from", from);
            jsonpObject.put("to", to);
        }catch (JSONException e){
            e.printStackTrace();
        }
        return jsonpObject.toString();
    }

    private String createUrlAdress(){
        return "http://"+deviceModelRaspberry.getIp()+":"+deviceModelRaspberry.getTomcatPort();
    }

    private HttpEntity<String> createHttpEntity(LocalDateTime from, LocalDateTime to){
        return new HttpEntity<>(createJSONObject(from, to), createHttpHeaders());
    }
}
