package lambda;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorMethodEx {
    public static void main(String[] args) {
        //1. Function
        MyClass obj = new MyClass(1);
        Function<MyClass, Boolean> func = (a) -> obj.equals(a);
        System.out.println(func.apply(new MyClass(5)));

        //2. Supplier
// MyClass의 인스턴스를 리턴받는 예제
//    Supplier<MyClass> supplier = new Supplier<MyClass>() {
//      @Override
//      public MyClass get() {
//        return new MyClass(1);
//      }
//    };
        Supplier<MyClass> supplier = () -> new MyClass(1);
        MyClass myClass = supplier.get();
        System.out.println(myClass.num);

//    Supplier<MyClass> supplier2=()->new MyClass();//기본생성자가능
        Supplier<MyClass> supplier2 = MyClass::new; //기본생성자가능
    }
}
class MyClass{
    int num;
    public MyClass(int num) {this.num = num;}
    public MyClass() {this.num = 5;}

    @Override
    public int hashCode() {
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyClass) {
            if(((MyClass) obj).num==this.num) return true;
        }
        return false;
    }
}