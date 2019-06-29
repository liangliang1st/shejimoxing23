package com.example.shejimoxing23.on01_factory;

/**
 * @ClassName JavaVideoFactory
 * @AUthor hanjialiang
 * @Date 2019-06-25 08:03
 * @Version 1.0
 * @Description
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        Video video = new JavaVideo();
        return video;
    }
}
