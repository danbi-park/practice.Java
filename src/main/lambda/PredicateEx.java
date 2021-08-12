package lambda;

import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
//        Predicate<String> isEmptystr = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.length == 0;
//            }
//        };
        Predicate<String> isEmptyStr = s -> s.length() == 0;
        String str = "";
        if (isEmptyStr.test(str)) {
        }
    }
}
