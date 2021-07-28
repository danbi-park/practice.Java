package operator;

public class MyMath {
    public static void digitRound(double d, int digit) {
        double tmp = d * Math.pow(10, digit);
        tmp = Math.round(tmp) / Math.pow(10, digit);

        System.out.println(String.format("%f",tmp));
        System.out.printf("최종 출력값: %f %n", tmp);
        System.out.println("최종 출력값: " + tmp);
    }
}
