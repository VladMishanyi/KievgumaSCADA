package com.vk.chain;

import com.vk.entity.modbus.ModbusBodyQuery;
import com.vk.service.data.SecondCehKameraVulcan1MPR51ServiceData;
import com.vk.service.data.SecondCehKameraVulcan2MPR51ServiceData;
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

    private final Logger LOGGER = Logger.getLogger(this.getClass());

    public static Queue<ModbusBodyQuery> modbusBodyQueryQueue = new LinkedList<>();

    private final TaskImplSecondCehKameraVulcan1MPR51 taskSecondCehKameraVulcan1MPR51;

    private final TaskImplSecondCehKameraVulcan2MPR51 taskSecondCehKameraVulcan2MPR51;

    private final TaskImplSecondCehKameraVulcan3MPR51 taskSecondCehKameraVulcan3MPR51;

    private final SecondCehKameraVulcan3MPR51ServiceData secondCehKameraVulcan3MPR51ServiceData;

    private final SecondCehKameraVulcan2MPR51ServiceData secondCehKameraVulcan2MPR51ServiceData;

    private final SecondCehKameraVulcan1MPR51ServiceData secondCehKameraVulcan1MPR51ServiceData;

    @Autowired
    public Chain4(final TaskImplSecondCehKameraVulcan1MPR51 taskSecondCehKameraVulcan1MPR51,
                  final TaskImplSecondCehKameraVulcan2MPR51 taskSecondCehKameraVulcan2MPR51,
                  final TaskImplSecondCehKameraVulcan3MPR51 taskSecondCehKameraVulcan3MPR51,
                  final SecondCehKameraVulcan3MPR51ServiceData secondCehKameraVulcan3MPR51ServiceData,
                  final SecondCehKameraVulcan2MPR51ServiceData secondCehKameraVulcan2MPR51ServiceData,
                  final SecondCehKameraVulcan1MPR51ServiceData secondCehKameraVulcan1MPR51ServiceData){
        this.taskSecondCehKameraVulcan1MPR51 = taskSecondCehKameraVulcan1MPR51;
        this.taskSecondCehKameraVulcan2MPR51 = taskSecondCehKameraVulcan2MPR51;
        this.taskSecondCehKameraVulcan3MPR51 = taskSecondCehKameraVulcan3MPR51;
        this.secondCehKameraVulcan3MPR51ServiceData = secondCehKameraVulcan3MPR51ServiceData;
        this.secondCehKameraVulcan2MPR51ServiceData = secondCehKameraVulcan2MPR51ServiceData;
        this.secondCehKameraVulcan1MPR51ServiceData = secondCehKameraVulcan1MPR51ServiceData;
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

                    case 100:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister0(body.getValueFloat());
                        break;
                    case 101:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister1(body.getValueFloat());
                        break;
                    case 102:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister2(body.getValueFloat());
                        break;
                    case 103:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister3(body.getValueFloat());
                        break;
                    case 104:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister4(body.getValueFloat());
                        break;
                    case 105:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister5(body.getValueFloat());
                        break;
                    case 106:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister6(body.getValueFloat());
                        break;
                    case 107:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister7(body.getValueFloat());
                        break;
                    case 108:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister8(body.getValueFloat());
                        break;
                    case 109:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister9(body.getValueShort());
                        break;
                    case 110:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister10(body.getValueFloat());
                        break;
                    case 111:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister11(body.getValueFloat());
                        break;
                    case 112:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister12(body.getValueShort());
                        break;
                    case 113:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister13(body.getValueFloat());
                        break;
                    case 114:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister14(body.getValueFloat());
                        break;
                    case 115:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister15(body.getValueShort());
                        break;
                    case 116:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister16(body.getValueFloat());
                        break;
                    case 117:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister17(body.getValueFloat());
                        break;
                    case 118:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister18(body.getValueShort());
                        break;
                    case 119:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister19(body.getValueFloat());
                        break;
                    case 120:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister20(body.getValueFloat());
                        break;
                    case 121:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister21(body.getValueShort());
                        break;
                    case 122:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister22(body.getValueFloat());
                        break;
                    case 123:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister23(body.getValueFloat());
                        break;
                    case 124:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister24(body.getValueShort());
                        break;
                    case 125:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister25(body.getValueFloat());
                        break;
                    case 126:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister26(body.getValueFloat());
                        break;
                    case 127:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister27(body.getValueShort());
                        break;
                    case 128:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister28(body.getValueFloat());
                        break;
                    case 129:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister29(body.getValueFloat());
                        break;
                    case 130:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister30(body.getValueShort());
                        break;
                    case 131:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister31(body.getValueFloat());
                        break;
                    case 132:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister32(body.getValueFloat());
                        break;
                    case 133:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister33(body.getValueShort());
                        break;
                    case 134:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister34(body.getValueFloat());
                        break;
                    case 135:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister35(body.getValueFloat());
                        break;
                    case 136:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister36(body.getValueShort());
                        break;
                    case 137:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister37(body.getValueFloat());
                        break;
                    case 138:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister38(body.getValueFloat());
                        break;
                    case 139:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister39(body.getValueShort());
                        break;
                    case 140:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister40(body.getValueFloat());
                        break;
                    case 141:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister41(body.getValueFloat());
                        break;
                    case 142:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister42(body.getValueShort());
                        break;
                    case 143:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister43(body.getValueFloat());
                        break;
                    case 144:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister44(body.getValueFloat());
                        break;
                    case 145:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister45(body.getValueShort());
                        break;
                    case 146:
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister46(body.getValueShort());
                        secondCehKameraVulcan2MPR51ServiceData.writeDataToRegister46((short) 0);
                        break;

                    case 200:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister0(body.getValueFloat());
                        break;
                    case 201:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister1(body.getValueFloat());
                        break;
                    case 202:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister2(body.getValueFloat());
                        break;
                    case 203:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister3(body.getValueFloat());
                        break;
                    case 204:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister4(body.getValueFloat());
                        break;
                    case 205:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister5(body.getValueFloat());
                        break;
                    case 206:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister6(body.getValueFloat());
                        break;
                    case 207:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister7(body.getValueFloat());
                        break;
                    case 208:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister8(body.getValueFloat());
                        break;
                    case 209:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister9(body.getValueShort());
                        break;
                    case 210:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister10(body.getValueFloat());
                        break;
                    case 211:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister11(body.getValueFloat());
                        break;
                    case 212:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister12(body.getValueShort());
                        break;
                    case 213:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister13(body.getValueFloat());
                        break;
                    case 214:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister14(body.getValueFloat());
                        break;
                    case 215:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister15(body.getValueShort());
                        break;
                    case 216:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister16(body.getValueFloat());
                        break;
                    case 217:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister17(body.getValueFloat());
                        break;
                    case 218:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister18(body.getValueShort());
                        break;
                    case 219:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister19(body.getValueFloat());
                        break;
                    case 220:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister20(body.getValueFloat());
                        break;
                    case 221:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister21(body.getValueShort());
                        break;
                    case 222:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister22(body.getValueFloat());
                        break;
                    case 223:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister23(body.getValueFloat());
                        break;
                    case 224:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister24(body.getValueShort());
                        break;
                    case 225:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister25(body.getValueFloat());
                        break;
                    case 226:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister26(body.getValueFloat());
                        break;
                    case 227:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister27(body.getValueShort());
                        break;
                    case 228:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister28(body.getValueFloat());
                        break;
                    case 229:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister29(body.getValueFloat());
                        break;
                    case 230:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister30(body.getValueShort());
                        break;
                    case 231:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister31(body.getValueFloat());
                        break;
                    case 232:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister32(body.getValueFloat());
                        break;
                    case 233:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister33(body.getValueShort());
                        break;
                    case 234:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister34(body.getValueFloat());
                        break;
                    case 235:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister35(body.getValueFloat());
                        break;
                    case 236:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister36(body.getValueShort());
                        break;
                    case 237:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister37(body.getValueFloat());
                        break;
                    case 238:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister38(body.getValueFloat());
                        break;
                    case 239:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister39(body.getValueShort());
                        break;
                    case 240:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister40(body.getValueFloat());
                        break;
                    case 241:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister41(body.getValueFloat());
                        break;
                    case 242:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister42(body.getValueShort());
                        break;
                    case 243:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister43(body.getValueFloat());
                        break;
                    case 244:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister44(body.getValueFloat());
                        break;
                    case 245:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister45(body.getValueShort());
                        break;
                    case 246:
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister46(body.getValueShort());
                        secondCehKameraVulcan1MPR51ServiceData.writeDataToRegister46((short) 0);
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
