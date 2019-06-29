package com.example.shejimoxing23.on04yuan_xing;

import java.util.Date;

/**
 * @ClassName Test
 * @AUthor hanjialiang
 * @Date 2019-06-28 17:13
 * @Version 1.0
 * @Description
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(0L);
        Pig pig = new Pig("配齐", date);
        Pig pig1 = (Pig) pig.clone();
        System.out.println(pig);
        System.out.println(pig1);

        pig1.setBirthday(new Date(666666666666L));
        System.out.println(pig);
        System.out.println(pig1);
    }
}
