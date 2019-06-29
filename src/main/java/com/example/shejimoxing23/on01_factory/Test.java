package com.example.shejimoxing23.on01_factory;

/**
 * @ClassName Test
 * @AUthor hanjialiang
 * @Date 2019-06-25 08:14
 * @Version 1.0
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

        VideoFactory videoFactory1 = new PythonVideoFactory();
        Video video1 = videoFactory1.getVideo();
        video1.produce();
    }
}
