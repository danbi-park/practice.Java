package generics;

import java.util.ArrayList;

public class TofBoxEx {
    public static void main(String[] args) {
        Box1<Apple1> appleBox = new Box1<>();
        appleBox.add(new Apple1());
        System.out.println(appleBox.get(0));

        Box1<Grape1> grapeBox = new Box1<>();
        grapeBox.add(new Grape1());
        System.out.println(grapeBox.get(0));

        Box1<Fruit1> fruitBox = new Box1<>();
        fruitBox.add(new Grape1());
        fruitBox.add(new Apple1());
        System.out.println(fruitBox.get(0));
        System.out.println(fruitBox.get(1));
    }
}

//사용자가 선언할 때는 T를 사용
class Box1<T>{
    ArrayList<T> list = new ArrayList<>();
    void add(T item) {
        list.add(item);
    }
    T get(int i){ return list.get(i);}
}
class Fruit1 { public String toString(){return getClass().getName();}}
class Grape1 extends Fruit1{}
class Apple1 extends Fruit1{}