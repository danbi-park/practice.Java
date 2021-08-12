package lambda;

public class LambdaEx1 {
    public static void main(String[] args) {
//        MyFunction f = new MyFunction() {
//            @Override
//            public int max(int i, int j) {
//                return i>j?i:j;
//            }
//        };
        MyFunction f = (int i, int j) -> i>j?i:j;
        int big = f.max(1,2);
        System.out.println(big);
    }
}


interface MyFunction {
    public int max(int i, int j);
}