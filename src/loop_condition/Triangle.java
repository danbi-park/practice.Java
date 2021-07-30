package loop_condition;

public class Triangle {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {System.out.printf("*");}
            System.out.println();
        }
        System.out.println("===========");
        int row = 4, col=7;
        for(int i=0;i<row;i++){
            for(int j=0;j<(int)Math.round(col/2f)-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
