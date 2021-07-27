package classEx;

public class Hello {
    String greeting;
    int num1 = 10;
    int num2 = 20;
    int total = (num1 < 20)?1:0;

    void greet(){
        if(greeting == "Hello"){

        }
        System.out.println("Hello World");
    }

    public static void main(String[] args){
        Hello hello = new Hello();
        hello.greet();
        Foo foo = new Foo();
        foo.sleep();
        System.out.println(foo);
        System.out.println(hello);
    }
}