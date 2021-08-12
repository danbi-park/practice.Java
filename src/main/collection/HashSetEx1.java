package main.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        //set은 중복 허용 안함
        //접근할라면 다 iterator하면 됨 iterator은 new안씀 collection씀
        set.add(0);
        set.add(1);
        set.add(2);
        set.add(1);

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(set.contains(3));
        set.clear(); //clear하면 내용 다 삭제됨
        System.out.println(set);


    }
}
