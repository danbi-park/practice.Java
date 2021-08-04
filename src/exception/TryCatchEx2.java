package exception;

import java.io.FileNotFoundException;

public class TryCatchEx2 {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(2);
            System.out.println(10/0); //얘가 실행하는 순간에 catch문으로 넘어간다.
            System.out.println(3);
        } catch (Exception e) {     //FileNotFoundException e로 하면 안됨!
            System.out.println(e.getMessage());
            if (e instanceof ArithmeticException) //runtimeexception임
                System.out.println("ArithmeticException 마자용");
            System.out.println(4); //예외가 발생하지 않아 그냥 skip
        }

        System.out.println(5);
        System.out.println(6);
    }
}
