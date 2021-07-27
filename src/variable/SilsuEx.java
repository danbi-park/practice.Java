package variable;

public class SilsuEx {

    public static void main(String[] args) {
        float f1 = 0.1f; //f를 꼭 붙여줘야함 4byte
        double d1 = 0.1d; // 8byte d는 생략가능함
        f1 = 100_000_000_000l; // 묵시적 형변환 가능 !
        long l1 = (long)f1;

        f1 = l1; //표현범위가 float이 더 크기 때문에 묵시적으로 형변환
        l1 = (long)f1; // 표현범위가 long이 더 작기때문에 명시적 변환을 해줘야함

        System.out.println(f1);
        System.out.println(d1);
        final float PI = 3.141592f;
        System.out.println(PI);
    }
}
