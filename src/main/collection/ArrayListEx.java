package main.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(0);
        list.add("1");
        list.add(true);
        list.add(new Date()); //Mon Aug 09 15:20:15 KST 2021 string은 date를 이렇게 찍도록 해놓음
        list.add(4);
        System.out.println(list.toString());
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
            System.out.println(list.get(i) instanceof Date?"0":"X"); //Date찾기
        }

        System.out.println(list.indexOf("1")); //1나옴 1번째라서
        System.out.println(list.indexOf(true)); //2나옴 2번째라서
        System.out.println(list.indexOf(0)); // 0번째
        System.out.println(list.indexOf(new Date())); //equals가 정의되지 않아서 잘 안나옴

        //삭제하기
        list.remove(3);
        System.out.println(list.toString()); //[0, 1, true, 4]

        //정해진 인덱스에 값 덮어쓰기
        list.set(1,1);
        list.set(2,2);
        System.out.println(list.toString()); //[0, 1, 2, 4]

        Comparator comp = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Comparable && o2 instanceof Comparable){
                    Comparable c1 = (Comparable) o1;
                    Comparable c2 = (Comparable) o2;
                    return c1.compareTo(c2)*-1; //-1하면 역으로 바뀜
                }
                return -1;
            }
        };
        //list.sort();
        Collections.sort(list,comp);
        System.out.println(list.toString());
    }
}