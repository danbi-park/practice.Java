package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashLotto {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        for (int i = 0; i < 45; i++) {
            set.add(i+1);
        }

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}

