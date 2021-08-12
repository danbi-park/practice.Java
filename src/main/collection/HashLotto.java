package main.collection;

import java.util.*;

public class HashLotto {
    public static void main(String[] args) {
        HashSet lotto = new HashSet();
        while (lotto.size() < 6) lotto.add((int) (Math.random() * 45) + 1);

        System.out.println(lotto);
//    Iterator it = lotto.iterator();
//    while (it.hasNext()) {
//      System.out.print(it.next());
//    }

        //정렬해서 나오게 함
        List list = new LinkedList(lotto);
        Collections.sort(list);
        System.out.println(list);

    }
}
