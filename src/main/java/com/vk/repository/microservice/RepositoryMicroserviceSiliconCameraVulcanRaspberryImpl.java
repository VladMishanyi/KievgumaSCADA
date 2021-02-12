package com.vk.repository.microservice;

import com.vk.entity.device.DeviceModelSecondCehBalonRaspberry;
import com.vk.entity.device.DeviceModelSecondCehBalonTRM138;
import com.vk.entity.device.DeviceModelSiliconCameraVulkanRaspberry;
import com.vk.entity.device.DeviceModelSiliconCameraVulkanTRM251;
import com.vk.entity.json.JsonBodyListForTableModelSecondCehBalonTRM138;
import com.vk.entity.json.JsonBodyListForTableModelSiliconCameraVulkanTRM251;
import com.vk.entity.table.TableModelSecondCehBalonTRM138;
import com.vk.entity.table.TableModelSiliconeCameraVulcanTRM251;
import org.apache.log4j.Logger;
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
public class RepositoryMicroserviceSiliconCameraVulcanRaspberryImpl implements RepositoryMicroserviceSiliconCameraVulcanRaspberry {

    private final Logger LOGGER = Logger.getLogger(this.getClass());

    private final DeviceModelSiliconCameraVulkanRaspberry deviceModelRaspberry;

    private RestTemplate restTemplate;

    @Autowired
    public RepositoryMicroserviceSiliconCameraVulcanRaspberryImpl(final DeviceModelSiliconCameraVulkanRaspberry deviceModelRaspberry,
                                                                  final RestTemplate restTemplate) {
        this.deviceModelRaspberry = deviceModelRaspberry;
        this.restTemplate = restTemplate;
    }

    @Override
    public JsonBodyListForTableModelSiliconCameraVulkanTRM251 jsonReadTableModelBetweenDate(final LocalDateTime start, final LocalDateTime end) {
        JsonBodyListForTableModelSiliconCameraVulkanTRM251 jsonBodyListForTableModel = null;
        try {
            jsonBodyListForTableModel = restTemplate.postForObject(createUrlAdress()+"/database/trm251/range", createHttpEntity(start, end), JsonBodyListForTableModelSiliconCameraVulkanTRM251.class);
        }catch (Exception e){
            jsonBodyListForTableModel = new JsonBodyListForTableModelSiliconCameraVulkanTRM251();
            LOGGER.error("Can't get last data from database -> "+ e.getClass());
        }
        return jsonBodyListForTableModel;
    }

    @Override
    public TableModelSiliconeCameraVulcanTRM251 jsonReadTableModelLast() {
        TableModelSiliconeCameraVulcanTRM251 tableModel = null;
        try {
            tableModel = restTemplate.getForObject(createUrlAdress()+"/database/trm251/get-last-row", TableModelSiliconeCameraVulcanTRM251.class);
        }catch (Exception e){
            tableModel = new TableModelSiliconeCameraVulcanTRM251();
            tableModel.setDate(LocalDateTime.now());
            LOGGER.error("Can't get last row from database -> "+ e.getClass());
        }
        return tableModel;
    }

    @Override
    public DeviceModelSiliconCameraVulkanTRM251 jsonReadDeviceModelAllRegisters(){
        DeviceModelSiliconCameraVulkanTRM251 deviceModelDevice = new DeviceModelSiliconCameraVulkanTRM251();
        try {
            deviceModelDevice = restTemplate.getForObject(createUrlAdress()+"/modbus/trm251/read-all", DeviceModelSiliconCameraVulkanTRM251.class);
        }catch (Exception e){
            deviceModelDevice.setInputRegister0(0F);
            deviceModelDevice.setInputRegister1(0F);
            LOGGER.error("Can't read all registers from device -> "+ e.getClass());
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
