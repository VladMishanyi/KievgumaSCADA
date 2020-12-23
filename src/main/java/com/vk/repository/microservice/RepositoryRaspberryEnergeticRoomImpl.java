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
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@Repository
@ComponentScan(basePackages = {"com.vk.entity.device","com.vk.configuration"})
public class RepositoryRaspberryEnergeticRoomImpl implements RepositoryRaspberryEnergeticRoom {

    private final DeviceModelEnergeticRoomRaspberry deviceModelRaspberry;

    private final RestTemplate restTemplate;

    @Autowired
    public RepositoryRaspberryEnergeticRoomImpl(final DeviceModelEnergeticRoomRaspberry deviceModelRaspberry,
                                                final RestTemplate restTemplate) {
        this.deviceModelRaspberry = deviceModelRaspberry;
        this.restTemplate = restTemplate;
    }

    @Override
    public JsonBodyListForTableModelTRM202 jsonReadTableModelTRM202BetweenDate(final LocalDateTime start, final LocalDateTime end) {
        return restTemplate.postForObject(createUrlAdress()+"/database/range", createHttpEntity(start, end), JsonBodyListForTableModelTRM202.class);
    }

    @Override
    public TableModelEnergeticRoomTRM202 jsonReadTableModelTRM202Last() {
        return restTemplate.getForObject(createUrlAdress()+"/database/get-last-row", TableModelEnergeticRoomTRM202.class);
    }

    @Override
    public DeviceModelEnergeticRoomTRM202 jsonReadDeviceModelTRM202allRegisters(){
        return restTemplate.getForObject(createUrlAdress()+"/modbus/read-all", DeviceModelEnergeticRoomTRM202.class);
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
        return new HttpEntity<String>(createJSONObject(from, to), createHttpHeaders());
    }
}
