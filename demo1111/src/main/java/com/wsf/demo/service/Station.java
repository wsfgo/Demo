package com.wsf.demo.service;

import java.beans.Transient;

/**
 * Created by WangShuFa on 2018/8/30.
 */
public class Station extends Thread {
     static int ticket=20;

    @Override
    public void run() {
      saleTicket();
    }

    public synchronized void saleTicket(){
        while(ticket>0){
            if (ticket>0) {
                ticket--;
                System.out.println( "卖出了第" + ticket + "张票");
            }else{
                System.out.print("票已经卖完了！");
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]){
//        Station station=new Station();
//        station.start();
//        Station station1=new Station();
//        station1.start();
//        Station station2=new Station();
//        station2.start();
        transationTest2("a");
    }


    @Transient
    public static void transationTest1(String x){
        if("a".equals(x)){
            System.out.print("Transation1");
        }else{
            System.out.print("Transation11111111");
        }
        System.out.println(x);
        int b=2/0;
        System.out.print(b);
    }


    public static void transationTest2(String x){
        if("a".equals(x)){
            System.out.print("Transation2");
        }else{
            System.out.print("Transation22222222");
        }
        x+="123456";
        System.out.println(x);
        transationTest1("a"+x);
    }
}
