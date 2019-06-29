package com.example.shejimoxing23.on03sigleten.test;

import java.io.Serializable;

/**
 * @ClassName Hungry
 * @AUthor hanjialiang
 * @Date 2019-06-29 15:27
 * @Version 1.0
 * @Description
 */
public class Hungry implements Serializable {

    private final static Hungry hungry;

    static {
        hungry = new Hungry();
    }

    private Hungry() {
        if (hungry != null) {
            throw new  RuntimeException("不知道为啥错了");
        }
    }

    public static Hungry getInstance() {
        return hungry;
    }

    private Object readResolve(){
        return hungry;
    }
}
