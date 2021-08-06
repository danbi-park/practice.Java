package lang;

public class StringBufferEx {
    public static void main(String[] args) {
        //자체적으로 안에 배열이 있는데 +1만큼 더 많은 길이값을 가짐 거기서 작업을 함
        StringBuffer sb = new StringBuffer("ab");


        System.out.println(sb); //ab
        System.out.println(sb.hashCode()); //460141958
        System.out.println(System.identityHashCode(sb)); //460141958

        sb.append("c");
        System.out.println(sb); //abc
        System.out.println(sb.hashCode()); //460141958
        System.out.println(System.identityHashCode(sb)); //460141958

        StringBuffer sb2 = new StringBuffer(10);
        StringBuffer sb3 = new StringBuffer();
        sb3.append("h");
        sb3.append("e");
        sb3.append("l");
        sb3.append(true);
        //append하게되면 여러가지 열을 String에 추가할 수 있다.
        System.out.println(sb3); //hellotrue
        System.out.println(sb3.length()); //9
        System.out.println(sb3.capacity()); //16
        sb3.append("world premier League"); //여기서 append로 또 용량을 추가하면
        System.out.println(sb3.capacity()); //34로 더 많아짐
        System.out.println(sb3); //hellotrueworld premier League

        //0부터 4까지 삭제!(4는 포함안됨) 지우면서 바로 출력 됨!
        System.out.println(sb3.delete(0,4));     //otrueworld premier League

        System.out.println(sb3.deleteCharAt(0));//trueworld premier League
        System.out.println(sb3.deleteCharAt(0));//rueworld premier League
        System.out.println(sb3.deleteCharAt(0));//ueworld premier League

        System.out.println(sb3.insert(6,"star ")); //문자열 집어넣기

        System.out.println(sb3.reverse()); //거꾸로 출력

        //참고로 buffer은 String이 그냥 그대로 적용이 됨 다ㅡㄹㄴ데선 string은 변하지 않음
        System.out.println(sb3); //eugaeL reimerp rats dlroweu

        //덮어쓰기 char기 때문에 한 글자만 바꿀 수 있음 void로 작성해야 함 바로 안됨
        sb3.setCharAt(sb3.length()-1,'W');
        System.out.println(sb3); //eugaeL reimerp rats dlroweW

        System.out.println(sb3.reverse()); //다시 거꾸로 출력
        sb3.setLength(5); //잘라내기
        System.out.println(sb3); //World




    }
}
