package main.object2;
class Outer { // 외부 클래스
    static class Inner { // (static) 내부 클래스 클래스
        int iv=200;
    }
}
class Ex07 {
    public static void main(String[] args) {
        Outer.Inner ii = new Outer.Inner();
        System.out.println(ii.iv);
    }
}
