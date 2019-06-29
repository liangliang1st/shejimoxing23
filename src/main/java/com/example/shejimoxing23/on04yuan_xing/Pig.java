package com.example.shejimoxing23.on04yuan_xing;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Pig
 * @AUthor hanjialiang
 * @Date 2019-06-28 17:09
 * @Version 1.0
 * @Description
 */
public class Pig implements Cloneable, Serializable {

    private static final long serialVersionUID = -6243620708149950701L;

    private String name;
    private int age;
    private int sex;
    private Date birthday;

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", birthday=" + birthday +
                '}'+"----"+super.toString();
    }

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
