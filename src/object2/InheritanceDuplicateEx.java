package object2;

public class InheritanceDuplicateEx {
    public static void main(String[] args) {
//    Parent p = new Parent();
        Child c = new Child();
        c.method();
//    Child c1 = new Parent(); //부자 no
        Parent p1 = new Child(); //자부 ok
        System.out.println("자부의 x: "+p1.x);
        p1.method();
    }
}

class Parent{
    int x = 10;
    public Parent(int x) {
        this.x = x;
    }
    void method(){
        System.out.println("Parent");
    }
}

class Child extends Parent{
    //  int x =  20;
    public Child() {
        super(20);
        System.out.println("생성자");
    }

    void method(){
        System.out.println("Child");
        System.out.println("x="+x);
        System.out.println("this.x="+x);
        System.out.println("super.x="+super.x);
    }
}