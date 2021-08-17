package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamOutputStream {
    public static void main(String[] args) {
        byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        byte[] outSrc = null;
//        byte[] temp = new byte[4];
        System.out.println("Input Source:" + Arrays.toString(inSrc));

        ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream output= new ByteArrayOutputStream();

//1)
//        int data = 0;
//                //data에 input 대입
//        while ((data = input.read()) != -1) { //-1 means nothing on file
//            output.write(data);
//        }

//2)
////temp는 byte 타입의 배열 0번째부터 temp의 길이값만큼 input의 데이터가 채워진다.
//        input.read(temp,0, temp.length);
////output에 input의 5번째부터 5길이만큼 데이터를 넣음
//        output.write(temp,5,5);


//3)
        while (input.available() > 0) {
            try { //주체를 잘 이해해야함
                byte[] buffer = new byte[4];
                int length = input.read(buffer); //길이값 만큼만 출력하기 위해서
                byte[] temp = Arrays.copyOf(buffer,length);

                output.write(temp,0,length);
                outSrc = output.toByteArray();
                System.out.println("temp : " + Arrays.toString(temp));
                System.out.println("outSrc : " + Arrays.toString(outSrc));
                buffer = new byte[4];
            } catch (IOException e) { }
        }

//        outSrc = output.toByteArray();
//        System.out.println("inSrc : " + Arrays.toString(inSrc));
//        System.out.println("temp : " + Arrays.toString(inSrc));
//        System.out.println("outSrc : " + Arrays.toString(outSrc));
    }
}
