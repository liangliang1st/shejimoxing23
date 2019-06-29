package com.example.shejimoxing23.on03sigleten.EurmSingleton;

import com.example.shejimoxing23.on03sigleten.test.Hungry;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName test
 * @AUthor hanjialiang
 * @Date 2019-06-27 09:51
 * @Version 1.0
 * @Description
 */
public class test implements Runnable {
    @Override
    public void run() {
        EnumSingleton hungry = EnumSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+"--"+hungry);
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException, ClassNotFoundException {
        /*Thread t1 = new Thread(new test());
        Thread t2 = new Thread(new test());
        t1.start();
        t2.start();*/

        /*EnumSingleton enum1 = EnumSingleton.getInstance();
        Class class1 = EnumSingleton.class;
        Constructor declaredConstructor = class1.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        EnumSingleton enum2 = (EnumSingleton) declaredConstructor.newInstance();

        System.out.println(enum1);
        System.out.println(enum2);
        System.out.println(enum2 == enum1);*/


     /*   Hungry hungry = Hungry.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("hjl"));
        oos.writeObject(hungry);
        File file = new File("hjl");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Hungry hungry1= (Hungry) ois.readObject();*/

//        System.out.println(hungry);
//        System.out.println(hungry1);
//        System.out.println(hungry == hungry1);

        EnumSingleton enumSingleton = EnumSingleton.getInstance();
        enumSingleton.test();
    }

}
