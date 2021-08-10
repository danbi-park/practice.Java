package collection;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet lotto = new TreeSet();
        while (lotto.size() < 6) {
            lotto.add((int) (Math.random() * 45 + 1));
        }
        System.out.println(lotto);
    }
}
