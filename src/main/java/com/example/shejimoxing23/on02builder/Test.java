package com.example.shejimoxing23.on02builder;

/**
 * @ClassName Test
 * @AUthor hanjialiang
 * @Date 2019-06-25 15:42
 * @Version 1.0
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .buildAge("1")
                .buildName("hahaha")
                .buildSex(1)
                .build();
    }
}
