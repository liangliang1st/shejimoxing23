package com.example.shejimoxing23.on03sigleten.serilaziablesingleton;

import java.io.*;

/**
 * @ClassName Test
 * @AUthor hanjialiang
 * @Date 2019-06-26 17:37
 * @Version 1.0
 * @Description
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HungrySingleton hungrySingleton=HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file"));
        oos.writeObject(hungrySingleton);

        File file = new File("file");
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newHungrySingleton = (HungrySingleton) is.readObject();

        System.out.println(hungrySingleton);
        System.out.println(newHungrySingleton);
        System.out.println(hungrySingleton==newHungrySingleton);
    }
}
