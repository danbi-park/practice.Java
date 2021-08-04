package exception;

public class ThrowsEx {
    public static void main(String[] args) throws Exception{ //얘도 책임회피해서 jvm으로 감
        method1();
    }
    static void method1() throws Exception{ //책임회피해서 main으로 보냄
        method2();
    }
    static void method2() throws Exception{ //책임회피해서 method1으로 보냄
        System.out.println("method2()");
        throw new Exception("강제 발생"); //try catch 문ㅇ 안됨 메서드가 책임 회피
    }
}
