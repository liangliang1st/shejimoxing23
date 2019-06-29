package com.example.shejimoxing23.on03sigleten.lazysingleten;

/**
 * @ClassName Test
 * @AUthor hanjialiang
 * @Date 2019-06-26 16:16
 * @Version 1.0
 * @Description
 */
public class Test {
    public static void main(String[] args) {
//        LazySingleton lazySingleton=LazySingleton.getInstance();
        Thread thread = new Thread(new T());
        Thread thread1 = new Thread(new T());
        thread.start();
        thread1.start();
        System.out.println("END");
    }
}
