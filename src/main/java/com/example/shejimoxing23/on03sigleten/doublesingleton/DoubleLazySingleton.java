package com.example.shejimoxing23.on03sigleten.doublesingleton;

/**
 * @ClassName DoubleLazySingleton
 * @AUthor hanjialiang
 * @Date 2019-06-26 16:30
 * @Version 1.0
 * @Description
 */
public class DoubleLazySingleton {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private volatile static DoubleLazySingleton doubleLazySingleton=null;
    private DoubleLazySingleton(){}
    public static DoubleLazySingleton getInstance(){
        if (doubleLazySingleton==null){
            synchronized (DoubleLazySingleton.class){
                if (doubleLazySingleton==null){
                    doubleLazySingleton=new DoubleLazySingleton();
                }
            }
        }
        return doubleLazySingleton;
    }
}
