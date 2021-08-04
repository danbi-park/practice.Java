package object2;
class Outer1 {
    int value=10; // Outer.this.value
    class Inner { // (instance inner class) 인스턴스 클래스
        int value=20; // this.value
        void method1() {
            int value=30; // value
            System.out.println( value);
            System.out.println( this.value);
            System.out.println(Outer1.this.value);
            //외부클래스의 인슨턴스변수는 내부클래스에서
            //'외부클래스이름.this.변수이름'으로 접근
        }
    } // Inner클래스의 끝
} // Outer클래스의 끝
class Ex08 {
    public static void main(String args[]) {
        Outer1 outer = new Outer1();
        Outer1.Inner inner = outer.new Inner();
        inner.method1();
    }
}
