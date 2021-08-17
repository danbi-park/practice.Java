package io;

import java.io.*;
import java.util.ArrayList;

public class SerializationEx {
    public static void main(String[] args) {
        String fileName = "UserInfo.ser";
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            BufferedOutputStream box = new BufferedOutputStream(fos);
            ObjectOutputStream out = new ObjectOutputStream(box);
            UserInfo u1 = new UserInfo("javaMan","1234",30);
            UserInfo u2 = new UserInfo("javaWoman","1234",26);

            ArrayList<UserInfo> list = new ArrayList<>();
            list.add(u1);
            list.add(u2);
            out.writeObject(u1);
            out.writeObject(u2);
            out.writeObject(list);
            out.close();
            System.out.println("직렬화 끝");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                    e.printStackTrace();
                }



    }
}
