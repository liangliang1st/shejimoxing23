package com.example.shejimoxing23.on03sigleten.doublesingleton;

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
        DoubleLazySingleton doubleLazySingleton = DoubleLazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+"  "+doubleLazySingleton);

    }
}
