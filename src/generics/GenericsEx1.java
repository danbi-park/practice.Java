package generics;

import java.util.ArrayList;

public class GenericsEx1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //collection의 모든 원소는 object
        //list.add(Object object) 매개변수의 타입이 Object
        list.add(new Tv()); //Tv => Object (자부)
//        list.get(0).power();  부모에서 자식이 메서드를 찾을 수 없다.
        Tv tv = (Tv)list.get(0); //Object = > Tv (자부자: 명시적 형변환 필요)
        tv.power();

//        ArrayList<Tv> tvList = new ArrayList<>(); //Tv를 매개변수라고 선언 generics 형변환 필요x
//        tvList.add(new Tv());
//        tvList.get(0).power();



        //위의 코드 다시 작성한 거임임
       ArrayList<Tv> tvList = new ArrayList<Tv>(); //원래 이렇게 넣었어야했는데 지금은 생략 가능 또는 <E>
        tvList.add(new Tv()); //위에서 <E>라고 선언하면  add(E e)를 사용할 수 있다.
        tvList.get(0).power();
//collection에 타입을 미리 지정한다. 이때는 E를 사용


    }
}

class Tv{
    void power(){
        System.out.println("power");
    }
}