package com.example.shejimoxing23.on01_factory.test;

/**
 * @ClassName JavaVideoFactory
 * @AUthor hanjialiang
 * @Date 2019-06-27 20:33
 * @Version 1.0
 * @Description
 */
public class JavaVideoFactory implements VideoFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

}
