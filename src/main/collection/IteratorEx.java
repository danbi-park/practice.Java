package main.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //iterator은 한 번 적용 후 한 번 더 초기화를 해줘야 한다.
        it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
