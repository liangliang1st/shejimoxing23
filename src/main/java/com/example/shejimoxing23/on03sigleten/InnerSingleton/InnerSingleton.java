package com.example.shejimoxing23.on03sigleten.InnerSingleton;

/**
 * @ClassName InnerSingleton
 * @AUthor hanjialiang
 * @Date 2019-06-26 16:47
 * @Version 1.0
 * @Description
 */
public class InnerSingleton {
    private static class InngerClass{
        private static InnerSingleton innerSingleton = new InnerSingleton();
    }
    private InnerSingleton(){}

    public static InnerSingleton getInstance(){
        return InngerClass.innerSingleton;
    }

}
