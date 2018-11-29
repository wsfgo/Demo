package com.wsf.demo.util;

/**
 * Created by WangShuFa on 2018/10/16.
 */
public class EagerSingleton {
    //饿汉单例模式
    //在类加载时就完成了初始化，所以类加载较慢，但获取对象的速度快
    private static EagerSingleton instance=new EagerSingleton();

    private EagerSingleton(){
        //私有构造函数
    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}
