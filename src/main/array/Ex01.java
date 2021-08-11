package main.array;

public class Ex01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,}; //가능
        int arr2[][] = new int[3][];
        int arr3[] = new int[]{};


        System.out.println(arr.length);
        String str = "";
        System.out.println(str.length());
        char[] chars = new char[]{}; // length값이 제로인 배열도 선언가능 하다.

        int[][] arr4 = {
                {5, 5, 5, 5, 5},
                {10, 10, 10},
                {20, 20, 20, 20},
                {30, 30}
        };
        ArrayUtil.pr2Arr(arr4);
    }
}
