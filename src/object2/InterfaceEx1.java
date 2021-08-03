package object2;

public class InterfaceEx1 {
    public static void main(String[] args) {    //메인메서드 안에 들어와야함
        Fightable fightable = new FireBat(); //class -> interface로 묵시적 형변환
        fightable.attack();
//      System.out.println(fightable.name); //변수에 접근이 불가능

        Fightable fightable1 = new Fightable() {
            @Override
            public void attack() { }
        };

    //  명시적 형변환(인터페이스->클래스)이지만 안됨 : 부자관계이기 때문
    //  FireBat fireBat = (FireBat) fightable1;

        //자부자 관계 형변환 됨
        FireBat fireBat = (FireBat) fightable; //명시적 형변환(interface->class)

        fireBat.attack();
        FireBat fb =  new FireBat();
        //System.out.println(fireBat.name);  //변수에 접근이 가능

        //상속이 되면 부모가 갖는 변수와 메서드를 가져올 수 있지만
        //인터페이스는 자신이 공유하고 있는 메서드만 쓸 수 있다.
        //name을 쓰고 싶으면  attack() 안에서 해서 쓸 수 있음


        Fightable fightable2 = new Dragoon();
    }

}

interface Fightable{
    void attack();
}

class FireBat extends Terran implements Fightable{
    String name = "FireBat";
    @Override
    public void attack() {
        System.out.println("name:"+name+"hp: " + hp + "/ 위치: " + x + "," + y); //Terran Unit에 hp가 있었음
    }
}


//부모와 자식관계가 아니면 상속관계가 아님 Dragoon Protoss는 상속 x
class Dragoon extends Protoss implements Fightable{
    @Override
    public void attack() {

    }
}