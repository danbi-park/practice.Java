package main.lang;

public class ObjectHashCodeEx {
    public static void main(String[] args) {
        //instance의 주소값이 다르게 나옴 왜  아래 new를 만났기 때문에
        //new를 통해서 instance의 주소값을 가짐
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1 == str2); //false가 나옴

        //같지 않다고 나옴 인스턴스가 만들어져서/ new는 클래스의 인스턴스를 만들어 인스턴스로 존재하는거임
        System.out.println(System.identityHashCode(str1)); //460141958
        System.out.println(System.identityHashCode(str2)); //1163157884

        //constant Pool에 등록된 문자열의 주소값을 참조하기 때문에 같게 나옴
        System.out.println(str1.hashCode()); //96354
        System.out.println(str2.hashCode());  //96354


        //new없이하면 constant Pool에 등록된 문자열의 주소값을 참조하기 때문에 같게 나옴
        String str3 = "abc";
        String str4 = "abc";
        System.out.println(str3 == str4); //true가 나옴
        System.out.println(str1.equals(str4));//equals는 constant pool에 등록

        System.out.println(System.identityHashCode(str3)); //1956725890
        System.out.println(System.identityHashCode(str4)); //1956725890

        str3 = "abcd";
        System.out.println(str3); //그냥 안에 문자열이 찍힘 //abcd
        System.out.println(str3.hashCode()); //2987074
        System.out.println(System.identityHashCode(str3)); //356573597
        //abcd를 넣는 순간에 constant pool에서 변형이 됨 인스턴스가 바뀌면 주소값도 바뀜!

    }
}
