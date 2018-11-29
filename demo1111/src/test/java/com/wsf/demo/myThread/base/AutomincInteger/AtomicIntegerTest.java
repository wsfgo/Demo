package com.wsf.demo.myThread.base.AutomincInteger;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by WangShuFa on 2018/10/9.
 */
public class AtomicIntegerTest {

    static AtomicInteger count=new AtomicInteger(0);

    public static void main(String args[]){
       for(int i=0;i<1000;i++){
           new Thread(){
               @Override
               public void run() {
                  count.getAndIncrement();
               }
           }.start();
       }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("count="+count);
    }

}
