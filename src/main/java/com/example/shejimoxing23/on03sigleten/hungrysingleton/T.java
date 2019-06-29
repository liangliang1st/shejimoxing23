package com.example.shejimoxing23.on03sigleten.hungrysingleton;

import com.example.shejimoxing23.on03sigleten.doublesingleton.DoubleLazySingleton;

/**
 * @ClassName T
 * @AUthor hanjialiang
 * @Date 2019-06-26 16:32
 * @Version 1.0
 * @Description
 */
public class T implements Runnable {
    @Override
    public void run() {
        HungrySingleTon doubleLazySingleton = HungrySingleTon.getInstance();
        System.out.println(Thread.currentThread().getName()+"  "+doubleLazySingleton);

    }
}
