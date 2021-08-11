package main.variable;

public class JungsuEx {
    byte b1;
    short s1;
    int i1;
    long l1;

    public JungsuEx() {
    }

    public static void main(String[] args) {
        JungsuEx j = new JungsuEx(); //생성연산자를 만나면 클래스이름에
        //소괄호가 붙으면 생성자!

        byte b2 =(byte) 130;
        System.out.println(j.b1);
        System.out.println(j.s1);
        System.out.println(j.i1);
        System.out.println(j.l1);
        System.out.println(b2);
        System.out.println(j.b1+ b2);
        System.out.println(j.s1+ b2);
        j.i1 = 130 + j.s1;
        j.s1 = (short)j.i1; //작은데서 큰데로(명시적 형변환)
        j.i1 = (int) j.s1; //큰데서 작은데로(묵시적 형변환 => 생략가능)
        System.out.println(j.i1);
        j.l1 = 100_000_000_000l; //인트가 long으로 된 것
        System.out.println(j.l1);

    }
}
