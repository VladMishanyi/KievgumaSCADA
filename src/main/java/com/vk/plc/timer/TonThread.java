package com.vk.plc.timer;

/**
 * Created by User on 2018-04-13.
 */
public class TonThread extends Thread {

    public boolean inIn = false;
    public long timeIn = 0;
    public boolean qOut = false;
    public long timeOut = 0;
    private long count = 0;

    public TonThread(){
//        this.setDaemon(true);
    }

    @Override
    public void run() {

        System.out.println("---------");
        while (!this.isInterrupted()){
            try {
                if (inIn && !qOut){
                    this.sleep(1000);
                    timeOut = ++count;
                    timeOut = count;
                    System.out.println("count value :"+count);
                }

                if (timeIn == count){
                    qOut = true;
                    System.out.println("count done :"+qOut);
                }

                if (!inIn){
                    this.resetTon();
                    System.out.println("count not start");
                }
            }
            catch (InterruptedException e){
                e.printStackTrace();
                this.resetTon();
            }
        }
    }

    private void resetTon(){
//        inIn = false;
        timeIn = 0;
        qOut = false;
        timeOut = 0;
        this.count = 0;
    }
}
