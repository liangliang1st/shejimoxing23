package com.example.shejimoxing23.on03sigleten.hungrysingleton;

/**
 * @ClassName HungrySingleTon
 * @AUthor hanjialiang
 * @Date 2019-06-26 17:12
 * @Version 1.0
 * @Description
 */
public class HungrySingleTon {
    private final static HungrySingleTon hungrySingleton = new HungrySingleTon();
    private HungrySingleTon(){}
    public static HungrySingleTon getInstance(){
        return hungrySingleton;
    }

}
