package com.vk.chain;

import com.vk.controller.WebController;
import com.vk.entity.modbus.ModbusBodyQuery;
import com.vk.service.data.SecondCehKameraVulcan3MPR51ServiceData;
import com.vk.tasks.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by KIP-PC99 on 21.11.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service"})
public class Chain4/* extends Thread */{

    private final Logger LOGGER = Logger.getLogger(Chain4.class);

    public static Queue<ModbusBodyQuery> modbusBodyQueryQueue = new LinkedList<>();

    private final TaskImplSecondCehKameraVulcan1MPR51 taskSecondCehKameraVulcan1MPR51;

    private final TaskImplSecondCehKameraVulcan2MPR51 taskSecondCehKameraVulcan2MPR51;

    private final TaskImplSecondCehKameraVulcan3MPR51 taskSecondCehKameraVulcan3MPR51;

    private final SecondCehKameraVulcan3MPR51ServiceData secondCehKameraVulcan3MPR51ServiceData;

    @Autowired
    public Chain4(final TaskImplSecondCehKameraVulcan1MPR51 taskSecondCehKameraVulcan1MPR51,
                  final TaskImplSecondCehKameraVulcan2MPR51 taskSecondCehKameraVulcan2MPR51,
                  final TaskImplSecondCehKameraVulcan3MPR51 taskSecondCehKameraVulcan3MPR51,
                  final SecondCehKameraVulcan3MPR51ServiceData secondCehKameraVulcan3MPR51ServiceData){
        this.taskSecondCehKameraVulcan1MPR51 = taskSecondCehKameraVulcan1MPR51;
        this.taskSecondCehKameraVulcan2MPR51 = taskSecondCehKameraVulcan2MPR51;
        this.taskSecondCehKameraVulcan3MPR51 = taskSecondCehKameraVulcan3MPR51;
        this.secondCehKameraVulcan3MPR51ServiceData = secondCehKameraVulcan3MPR51ServiceData;
//        this.start();
    }

//    @Override
    public void run() {
//        while (!this.isInterrupted()){
//            try {
                System.out.println("-----------------------------------------------------START FOURTH CHAIN444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
                taskSecondCehKameraVulcan1MPR51.work1();

                taskSecondCehKameraVulcan2MPR51.work1();

                taskSecondCehKameraVulcan3MPR51.work1();

                checkQueryQueue();
                System.out.println("-----------------------------------------------------END FOURTH CHAIN444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
//                this.sleep(5000);
//            }catch (InterruptedException e){
//                String message = e.getMessage();
//                LOGGER.error("Interrupted chain4 thread --"+message);
//                System.out.println("Interrupted chain4 thread --"+message);
//            }
//        }
    }


    public void checkQueryQueue(){
        if (modbusBodyQueryQueue.size() > 0) {
            while (!modbusBodyQueryQueue.isEmpty()) {
                ModbusBodyQuery body = modbusBodyQueryQueue.poll();
                switch (body.getQueryNumber()) {
                    case 0:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister0(body.getValueFloat());
                        break;
                    case 1:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister1(body.getValueFloat());
                        break;
                    case 2:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister2(body.getValueFloat());
                        break;
                    case 3:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister3(body.getValueFloat());
                        break;
                    case 4:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister4(body.getValueFloat());
                        break;
                    case 5:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister5(body.getValueFloat());
                        break;
                    case 6:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister6(body.getValueFloat());
                        break;
                    case 7:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister7(body.getValueFloat());
                        break;
                    case 8:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister8(body.getValueFloat());
                        break;
                    case 9:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister9(body.getValueShort());
                        break;
                    case 10:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister10(body.getValueFloat());
                        break;
                    case 11:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister11(body.getValueFloat());
                        break;
                    case 12:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister12(body.getValueShort());
                        break;
                    case 13:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister13(body.getValueFloat());
                        break;
                    case 14:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister14(body.getValueFloat());
                        break;
                    case 15:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister15(body.getValueShort());
                        break;
                    case 16:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister16(body.getValueFloat());
                        break;
                    case 17:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister17(body.getValueFloat());
                        break;
                    case 18:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister18(body.getValueShort());
                        break;
                    case 19:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister19(body.getValueFloat());
                        break;
                    case 20:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister20(body.getValueFloat());
                        break;
                    case 21:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister21(body.getValueShort());
                        break;
                    case 22:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister22(body.getValueFloat());
                        break;
                    case 23:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister23(body.getValueFloat());
                        break;
                    case 24:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister24(body.getValueShort());
                        break;
                    case 25:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister25(body.getValueFloat());
                        break;
                    case 26:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister26(body.getValueFloat());
                        break;
                    case 27:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister27(body.getValueShort());
                        break;
                    case 28:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister28(body.getValueFloat());
                        break;
                    case 29:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister29(body.getValueFloat());
                        break;
                    case 30:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister30(body.getValueShort());
                        break;
                    case 31:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister31(body.getValueFloat());
                        break;
                    case 32:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister32(body.getValueFloat());
                        break;
                    case 33:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister33(body.getValueShort());
                        break;
                    case 34:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister34(body.getValueFloat());
                        break;
                    case 35:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister35(body.getValueFloat());
                        break;
                    case 36:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister36(body.getValueShort());
                        break;
                    case 37:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister37(body.getValueFloat());
                        break;
                    case 38:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister38(body.getValueFloat());
                        break;
                    case 39:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister39(body.getValueShort());
                        break;
                    case 40:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister40(body.getValueFloat());
                        break;
                    case 41:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister41(body.getValueFloat());
                        break;
                    case 42:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister42(body.getValueShort());
                        break;
                    case 43:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister43(body.getValueFloat());
                        break;
                    case 44:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister44(body.getValueFloat());
                        break;
                    case 45:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister45(body.getValueShort());
                        break;
                    case 46:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister46(body.getValueShort());
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister46((short) 0);
                        break;

                    default: {
                        LOGGER.error("Wrong command in Chain4 --" + body.getQueryNumber());
                        System.out.println("Wrong command in Chain4 --" + body.getQueryNumber());
                        break;
                    }
                }
            }
        }
    }
}
