package com.vk.controller;

import com.vk.chain.Chain4;
import com.vk.entity.device.DeviceModelSecondCehKameraVulcan3MPR51;
import com.vk.entity.json.DateFromChart;
import com.vk.entity.json.JsonBodyFloat;
import com.vk.entity.json.JsonBodyShort;
import com.vk.entity.modbus.ModbusBodyQuery;
import com.vk.entity.table.TableModelLogger;
import com.vk.entity.table.TableModelSecondCehKameraVulcan3MPR51;
import com.vk.service.data.LoggerService;
import com.vk.service.data.SecondCehKameraVulcan3MPR51ServiceData;
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
public class JsonControllerSecondCehKameraVulcan3MPR51 extends JsonController<DeviceModelSecondCehKameraVulcan3MPR51, SecondCehKameraVulcan3MPR51ServiceData, TableModelSecondCehKameraVulcan3MPR51> {

    private Logger LOGGER = Logger.getLogger(JsonControllerSecondCehKameraVulcan3MPR51.class);

    private final SecondCehKameraVulcan3MPR51ServiceData secondCehKameraVulcan3MPR51ServiceData;

    private final SimpleDateFormat simpleDateFormat;

    private LoggerService loggerService;

    @Autowired
    public JsonControllerSecondCehKameraVulcan3MPR51(final SecondCehKameraVulcan3MPR51ServiceData secondCehKameraVulcan3MPR51ServiceData,
                                                     final SimpleDateFormat simpleDateFormat,
                                                     LoggerService loggerService){
        this.secondCehKameraVulcan3MPR51ServiceData = secondCehKameraVulcan3MPR51ServiceData;
        this.simpleDateFormat = simpleDateFormat;
        this.loggerService = loggerService;
    }

    @MessageMapping(value="/generateChartSecondCehKameraVulcan3MPR51")
    @SendTo("/topic/generateChartSecondCehKameraVulcan3MPR51")
    public List<TableModelSecondCehKameraVulcan3MPR51> generateChartSecondCehKameraVulcan3MPR51(final DateFromChart dateFromChart){
        return this.generateTimeObject(secondCehKameraVulcan3MPR51ServiceData, dateFromChart, simpleDateFormat);
    }

    @MessageMapping(value = "/write_steam_pwm")
    public void writeSteamPwm(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_steam_pwm: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(0, val));
        } else{
            LOGGER.error("/write_steam_pwm  - out of bound length :"+val);
            System.out.println("/write_steam_pwm - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/write_steam_ki")
    public void writeSteamKi(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_steam_ki: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(1, val));
        } else{
            LOGGER.error("/write_steam_ki  - out of bound length :"+val);
            System.out.println("/write_steam_ki - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/write_steam_kp")
    public void writeSteamKp(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_steam_kp: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(2, val));
        } else{
            LOGGER.error("/write_steam_kp  - out of bound length :"+val);
            System.out.println("/write_steam_kp - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/write_steam_kd")
    public void writeSteamKd(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_steam_kd: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(3, val));
        } else{
            LOGGER.error("/write_steam_kd  - out of bound length :"+val);
            System.out.println("/write_steam_kd - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/write_electric_pwm")
    public void writeElectricPwm(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_electric_pwm: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(4, val));
        } else{
            LOGGER.error("/write_electric_pwm  - out of bound length :"+val);
            System.out.println("/write_electric_pwm - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/write_electric_ki")
    public void writeElectricKi(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_electric_ki: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(5, val));
        } else{
            LOGGER.error("/write_electric_ki  - out of bound length :"+val);
            System.out.println("/write_electric_ki - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/write_electric_kp")
    public void writeElectricKp(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_electric_kp: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(6, val));
        } else{
            LOGGER.error("/write_electric_kp  - out of bound length :"+val);
            System.out.println("/write_electric_kp - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/write_electric_kd")
    public void writeElectricKd(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_electric_kd: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(7, val));
        } else{
            LOGGER.error("/write_electric_kd  - out of bound length :"+val);
            System.out.println("/write_electric_kd - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/write_alarm")
    public void writeAlarm(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_alarm: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(8, val));
        } else{
            LOGGER.error("/write_alarm  - out of bound length :"+val);
            System.out.println("/write_alarm - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/write_regim1")
    public void writeRegim1(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_regim1: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(9, val));
        } else{
            LOGGER.error("/write_regim1  - out of bound length :"+val);
            System.out.println("/write_regim1 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/write_temp1")
    public void writeTemp1(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_temp1: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(10, val));
        } else{
            LOGGER.error("/write_temp1  - out of bound length :"+val);
            System.out.println("/write_temp1 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/write_press1")
    public void writePress1(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_press1: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(11, val));
        } else{
            LOGGER.error("/write_press1  - out of bound length :"+val);
            System.out.println("/write_press1 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/write_regim2")
    public void writeRegim2(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_regim2: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(12, val));
        } else{
            LOGGER.error("/write_regim2  - out of bound length :"+val);
            System.out.println("/write_regim2 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/write_temp2")
    public void writeTemp2(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_temp2: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(13, val));
        } else{
            LOGGER.error("/write_temp2  - out of bound length :"+val);
            System.out.println("/write_temp2 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/write_press2")
    public void writePress2(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_press2: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(14, val));
        } else{
            LOGGER.error("/write_press2  - out of bound length :"+val);
            System.out.println("/write_press2 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/write_regim3")
    public void writeRegim3(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_regim3: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(15, val));
        } else{
            LOGGER.error("/write_regim3  - out of bound length :"+val);
            System.out.println("/write_regim3 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/write_temp3")
    public void writeTemp3(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_temp3: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(16, val));
        } else{
            LOGGER.error("/write_temp3  - out of bound length :"+val);
            System.out.println("/write_temp3 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/write_press3")
    public void writePress3(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_press3: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(17, val));
        } else{
            LOGGER.error("/write_press3  - out of bound length :"+val);
            System.out.println("/write_press3 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/write_regim4")
    public void writeRegim4(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_regim4: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(18, val));
        } else{
            LOGGER.error("/write_regim4  - out of bound length :"+val);
            System.out.println("/write_regim4 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/write_temp4")
    public void writeTemp4(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_temp4: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(19, val));
        } else{
            LOGGER.error("/write_temp4  - out of bound length :"+val);
            System.out.println("/write_temp4 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/write_press4")
    public void writePress4(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_press4: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(20, val));
        } else{
            LOGGER.error("/write_press4  - out of bound length :"+val);
            System.out.println("/write_press4 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/write_regim5")
    public void writeRegim5(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_regim5: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(21, val));
        } else{
            LOGGER.error("/write_regim5  - out of bound length :"+val);
            System.out.println("/write_regim5 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/write_temp5")
    public void writeTemp5(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_temp5: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(22, val));
        } else{
            LOGGER.error("/write_temp5  - out of bound length :"+val);
            System.out.println("/write_temp5 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/write_press5")
    public void writePress5(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_press5: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(23, val));
        } else{
            LOGGER.error("/write_press5  - out of bound length :"+val);
            System.out.println("/write_press5 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/write_regim6")
    public void writeRegim6(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_regim6: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(24, val));
        } else{
            LOGGER.error("/write_regim6  - out of bound length :"+val);
            System.out.println("/write_regim6 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/write_temp6")
    public void writeTemp6(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_temp6: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(25, val));
        } else{
            LOGGER.error("/write_temp6  - out of bound length :"+val);
            System.out.println("/write_temp6 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/write_press6")
    public void writePress6(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_press6: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(26, val));
        } else{
            LOGGER.error("/write_press6  - out of bound length :"+val);
            System.out.println("/write_press6 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/write_regim7")
    public void writeRegim7(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_regim7: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(27, val));
        } else{
            LOGGER.error("/write_regim7  - out of bound length :"+val);
            System.out.println("/write_regim7 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/write_temp7")
    public void writeTemp7(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_temp7: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(28, val));
        } else{
            LOGGER.error("/write_temp7  - out of bound length :"+val);
            System.out.println("/write_temp7 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/write_press7")
    public void writePress7(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_press7: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(29, val));
        } else{
            LOGGER.error("/write_press7  - out of bound length :"+val);
            System.out.println("/write_press7 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/write_regim8")
    public void writeRegim8(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_regim8: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(30, val));
        } else{
            LOGGER.error("/write_regim8  - out of bound length :"+val);
            System.out.println("/write_regim8 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/write_temp8")
    public void writeTemp8(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_temp8: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(31, val));
        } else{
            LOGGER.error("/write_temp8  - out of bound length :"+val);
            System.out.println("/write_temp8 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/write_press8")
    public void writePress8(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_press8: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(32, val));
        } else{
            LOGGER.error("/write_press8  - out of bound length :"+val);
            System.out.println("/write_press8 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/write_regim9")
    public void writeRegim9(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_regim9: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(33, val));
        } else{
            LOGGER.error("/write_regim9  - out of bound length :"+val);
            System.out.println("/write_regim9 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/write_temp9")
    public void writeTemp9(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_temp9: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(34, val));
        } else{
            LOGGER.error("/write_temp9  - out of bound length :"+val);
            System.out.println("/write_temp9 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/write_press9")
    public void writePress9(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_press9: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(35, val));
        } else{
            LOGGER.error("/write_press9  - out of bound length :"+val);
            System.out.println("/write_press9 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/write_regim10")
    public void writeRegim10(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_regim10: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(36, val));
        } else{
            LOGGER.error("/write_regim10  - out of bound length :"+val);
            System.out.println("/write_regim10 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/write_temp10")
    public void writeTemp10(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_temp10: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(37, val));
        } else{
            LOGGER.error("/write_temp10  - out of bound length :"+val);
            System.out.println("/write_temp10 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/write_press10")
    public void writePress10(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_press10: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(38, val));
        } else{
            LOGGER.error("/write_press10  - out of bound length :"+val);
            System.out.println("/write_press10 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/write_regim11")
    public void writeRegim11(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_regim11: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(39, val));
        } else{
            LOGGER.error("/write_regim11  - out of bound length :"+val);
            System.out.println("/write_regim11 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/write_temp11")
    public void writeTemp11(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_temp11: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(40, val));
        } else{
            LOGGER.error("/write_temp11  - out of bound length :"+val);
            System.out.println("/write_temp11 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/write_press11")
    public void writePress11(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_press11: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(41, val));
        } else{
            LOGGER.error("/write_press11  - out of bound length :"+val);
            System.out.println("/write_press11 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/write_regim12")
    public void writeRegim12(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_regim12: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(42, val));
        } else{
            LOGGER.error("/write_regim12  - out of bound length :"+val);
            System.out.println("/write_regim12 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/write_temp12")
    public void writeTemp12(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_temp12: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(43, val));
        } else{
            LOGGER.error("/write_temp12  - out of bound length :"+val);
            System.out.println("/write_temp12 - out of bound length :"+val);
        }
    }
    @MessageMapping(value = "/write_press12")
    public void writePress12(final JsonBodyFloat jsonBodyFloat, Authentication authentication){
        float val = jsonBodyFloat.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_press12: "+val));

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(44, val));
        } else{
            LOGGER.error("/write_press12  - out of bound length :"+val);
            System.out.println("/write_press12 - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/write_program")
    public void writeProgram(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_program: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(45, val));
        } else{
            LOGGER.error("/write_program  - out of bound length :"+val);
            System.out.println("/write_program - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/write_program_read")
    public void writeProgramRead(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_program_read: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(46, val));
        } else{
            LOGGER.error("/write_program_read  - out of bound length :"+val);
            System.out.println("/write_program_read - out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/write_program_write")
    public void write_program_write(final JsonBodyShort jsonBodyShort, Authentication authentication){
        short val = jsonBodyShort.getValue();
        loggerService.addByType(new TableModelLogger(new Date(), authentication.getName(), "/write_program_write: "+val));

        if ( (val >= 0) && (val <= 32000) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(46, val));
        } else{
            LOGGER.error("/write_program_write  - out of bound length :"+val);
            System.out.println("/write_program_write - out of bound length :"+val);
        }
    }
}
