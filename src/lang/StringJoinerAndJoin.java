package lang;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.StringJoiner;

public class StringJoinerAndJoin {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");
        System.out.println(String.join("-", arr));
        StringJoiner joiner = new StringJoiner("/", "[", "]");
        for (String s : arr) {
            joiner.add(s);
        }
        System.out.println(joiner.toString());

        StringJoiner joiner2 = new StringJoiner(",", "[", "]");
        int[] arr2 = {1, 2, 3, 4, 5};
        for (int a : arr2) {
            joiner2.add(String.valueOf(a));
        }
        System.out.println(joiner2.toString());
    }

}
