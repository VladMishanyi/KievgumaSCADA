package com.vk.controller;

import com.vk.chain.Chain4;
import com.vk.entity.device.DeviceModelSecondCehKameraVulcan2MPR51;
import com.vk.entity.json.DateFromChart;
import com.vk.entity.json.JsonBodyDateFromChart;
import com.vk.entity.json.JsonBodyFloat;
import com.vk.entity.json.JsonBodyShort;
import com.vk.entity.modbus.ModbusBodyQuery;
import com.vk.entity.table.TableModelLogger;
import com.vk.entity.table.TableModelSecondCehKameraVulcan2MPR51;
import com.vk.service.data.LoggerService;
import com.vk.service.data.SecondCehKameraVulcan2MPR51ServiceData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by KIP-PC99 on 21.11.2018.
 */
@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerSecondCehKameraVulcan2MPR51 extends JsonController<DeviceModelSecondCehKameraVulcan2MPR51, SecondCehKameraVulcan2MPR51ServiceData, TableModelSecondCehKameraVulcan2MPR51> {

    private final Logger LOGGER = Logger.getLogger(this.getClass());

    private final SecondCehKameraVulcan2MPR51ServiceData secondCehKameraVulcan2MPR51ServiceData;

    private final SimpleDateFormat simpleDateFormat;

    private final LoggerService loggerService;

    @Autowired
    public JsonControllerSecondCehKameraVulcan2MPR51(final SecondCehKameraVulcan2MPR51ServiceData secondCehKameraVulcan2MPR51ServiceData,
                                                     final SimpleDateFormat simpleDateFormat,
                                                     final LoggerService loggerService){
        this.secondCehKameraVulcan2MPR51ServiceData = secondCehKameraVulcan2MPR51ServiceData;
        this.simpleDateFormat = simpleDateFormat;
        this.loggerService = loggerService;
    }

    @MessageMapping(value="/generateChartSecondCehKameraVulcan2MPR51")
    @SendTo("/topic/generateChartSecondCehKameraVulcan2MPR51")
    public List<TableModelSecondCehKameraVulcan2MPR51> generateChartSecondCehKameraVulcan2MPR51(final JsonBodyDateFromChart dateFromChart){
        return this.generateTimeObject(secondCehKameraVulcan2MPR51ServiceData, dateFromChart, simpleDateFormat);
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_steam_pwm")
    public void writeSteamPwm(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_steam_pwm: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(100, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_steam_pwm  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_steam_pwm - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_steam_ki")
    public void writeSteamKi(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_steam_ki: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(101, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_steam_ki  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_steam_ki - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_steam_kp")
    public void writeSteamKp(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_steam_kp: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(102, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_steam_kp  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_steam_kp - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_steam_kd")
    public void writeSteamKd(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_steam_kd: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(103, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_steam_kd  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_steam_kd - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_electric_pwm")
    public void writeElectricPwm(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_electric_pwm: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(104, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_electric_pwm  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_electric_pwm - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_electric_ki")
    public void writeElectricKi(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_electric_ki: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(105, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_electric_ki  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_electric_ki - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_electric_kp")
    public void writeElectricKp(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_electric_kp: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(106, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_electric_kp  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_electric_kp - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_electric_kd")
    public void writeElectricKd(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_electric_kd: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(107, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_electric_kd  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_electric_kd - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_alarm")
    public void writeAlarm(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_alarm: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(108, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_alarm  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_alarm - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_regim1")
    public void writeRegim1(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_regim1: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(109, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_regim1  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_regim1 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_temp1")
    public void writeTemp1(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_temp1: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(110, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_temp1  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_temp1 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_press1")
    public void writePress1(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_press1: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(111, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_press1  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_press1 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_regim2")
    public void writeRegim2(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_regim2: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(112, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_regim2  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_regim2 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_temp2")
    public void writeTemp2(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_temp2: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(113, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_temp2  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_temp2 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_press2")
    public void writePress2(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_press2: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(114, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_press2  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_press2 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_regim3")
    public void writeRegim3(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_regim3: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(115, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_regim3  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_regim3 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_temp3")
    public void writeTemp3(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_temp3: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(116, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_temp3  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_temp3 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_press3")
    public void writePress3(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_press3: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(117, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_press3  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_press3 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_regim4")
    public void writeRegim4(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_regim4: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(118, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_regim4  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_regim4 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_temp4")
    public void writeTemp4(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_temp4: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(119, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_temp4  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_temp4 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_press4")
    public void writePress4(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_press4: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(120, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_press4  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_press4 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_regim5")
    public void writeRegim5(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_regim5: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(121, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_regim5  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_regim5 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_temp5")
    public void writeTemp5(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_temp5: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(122, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_temp5  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_temp5 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_press5")
    public void writePress5(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_press5: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(123, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_press5  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_press5 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_regim6")
    public void writeRegim6(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_regim6: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(124, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_regim6  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_regim6 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_temp6")
    public void writeTemp6(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_temp6: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(125, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_temp6  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_temp6 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_press6")
    public void writePress6(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_press6: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(126, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_press6  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_press6 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_regim7")
    public void writeRegim7(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_regim7: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(127, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_regim7  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_regim7 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_temp7")
    public void writeTemp7(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_temp7: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(128, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_temp7  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_temp7 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_press7")
    public void writePress7(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_press7: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(129, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_press7  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_press7 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_regim8")
    public void writeRegim8(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_regim8: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(130, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_regim8  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_regim8 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_temp8")
    public void writeTemp8(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_temp8: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(131, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_temp8  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_temp8 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_press8")
    public void writePress8(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_press8: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(132, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_press8  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_press8 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_regim9")
    public void writeRegim9(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_regim9: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(133, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_regim9  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_regim9 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_temp9")
    public void writeTemp9(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_temp9: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(134, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_temp9  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_temp9 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_press9")
    public void writePress9(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_press9: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(135, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_press9  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_press9 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_regim10")
    public void writeRegim10(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_regim10: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(136, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_regim10  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_regim10 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_temp10")
    public void writeTemp10(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_temp10: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(137, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_temp10  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_temp10 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_press10")
    public void writePress10(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_press10: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(138, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_press10  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_press10 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_regim11")
    public void writeRegim11(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_regim11: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(139, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_regim11  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_regim11 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_temp11")
    public void writeTemp11(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_temp11: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(140, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_temp11  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_temp11 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_press11")
    public void writePress11(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_press11: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(141, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_press11  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_press11 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_regim12")
    public void writeRegim12(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_regim12: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(142, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_regim12  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_regim12 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_temp12")
    public void writeTemp12(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_temp12: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(143, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_temp12  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_temp12 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_press12")
    public void writePress12(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_press12: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(144, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_press12  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_press12 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_program")
    public void writeProgram(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_program: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(145, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_program  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_program - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_program_read")
    public void writeProgramRead(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_program_read: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(146, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_program_read  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_program_read - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/second_ceh_kamera_vulcan2_MPR51/write_program_write")
    public void write_program_write(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/second_ceh_kamera_vulcan2_MPR51/write_program_write: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(146, val));
        } else{
            LOGGER.error("/second_ceh_kamera_vulcan2_MPR51/write_program_write  - out of bound length :"+val);
            System.out.println("/second_ceh_kamera_vulcan2_MPR51/write_program_write - out of bound length :"+val);
        }
    }
}
