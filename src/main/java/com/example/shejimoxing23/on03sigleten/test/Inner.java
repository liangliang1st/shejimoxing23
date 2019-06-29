package com.example.shejimoxing23.on03sigleten.test;

/**
 * @ClassName Inner
 * @AUthor hanjialiang
 * @Date 2019-06-29 21:15
 * @Version 1.0
 * @Description
 */
public class Inner {
    private static class InnerClass{
        private static Inner inner = new Inner();
    }

    private Inner(){}

    public static Inner getInstance() {
        return InnerClass.inner;
    }
}
