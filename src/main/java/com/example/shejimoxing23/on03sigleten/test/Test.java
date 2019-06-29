package com.example.shejimoxing23.on03sigleten.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName Test
 * @AUthor hanjialiang
 * @Date 2019-06-29 15:30
 * @Version 1.0
 * @Description
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c = Hungry.class;
        Constructor constructor = c.getDeclaredConstructor();
        constructor.setAccessible(true);
        Hungry hungry= (Hungry) constructor.newInstance();
        Hungry trueHngry = Hungry.getInstance();
        System.out.println(hungry);
        System.out.println(trueHngry);
        System.out.println(hungry==trueHngry);
    }
}
