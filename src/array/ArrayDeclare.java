package array;

public class ArrayDeclare {
    public static void main(String[] args) {
        int[] arr; //선언만 되있음  --> 초기화 x
        arr = new int[]{1,2,3,4,5};
        prArr(arr);

        int[] arr2 = new int[]{1,2,3,4,5};
        prArr(arr2);

        int[] arr3 = {1,2,3,4,5};            //이렇게도 선언 가능!
        prArr(arr3);

        int[] arr4 = new int[5]; //int type의 배열이면서 크기가 5인 배열을 호출 -> 기본값 0
        arr4[0] = 1;
        arr4[1] = 1;
        arr4[2] = 1;
        arr4[3] = 1;
        arr4[4] = 1; // 11111를 호출한다.
        prArr(arr4);

        char[] charArr = {'H','e','l','l','o'}; //한꺼번에 넣기 !
        char[] chars = new char[5]; //이렇게도 값 넣기 가능
        chars[0] = 'H';
        chars[1] = 'e';
        chars[2] = 'l';
        chars[3] = 'l';
        chars[4] = 'o';


        //참조형도 배열 가능!
        String[] avengers = {"Thor","IronMan","Captain","BlackWidow","Hulk"};
        String[] strArr = new String[5];
        prArr(avengers);

    }


    private static void prArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(i!=0) System.out.print(",");
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    private static void prArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
