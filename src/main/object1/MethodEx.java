package main.object1;

public class MethodEx {
    public static void main(String[] args) {
    MyMath mm = new MyMath();
    mm.add(10, 20);

    }
}

class MyMath {
    public long add(int i, int i1) {
        long result;
        result = (long)i + i1;
        return result;
    }
    //method는 return타입이 있어야함 클래스도 return타입임 ! return타입은 무한으로 볼 수 있음(변수같ㅇ)
    // void빼곤 다 return 값을 가져야 함
    //메서드 명이 다르면 아무 문제가 없음
    //메서드 명이 같을 때 매개변수 명이 다르면 아무문제 없음
    void add(){
        System.out.println();
    }
    boolean add(boolean arg){return true;}
    char add(char arg){return ' ';}
    byte add(byte arg){return 0;}
    short add(short arg){return 0;}
    int add(int arg){return 0;}
    long add(long arg){return 0L;}
    float add(float arg){return 0.0f;}
    double add(double arg){return 0.0;}
    int[] add(int[] arg){return new int[]{0};}
    String add(String arg){return "";}
    Car add(Car arg){return new Car();}
    Car[] add(Car[] arg){return new Car[]{new Car()};}
    //void substract(){}

    int substract(){return 0;}

    //리턴타입 메서드명(){ 리턴이 넘어와야 함  }
}

class Car{}