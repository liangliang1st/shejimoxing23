package com.example.shejimoxing23.on03sigleten.serilaziablesingleton;

import java.io.Serializable;

/**
 * @ClassName HungrySingleton
 * @AUthor hanjialiang
 * @Date 2019-06-26 17:34
 * @Version 1.0
 * @Description
 */
public class HungrySingleton implements Serializable {
    private HungrySingleton(){}
    private final static HungrySingleton hungrySingleton=new HungrySingleton();
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
    private Object readResolve(){
        return hungrySingleton;
    }
}
