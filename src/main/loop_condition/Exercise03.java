package main.loop_condition;

public class Exercise03 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;i++) {
            for(int j=1;j<=i;j++) {
                sum+=j;
                //System.out.printf("%d",j); // 잘 더해지고 있는지 볼 수 있다
            }
            System.out.println();
        }
        System.out.println("sum="+sum);
    }
}