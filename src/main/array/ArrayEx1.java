package main.array;


import java.util.Arrays;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //배열에 접근하기 배열의 합 구하기. 변수 선언 접근 후 for문!

        //int[] arr = {100,88,100,100,90}; 아래는 이거랑 똑같음
        arr[0] = 100;
        arr[1] = 88;
        arr[2] = 100;
        arr[3] = 100;
        arr[4] = 90;

        System.out.println(Arrays.toString(arr)); //배열을 문자로 바꾸겠다. 는 말임


        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.printf("총범 : %3d%n", total);
        System.out.printf("평균: %5.2f", (float)total/arr.length);

    }
}
