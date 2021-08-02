package object1;

public class PrimitiveTypeArgs {
    public static void main(String[] args) {
        Data d = new Data();
        System.out.println(d.x); //0
        d.x = 10;   //값을 그냥 넘김
        System.out.println(d.x); //10
        //1번 메서드 호출
        change(d.x); //일반값 넘김  //1000
        System.out.println(d.x);   //10

        //2번 메서드 호출
        change(d); // 주소값 넘김    //1000
        System.out.println(d.x);   //1000

        //3번 메서드 호출
        Data d2 = copy(d);
        System.out.printf("d2.x: ",d2.x);
        System.out.println(d2);
    }
    //PrimitiveTypeArgs안에 선언된 change메서드
    static void change(int x) { //1번 일반 값을 넘김
        x = 1000;
        System.out.printf("change(): %d %n", x);
    }

    static void change(Data d) { //2번 주소값을 넘김
        d.x = 1000; System.out.printf("change() : %d %n", d.x);
    }


    // data타입의 copy 메서드
    static Data copy(Data d) {  //3번
        Data tmp = new Data();
        tmp.x = d.x; //둘의 데이터 주소값이 같은가?
        System.out.println("d의 주소값"+d);
        System.out.println("tmp의 주소값"+tmp);
        return tmp;
    }
}
class Data{ int x; }