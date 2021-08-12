package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        String[] strArr = {"aaa", "bbb", "ccc"};
        List<String> strList = Arrays.asList(strArr);
        System.out.println(strList);

        Stream<String> strStream1 = strList.stream();
        Stream<String> strStream2 = Arrays.stream(strArr);
        strStream1.sorted().forEach(new Consumer<String>() {
            int idx = 0;
            @Override
            public void accept(String s) {
                if(idx++!=0) System.out.print(",");
                System.out.print(s);
            }
        });
        System.out.println();
        strStream2.sorted().forEach(s -> System.out.print(s));

    }
}
