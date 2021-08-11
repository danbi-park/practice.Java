package main.object1;

public class StaticMethodEx {
    public static void main(String[] args) {
        System.out.println(MyMath2.add(1,2));
        System.out.println(MyMath2.c);
        MyMath2 mm = new MyMath2();
        System.out.println(mm.add());   //두방법 다 사용 가능
        System.out.println(mm.add(1,2));    //직접 값을 넣어도 괜츈
    }
}

class MyMath2 {
    long a,b;
    static long c;
    long add(){return a + b;}
    static long add(long l1, long l2){
        return l1+ l2;
    }

}
