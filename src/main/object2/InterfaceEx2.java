package main.object2;

public class InterfaceEx2 {
    public static void main(String[] args) {
        Child3 c = new Child3();
        c.method1();   //interface는 무시됨
        c.method2();  //충돌하면 조상 method가 호출됨 default는 무시된다. 조상이 우선됨
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}


class Child3 extends Parent3 implements MyInterface, MyInterface2 {
    public void method1() {
        System.out.println("method1() in Child3");
    }
}

class Parent3{
    public void method2(){
        System.out.println("method2() in parent3");
    }
}

interface MyInterface{
    default void method1(){
        System.out.println("method1() in MyInterface");
    }
    default void method2(){
        System.out.println("method2() in MyInterface");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2{
    default void method1(){
        System.out.println("method1() in myinterface2");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in myInterface2");
    }
}