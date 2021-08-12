package main.object2;

public class InheritanceAndInterfaceEx {
    public static void main(String[] args) {

    }
}

//같은 패키지내에서 상속가능
class SiegeTank extends Terran{

}
//implemet interface쓸 떄
class BattleCruiser extends Terran implements Flyable, Groudable{

    //다중상속에서 발생하는 문제점을 보완해줌 interface를 이용해 override를 함
    //abstract 완성되지 않은 매서드이기 때문에 클래스 내에서 따로 또 override해줌
    @Override
    public void fly() {

    }

}

//class로 하면 SiegeTank에 다중상속이 되지 않기 때문에 interface로 바꿔줌
interface Flyable{
    static int ENGINE =4; //full -> public static final int ENGINE = 4;
    void fly(); //full -> public abstract void fly();
}

interface Groudable{

}