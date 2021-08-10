package generics;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorGenericEx {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student());
        list.add(new Student());
        list.add(new Student());
        Iterator it = list.iterator();
        while(it.hasNext()){
            Student s = (Student)it.next();
        }
        Iterator<Student> it2 = list.iterator();
        while(it2.hasNext()){
            Student s = it2.next(); //형변환 불필요
        }
    }
}
class Student{}
