package lang;

import java.util.Arrays;

public class StringMethodEx {
    public static void main(String[] args) {
        //바로 값 넣는 거임
        String str = "abc";
        //String만들 때 생성연산자, 생성자를 이용해서 String타입의 변수를 초기화
        //new다음에 나올 수 있는건 생성자임.
        str = new String("abc");
        str = new String(new char[]{'a','b','c'});
        str = new String(new StringBuffer("abc")); //이렇게도 문자열 만들ㅇ기 가능

        System.out.println(str.charAt(0));
        System.out.println(str.compareTo("0abc")); //compareTo는 같으면 0, 크면 음수, 작으면 양수
        System.out.println(str.concat("defg")); //문자열을 뒤에 덧붙임
        System.out.println(str.contains("a")); // 포함하는지 검사
        System.out.println(str.endsWith("c"));
        System.out.println(str.startsWith("a")); //a로 시작하는지 검사
        System.out.println(str.equalsIgnoreCase("ABC")); //대소문자 구분하지 않고 같은지
        System.out.println(str.indexOf("b")); //문자열의 위치를 인덱스 번호로 알려줌 없으면 -1 반환
        System.out.println(str.indexOf("bc")); //
        System.out.println(str.lastIndexOf("c")); //문자열의 오른쪽부터 찾음
        System.out.println("d:\\classJava\\Hello.java"); //d:\classJava\Hello.java로 나옴 역슬래쉬넣을라면 두번
        System.out.println("d:\\classJava\\Hello.java".lastIndexOf('.')); //몇번째 있는지  찾아줌 18번
        str = "d:\\classJava\\Hello.java";
        System.out.println(str.substring(str.lastIndexOf('.')+1)); //.뒤부터 단어를 잘라줌 java가 나옴
        System.out.println(str.substring(str.lastIndexOf('.')+1,20)); //substring은 매개변수로 (시작, 끝)을 받음 (끝자는 포함안됨)
        str = "abc";
        String str2 = "abc";
        System.out.println(str.intern()); //abc
        System.out.println(str.intern() == str2.intern()); //true
        System.out.println(str.length());
        System.out.println(str.replace("a","b")); //a를 b로 바꾸기 abc 그렇다고 String에 있는 내용을 바꾼건 아님 !
        System.out.println("aabbaacc".replace("aa","xx")); //xxbbxxcc
        System.out.println("aabbaacc".replaceAll("aa","xx")); //xxbbxxcc
        System.out.println("aabbaacc".replaceFirst("aa","xx")); //xxbbaacc
        System.out.println("thor,iron,hulk".split(",")[2]);
        System.out.println(Arrays.toString("Hello World".split(""))); //[H, e, l, l, o,  , W, o, r, l, d]
        System.out.println("   Hello     world   ".trim()); //Hello     world 양쪽 끝만 !
        System.out.println(true);
        System.out.println(String.valueOf(1)+String.valueOf(2));//String.value로 하면 문자열로 변환되어 12가 나옴
        System.out.println(Integer.parseInt("1")+Integer.parseInt("2"));




    }
}
