package com.example.shejimoxing23.on02builder;

/**
 * @ClassName Course
 * @AUthor hanjialiang
 * @Date 2019-06-25 15:24
 * @Version 1.0
 * @Description
 */
public class Course {
    private String name;
    private String age;
    private int sex;



    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex=" + sex +
                '}';
    }

    public Course(CourseBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
    }

    public static class CourseBuilder{

        private String name;
        private String age;
        private int sex;

        public CourseBuilder buildName(String name) {
            this.name=name;
            return this;
        }

        public CourseBuilder buildAge(String age) {
            this.age=age;
            return this;
        }

        public CourseBuilder buildSex(int sex) {
            this.sex=sex;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }
}
