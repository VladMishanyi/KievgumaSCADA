package com.vk.threads;

/**
 * Created by User on 2017-06-16.
 */
public class User {

    public synchronized void getGods(String name, boolean stat){
        try {
            if (stat) wait();
            for (int i=0; i<5; i++ ){
                System.out.println(name +" : "+ i);
                Thread.sleep(1000);
            }
            notify();
        }
        catch (InterruptedException e){
            System.out.println(name +" : "+ e.getMessage());
        }
    }
}
