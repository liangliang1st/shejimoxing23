package com.example.shejimoxing23.on01_factory.test;

/**
 * @ClassName Test
 * @AUthor hanjialiang
 * @Date 2019-06-27 20:33
 * @Version 1.0
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }

}
