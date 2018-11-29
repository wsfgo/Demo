package com.wsf.demo.util;

import org.springframework.util.ObjectUtils;

/**
 * Created by WangShuFa on 2018/10/16.
 */
public class LazySingleton {
    //懒汉式单例模式
    //比较懒，在类加载时，不创建实例，因此类加载速度快，但运行时获取对象的速度慢
    private static LazySingleton instance=null; //静态私有成员，创建时不初始化

    private LazySingleton(){
        //私有构造方法

    }

    public static synchronized LazySingleton getInstance(){
        if(ObjectUtils.isEmpty(instance)){
            instance=new LazySingleton();
        }
        return instance;
    }
}
