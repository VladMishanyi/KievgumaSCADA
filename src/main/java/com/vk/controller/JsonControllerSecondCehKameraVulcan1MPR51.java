package com.vk.controller;

import com.vk.chain.Chain4;
import com.vk.entity.device.DeviceModelSecondCehKameraVulcan1MPR51;
import com.vk.entity.json.*;
import com.vk.entity.modbus.ModbusBodyQuery;
import com.vk.entity.table.TableModelLogger;
import com.vk.entity.table.TableModelSecondCehKameraVulcan1MPR51;
import com.vk.service.data.LoggerService;
import com.vk.service.data.SecondCehKameraVulcan1MPR51ServiceData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * Created by KIP-PC99 on 21.11.2018.
 */
@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerSecondCehKameraVulcan1MPR51 extends JsonController<DeviceModelSecondCehKameraVulcan1MPR51, SecondCehKameraVulcan1MPR51ServiceData, TableModelSecondCehKameraVulcan1MPR51> {

    private final Logger LOGGER = Logger.getLogger(this.getClass());

    private final SecondCehKameraVulcan1MPR51ServiceData secondCehKameraVulcan1MPR51ServiceData;

    private final SimpleDateFormat simpleDateFormat;

    private final LoggerService loggerService;

    @Autowired
    public JsonControllerSecondCehKameraVulcan1MPR51(final SecondCehKameraVulcan1MPR51ServiceData secondCehKameraVulcan1MPR51ServiceData,
                                                     final SimpleDateFormat simpleDateFormat,
                                                     final LoggerService loggerService){
        this.secondCehKameraVulcan1MPR51ServiceData = secondCehKameraVulcan1MPR51ServiceData;
        this.simpleDateFormat = simpleDateFormat;
        this.loggerService = loggerService;
    }

    @MessageMapping(value="/generateChartSecondCehKameraVulcan1MPR51")
    @SendTo("/topic/generateChartSecondCehKameraVulcan1MPR51")
    public List<TableModelSecondCehKameraVulcan1MPR51> generateChartSecondCehKameraVulcan1MPR51(final JsonBodyLocalDateTimeFromChart dateFromChart){
        return this.generateTimeObject(secondCehKameraVulcan1MPR51ServiceData, dateFromChart, simpleDateFormat);
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_steam_pwm")
    public void writeSteamPwm(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_steam_pwm: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(200, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_steam_pwm  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_steam_pwm - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_steam_ki")
    public void writeSteamKi(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_steam_ki: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(201, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_steam_ki  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_steam_ki - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_steam_kp")
    public void writeSteamKp(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_steam_kp: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(202, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_steam_kp  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_steam_kp - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_steam_kd")
    public void writeSteamKd(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_steam_kd: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(203, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_steam_kd  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_steam_kd - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_electric_pwm")
    public void writeElectricPwm(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_electric_pwm: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(204, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_electric_pwm  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_electric_pwm - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_electric_ki")
    public void writeElectricKi(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_electric_ki: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(205, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_electric_ki  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_electric_ki - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_electric_kp")
    public void writeElectricKp(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_electric_kp: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(206, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_electric_kp  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_electric_kp - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_electric_kd")
    public void writeElectricKd(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_electric_kd: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(207, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_electric_kd  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_electric_kd - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_alarm")
    public void writeAlarm(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_alarm: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(208, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_alarm  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_alarm - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_regim1")
    public void writeRegim1(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_regim1: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(209, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_regim1  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_regim1 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_temp1")
    public void writeTemp1(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_temp1: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(210, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_temp1  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_temp1 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_press1")
    public void writePress1(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_press1: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(211, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_press1  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_press1 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_regim2")
    public void writeRegim2(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_regim2: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(212, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_regim2  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_regim2 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_temp2")
    public void writeTemp2(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_temp2: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(213, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_temp2  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_temp2 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_press2")
    public void writePress2(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_press2: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(214, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_press2  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_press2 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_regim3")
    public void writeRegim3(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_regim3: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(215, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_regim3  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_regim3 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_temp3")
    public void writeTemp3(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_temp3: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(216, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_temp3  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_temp3 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_press3")
    public void writePress3(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_press3: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(217, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_press3  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_press3 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_regim4")
    public void writeRegim4(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_regim4: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(218, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_regim4  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_regim4 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_temp4")
    public void writeTemp4(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_temp4: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(219, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_temp4  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_temp4 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_press4")
    public void writePress4(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_press4: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(220, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_press4  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_press4 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_regim5")
    public void writeRegim5(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_regim5: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(221, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_regim5  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_regim5 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_temp5")
    public void writeTemp5(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_temp5: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(222, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_temp5  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_temp5 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_press5")
    public void writePress5(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_press5: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(223, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_press5  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_press5 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_regim6")
    public void writeRegim6(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_regim6: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(224, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_regim6  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_regim6 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_temp6")
    public void writeTemp6(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_temp6: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(225, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_temp6  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_temp6 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_press6")
    public void writePress6(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_press6: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(226, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_press6  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_press6 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_regim7")
    public void writeRegim7(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_regim7: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(227, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_regim7  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_regim7 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_temp7")
    public void writeTemp7(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_temp7: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(228, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_temp7  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_temp7 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_press7")
    public void writePress7(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_press7: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(229, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_press7  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_press7 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_regim8")
    public void writeRegim8(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_regim8: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(230, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_regim8  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_regim8 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_temp8")
    public void writeTemp8(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_temp8: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(231, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_temp8  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_temp8 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_press8")
    public void writePress8(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_press8: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(232, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_press8  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_press8 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_regim9")
    public void writeRegim9(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_regim9: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(233, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_regim9  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_regim9 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_temp9")
    public void writeTemp9(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_temp9: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(234, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_temp9  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_temp9 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_press9")
    public void writePress9(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_press9: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(235, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_press9  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_press9 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_regim10")
    public void writeRegim10(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_regim10: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(236, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_regim10  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_regim10 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_temp10")
    public void writeTemp10(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_temp10: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(237, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_temp10  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_temp10 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_press10")
    public void writePress10(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_press10: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(238, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_press10  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_press10 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_regim11")
    public void writeRegim11(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_regim11: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(239, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_regim11  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_regim11 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_temp11")
    public void writeTemp11(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_temp11: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(240, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_temp11  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_temp11 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_press11")
    public void writePress11(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_press11: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(241, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_press11  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_press11 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_regim12")
    public void writeRegim12(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_regim12: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(242, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_regim12  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_regim12 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_temp12")
    public void writeTemp12(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_temp12: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(243, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_temp12  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_temp12 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_press12")
    public void writePress12(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_press12: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(244, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_press12  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_press12 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_program")
    public void writeProgram(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_program: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(245, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_program  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_program - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_program_read")
    public void writeProgramRead(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_program_read: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(246, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_program_read  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_program_read - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan1_MPR51/write_program_write")
    public void write_program_write(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(LocalDateTime.now(), authentication.getName(), "/second_ceh_kamera_vulcan1_MPR51/write_program_write: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(246, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan1_MPR51/write_program_write  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan1_MPR51/write_program_write - out of bound length :"+val);
        }
    }
}
