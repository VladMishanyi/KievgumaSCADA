package com.vk.repository.microservice;

import com.vk.configuration.RestTemplateResponseErrorHandler;
import com.vk.entity.device.DeviceModelSecondCehBalonRaspberry;
import com.vk.entity.device.DeviceModelSecondCehBalonTRM138;
import com.vk.entity.json.JsonBodyListForTableModelSecondCehBalonTRM138;
import com.vk.entity.table.TableModelSecondCehBalonTRM138;
import org.apache.log4j.Logger;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

import java.time.LocalDateTime;

@Repository
@ComponentScan(basePackages = {"com.vk.entity.device","com.vk.configuration"})
public class RepositoryMicroserviceSecondCehBalonRaspberryImpl implements RepositoryMicroserviceSecondCehBalonRaspberry {

    private final Logger LOGGER = Logger.getLogger(this.getClass());

    private DeviceModelSecondCehBalonRaspberry deviceModelSecondCehBalonRaspberry;

    private RestTemplate restTemplate;

//    private DeviceModelSecondCehBalonTRM138 deviceModelDevice;

    @Autowired
    public RepositoryMicroserviceSecondCehBalonRaspberryImpl(final DeviceModelSecondCehBalonRaspberry deviceModelRaspberry,
                                                             final RestTemplate restTemplate/*,
                                                             final DeviceModelSecondCehBalonTRM138 deviceModelDevice*/) {
        this.deviceModelSecondCehBalonRaspberry = deviceModelRaspberry;
        this.restTemplate = restTemplate;
//        restTemplate.setErrorHandler(new RestTemplateResponseErrorHandler());
//        this.deviceModelDevice = deviceModelDevice;
    }

    @Override
    public JsonBodyListForTableModelSecondCehBalonTRM138 jsonReadTableModelBetweenDate(final LocalDateTime start, final LocalDateTime end) {
        try {
            return restTemplate.postForObject(createUrlAdress()+"/database/trm138/range", createHttpEntity(start, end), JsonBodyListForTableModelSecondCehBalonTRM138.class);
        }catch (Exception e){
            LOGGER.error("Can't get last data from database -> "+ this.getClass());
        }
        return null;
    }

    @Override
    public TableModelSecondCehBalonTRM138 jsonReadTableModelLast() {
        try {
            return restTemplate.getForObject(createUrlAdress()+"/database/trm138/get-last-row", TableModelSecondCehBalonTRM138.class);
        }catch (Exception e){
            LOGGER.error("Can't get last row from database -> "+ this.getClass());
        }
        return null;
    }

    @Override
    public DeviceModelSecondCehBalonTRM138 jsonReadDeviceModelAllRegisters(){
        DeviceModelSecondCehBalonTRM138 deviceModelDevice = new DeviceModelSecondCehBalonTRM138();
        try {
            deviceModelDevice = restTemplate.getForObject(createUrlAdress()+"/modbus/trm138/read-all", DeviceModelSecondCehBalonTRM138.class);
        }catch (Exception e){
            deviceModelDevice.setInputRegister0(0F);
            deviceModelDevice.setInputRegister1(0F);
            deviceModelDevice.setInputRegister2(0F);
            deviceModelDevice.setInputRegister3(0F);
            deviceModelDevice.setInputRegister4(0F);
            deviceModelDevice.setInputRegister5(0F);
            deviceModelDevice.setInputRegister6(0F);
            deviceModelDevice.setInputRegister7(0F);
            LOGGER.error("Can't read all registers from device -> "+ this.getClass());
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
        return "http://"+deviceModelSecondCehBalonRaspberry.getIp()+":"+deviceModelSecondCehBalonRaspberry.getTomcatPort();
    }

    private HttpEntity<String> createHttpEntity(LocalDateTime from, LocalDateTime to){
        return new HttpEntity<>(createJSONObject(from, to), createHttpHeaders());
    }
}
