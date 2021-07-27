package variable;

public class BooleanEx {
    boolean power = false;

    void turn() {
        boolean onOff;
        onOff = true;
        power = !power;
        System.out.println(power);
    }

    public static void main(String[] args){
        BooleanEx b =  new BooleanEx();
        b.turn();
        b.turn();
        b.turn();
        b.turn();

    }
}