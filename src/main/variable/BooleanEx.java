package main.variable;

public class BooleanEx {
   boolean power;
   void turn() {
       if (power) {
           power = false;
       } else {
           power = true;
       }
       System.out.println(this + "전원이" + power + " 되었습니다.");
   }
    public static void main(String[] args) {
        BooleanEx b = new BooleanEx();
        b.turn();

        BooleanEx b1 = new BooleanEx();
        b1.turn();
        Tv tv = new Tv();
        tv.turn();
    }
}

class Tv{
    String model;
    String maker;

    int channel;
    boolean power;
    int volume;

    void turn(){
        power = power?false:true;
    }
    void chanUp(){

    }
    void chanDown(){

    }
    void volUp(){

    }
    void volDown(){

    }
}