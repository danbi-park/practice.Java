package main.array;

public class ArrayUtil {

    public static void pr2Arr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {  //행의 개수(줄의개수)
            for (int j = 0; j < arr[i].length; j++) { //행[i]의 길이값(배열개수)
                if(j!=0) System.out.print(",");
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    //매개변수가 다르면 같은 이름의 매서드를 쓸 수 있음 => 오버로드
    public static void prArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(i!=0) System.out.print(",");
            System.out.print(arr[i]);
        }
        System.out.println();
    }


    public static void prArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
