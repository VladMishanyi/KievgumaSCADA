package com.vk.threads;

import com.vk.entity.TRM201_Energrtic;
import com.vk.service.TRMRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by KIP on 04.12.2017.
 */
@Component
public class LoopFirstChannel extends Thread {

    private TRMRepositoryService trmRepositoryService;
    private MessageSendingOperations<String> messageSendingOperations;
    private float trm201Temp;
    private final int ID_SLAVE_TRM201 = 16;

    public LoopFirstChannel(TRMRepositoryService trmRepositoryService, MessageSendingOperations<String> messageSendingOperations){
        this.trmRepositoryService = trmRepositoryService;
        this.messageSendingOperations = messageSendingOperations;
        this.start();
    }

    @Override
    public void run() {
//        while (true){
            TRM201_Energrtic trm201_energrtic = trmRepositoryService.getTRM201(ID_SLAVE_TRM201);
            messageSendingOperations.convertAndSend("/topic/trm201", trm201_energrtic);

            if ((trm201Temp -1 >= trm201_energrtic.getValue3()) || (trm201Temp +1 <= trm201_energrtic.getValue3())){
                trmRepositoryService.addTRMvalue(trm201_energrtic);
                trm201Temp = trm201_energrtic.getValue3();
            }
//            try {
//                this.wait(1000);
//            }
//            catch (InterruptedException e){
//                e.printStackTrace();
//            }
//        }
    }

    public float getTrm201Temp() {
        return trm201Temp;
    }

    public void setTrm201Temp(float trm201Temp) {
        this.trm201Temp = trm201Temp;
    }
}
