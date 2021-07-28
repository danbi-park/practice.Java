package variable;

public class Practice {
    public static void main(String[] args) {
        System.out.println("1"+"2");
        System.out.println(true + "");
        System.out.println('A'+'B');
        System.out.println('1'+ 2 );
        System.out.println('1'+'2');
        System.out.println('J' +"ava");
        System.out.println(true + "" + null); //오류해결!

        int x = 1;  //2
        int y = 2;  //3
        int z = 3;  //1

        //원래 값을 보존하면서 값을 바꾸기 위해 temp를 변수로 선언
        int tmp = x;  //지역변수기 때문에 바로 초기화해줌
        x = y;
        y = z;
        z = tmp;

        System.out.println("X = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}