package main.object2;

public class CarEx {
    public static void main(String[] args) {
        //인스턴스 생성
        Car car = new Car();
        System.out.println(car);
        FireCar fireCar = new FireCar();
        SportsCar sportsCar = new SportsCar();

        //상속 받았기 때문에 drive()가능!
        fireCar.drive();
        fireCar.stop();


        //Car의 속성이 맞는지 물어보는 것
        System.out.println(fireCar instanceof Car? "상속관계" : "관계없음");
        System.out.println(sportsCar instanceof Car? "상속관계" : "관계없음");
        System.out.println((new Car()) instanceof Car? "상속관계" : "관계없음");
      //System.out.println(sportsCar instanceof fireCar? "상속관계" : "관계없음");

        //Object는 다 ok 왜? 모든 클래스의 조상은 Object이기 때문에
        System.out.println(fireCar instanceof Object? "상속관계" : "관계없음");
        System.out.println(sportsCar instanceof Object? "상속관계" : "관계없음");
        System.out.println(car instanceof Object? "상속관계" : "관계없음");

        car = fireCar;
       // fireCar = (FireCar) sportsCar; //수직관계 형성 안됨(서로 관계가 없음)
        fireCar = (FireCar) car; //자식 -> 부모 -> 자식은 가능!

    }
}

class Engine{}

//Object가 생략되어 있음 모든 클래스의 조상은 Object임
class Car extends Object{
    int wheel;
    void drive(){};
    void stop(){};
    Engine engine;

    @Override
    public String toString() {
        return getClass().getName(); //주소값 대신 객체 클래스와 이름 출력
    }
}

class FireCar extends Car{
    void waterGun(){}
}

class SportsCar extends Car{
    int turbo;
}