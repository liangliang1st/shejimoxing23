package com.example.shejimoxing23.on01_factory;

/**
 * @ClassName PythonVideoFactory
 * @AUthor hanjialiang
 * @Date 2019-06-25 08:18
 * @Version 1.0
 * @Description
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
