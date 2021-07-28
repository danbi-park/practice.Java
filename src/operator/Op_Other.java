package operator;

public class Op_Other {
    public static void main(String[] args) {
        int x =4;
        System.out.println(x>>2);
        System.out.println(x<<1);
        System.out.println(x&2);
        System.out.println(x^2); //다르면 1 같으면 0
        System.out.println(~x); //not x
        System.out.println(x|2);
        System.out.println(x *= 10 + 5); // x = x * (10 + 5)
    }
}
