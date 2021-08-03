package object2;

public class StarCraftEx {
    public static void main(String[] args) {

    }
}


//속성을 가짐
class Unit {
    int x,y; //좌표
    int hp; //피
    void move() { };
    void stop() { };

}

//unit의 모든 것을 상속 받음
class Terran extends Unit{
    String tribe = "Terran";

}


class Marine extends Terran {
    static int attLv;
    static int defLv;
    void attack(){

    }
}

class Protoss extends Unit{
    String tribe = "Protoss";
}

class Zealot extends Protoss{
    static int attLv;
    static int defLv;
    void attack(){

    }
}
