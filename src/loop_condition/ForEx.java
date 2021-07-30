package loop_condition;

public class ForEx {
    public static void main(String[] args) {
        int total = 0;  //왜 초기화를 해줘야할까? new는 자동으로 default값으로 초기화 되지만
        //여기서 멤버 변수와 기능 빼고 하려면 바로 초기화 해줘야함
        for (int i = 0; i <= 10; i++) {
            total += i;

        }
        System.out.println(total);

        //거꾸로(10 9 8 7) 출력
        for (int i = 10; i > 0 ; i--) {
            for (long j = 0; j < 4000000000L ; j++) {

            }
            System.out.println(i);

        }
    }
}
