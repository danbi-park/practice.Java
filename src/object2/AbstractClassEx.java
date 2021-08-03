package object2;

public class AbstractClassEx {
    public static void main(String[] args) {
        //추상클래스는 인스턴스를 만들지 못한다.
        Units units = new Units(){
            //익명객체
            @Override
            void move(int x, int y) {
                System.out.println(x+","+y+"로 이동했습니다.");
            }
        };
        Zerg zerg = new Zerg();
    }
}

abstract class Units{
    int x,y;
    abstract void move(int x, int y);
    void stop(){}
}
class Zerg extends Units{
    @Override
    void move(int x, int y) {

    }
}