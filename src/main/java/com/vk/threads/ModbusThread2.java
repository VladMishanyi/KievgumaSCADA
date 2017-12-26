package com.vk.threads;

/**
 * Created by User on 2017-06-15.
 */
public class ModbusThread2 extends Thread{
    boolean control = false;

    @Override
    public void run() {
        try {

            if (control) wait();
            else notify();

            for (int i = 0; i < 5; i++){
                System.out.println("Second :"+i);
                Thread.sleep(200);
            }
        }
        catch (InterruptedException e){
            System.out.println("Second :"+e.getMessage());
        }
    }
}
