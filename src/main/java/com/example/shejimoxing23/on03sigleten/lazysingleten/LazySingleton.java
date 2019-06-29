package com.example.shejimoxing23.on03sigleten.lazysingleten;

/**
 * @ClassName LazySingleton
 * @AUthor hanjialiang
 * @Date 2019-06-26 16:13
 * @Version 1.0
 * @Description
 */
public class LazySingleton {
    private static LazySingleton lazySingleton=null;
    private LazySingleton(){}
    public synchronized static LazySingleton getInstance(){
        if (lazySingleton==null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }
}
