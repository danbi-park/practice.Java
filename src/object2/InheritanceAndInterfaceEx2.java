package object2;

public class InheritanceAndInterfaceEx2 {
    public static void main(String[] args) {
    Mammalia[] mammalias = new Mammalia[2];
    Bird[] birds = new Bird[2];

//참조형 형변환 (부모자식사이에서)
//자식이 부모한테 가는 것은 겹치는 부분에서 자식이 갖고있는걸 안쓰면 됨
//but부모가 자식할 때 갈 땐 자식에 남아 있는 부분을 초기화 할 수 없음.

   //자식이 부모한테 간 경우
    mammalias[0] = (Mammalia) new Tiger(); //묵시적 형변환 가능
    mammalias[1] = new Bat();

    birds[0] = new Eagle();
    birds[1] = new Ostrich();

    Iground[] igrounds = new Iground[2];
    Ifly[] iflies = new Ifly[2];
    igrounds[0] = new Tiger();
    igrounds[1] = new Ostrich();
        for (int i = 0; i < iflies.length; i++) {
            igrounds[i].run();
        }


    }
}

class Mammalia {}
class Bird {}
class Tiger extends Mammalia implements Iground{
    @Override
    public void run() {
        System.out.println("으르렁 으르렁");
    }
}
class Bat extends Mammalia implements Ifly{
    @Override
    public void fly() {
        System.out.println("박쥥");
    }
}

class Eagle extends  Bird implements Ifly{
    @Override
    public void fly() {
        System.out.println("독수리이");
    }
}

class Ostrich extends  Bird implements Iground{
    @Override
    public void run() {
        System.out.println("타조조");
    }
}

interface Ifly{
    public abstract void fly();
}
interface Iground{
    void run();
}