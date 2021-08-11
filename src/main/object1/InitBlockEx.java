package main.object1;

public class InitBlockEx {
    public static void main(String[] args) {
        //instance를 만들지 않아도 호출 가능! 왜? static 붙어서
        System.out.println(Bicycle.wheel);
        //instance생성 및 초기화 이후 호출
        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.gear);

    }
}

class Bicycle {
    //이름없는 클래스 static -> 내부클래스
    static{
        System.out.println("static Constructor"); //클래스 초기화 블록
    }
    {
        System.out.println("instance Constructor"); //인스턴스 초기화 블록
    }

    String model;
    int gear;
    static int wheel;
    public Bicycle(){
        System.out.println("생성자");
    }

}
