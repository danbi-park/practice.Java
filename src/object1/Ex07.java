package object1;

public class Ex07 {
    public static void main(String[] args) {
    Marine marine = new Marine();
    System.out.println(marine.weapon);

    Marine marine2 = new Marine();
    System.out.println(marine2.weapon);

    marine.weaponUp();

    System.out.println(marine.weapon);
    System.out.println(marine2.weapon);
    }
}

class Marine{
    int x =0, y = 0; //Marine의 위치좌표(x,y)
    int hp = 60;
    static int weapon = 6;
    static int armor = 0;

    void weaponUp(){
        //클래스 멤버(static 붙어 있는 멤버변수,메서드)에는 this 사용 안됨!
        this.weapon++;
    }

    void armorUp(){
        //this.armor++; static 메서드에서는 this사용 안됨
        armor++;
    }
    void move(int x, int y){
        this.x = x; //this.x, x는 인스턴스 변수는 지역변수
        this.y = y;//this.y, y는 인스턴스 변수는 지역변수
    }
}