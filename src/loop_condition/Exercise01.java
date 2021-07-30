package loop_condition;

public class Exercise01 {
    public static void main(String[] args) {
        int x = 15;
        System.out.println(x > 10 && x < 20);

        char ch = 'A';
        System.out.println(ch!= ' ' || ch != '\t');
        System.out.println(!(ch!= ' ' && ch != '\t'));

        System.out.println(ch >= '0' && ch <= '9');

        System.out.println(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z');

        int year = 44;
        System.out.println(year%400 == 0 || year%4 ==0 && year%100 != 0);


    }
}
