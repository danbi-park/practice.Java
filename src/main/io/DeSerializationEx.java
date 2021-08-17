package io;

import java.io.*;
import java.util.ArrayList;

public class DeSerializationEx {
    public static void main(String[] args) {
        String fileName = "UserInfo.ser";
        try {
            FileInputStream fos = new FileInputStream(fileName);
            BufferedInputStream box = new BufferedInputStream(fos);
            ObjectInputStream in = new ObjectInputStream(box);
            UserInfo u1 =(UserInfo) in.readObject();
            UserInfo u2 =(UserInfo) in.readObject();
            ArrayList list = (ArrayList) in.readObject();
            System.out.println(u1);
            System.out.println(u2);
            System.out.println(list);
            in.close();
        }catch(Exception e){

        }
    }
}
