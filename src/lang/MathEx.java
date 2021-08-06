package lang;

public class MathEx {
    public static void main(String[] args) {
        int[] arr = {78,89,72,91,64,100};

        int max = arr[0];
        int min = arr[0];
    //Math.max Math.min -> 두 값을 비교해 큰 쪽을 반환 한다.
        //78, 89 한 번 72, 91 한 번 씩 비교함
        for (int i = 0; i < arr.length; i+=2) {
            max = Math.max(arr[i], arr[i+1]); //바로 옆에 값과 비교하는 것임
            max = Math.min(arr[i], arr[i+1]);
        }
        System.out.println("최대값: " + max);
        System.out.println("최소소값: " + min);

//가장 가까운 정수값을 반환 1.5,2.5등 가운데 있는 값은 짝수를 반환
        System.out.println(Math.rint(0.6));
        System.out.println(Math.rint(0.1));
        System.out.println(Math.rint(1.5));
        System.out.println(Math.rint(-1.6));
        System.out.println(Math.rint(-1.1));
    }
}
