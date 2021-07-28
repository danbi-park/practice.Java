package operator;

import static java.lang.Math.*;

public class Operater_Practic {
    public static void main(String[] args) {

        int numOfApples =123; //사과의 개수
        int sizeOfBucket = 10; //바구니의 크기
        int numOfBucket = (int)ceil(numOfApples/(float)sizeOfBucket);
        System.out.println(": "+numOfBucket);


        int num = 10;
        System.out.println(num>0?"양수" : num ==0? "0":"음수");

        int fahrenheit = 100;
        float celcius = (int)((5/9f * (fahrenheit - 32))*100 + 0.5) / 100f;
        System.out.println("Fahrenheit:" + fahrenheit);
        System.out.println("Celcius:" + celcius);

    }
}

