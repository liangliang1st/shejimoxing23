package com.example.shejimoxing23.on03sigleten.lazysingleten;

/**
 * @ClassName T
 * @AUthor hanjialiang
 * @Date 2019-06-26 16:17
 * @Version 1.0
 * @Description
 */
public class T implements Runnable {
    @Override
    public void run() {
        LazySingleton lazySingleton=LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+"  "+lazySingleton);
    }
}
