package generics;

public class EnumEx {
    public static void main(String[] args) {
        Directions d1 = Directions.EAST; //enum의 요소는 static 상수처럼 적용됨.
        d1 = Directions.valueOf("EAST");
        d1 = Enum.valueOf(Directions.class, "EAST");

        System.out.println(d1.name()+ "/" + d1.ordinal());

        Directions[] dArr = Directions.values();
        for (Directions d : dArr) {
            System.out.printf("%s = %d %n", d.name(), d.ordinal());
        }
    }
}

class Direction{
    int east = 1;
    int west = 2;
    int south = 3;
    int north = 4;

}

//class가 아니라 enum 임!
enum Directions{ //상수를 여러번 선언함으써 자동으로 순서가 알아서 들어감(static)
    EAST, SOUTH, WEST, NORTH
}