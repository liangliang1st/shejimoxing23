package com.example.shejimoxing23.on03sigleten.InnerSingleton;

/**
 * @ClassName Test
 * @AUthor hanjialiang
 * @Date 2019-06-26 16:32
 * @Version 1.0
 * @Description
 */
public class Test  {
    public static void main(String[] args) {
        Thread thread = new Thread(new T());
        Thread thread1 = new Thread(new T());
        thread1.start();
        thread.start();
        System.out.println("END--");
    }
}
