package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx2 {
    public static void main(String[] args) {
        Stack s = new Stack();
        Queue q = new LinkedList();

        s.push(0);
        s.push(1);
        s.push(2);

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("Stack");
        while (!s.isEmpty()) {  //pop요소 끄집어 내기
            System.out.println(s.pop()); //맨 마지막을 지우고 출력 pop은 꺼내면 지워짐 !
            //System.out.println(s.peek()); //맨 마지막(2) 을 지우지 않고 출력
        }
        System.out.println("Stack:" + s);

        System.out.println("Queue");
        while (!q.isEmpty()) {
            //System.out.println(q.poll()); //객체를 추출해서 반환 맨 앞을 출력 후 지움
            System.out.println(q.peek()); //맨 앞을 출력하고 지움
        }
        System.out.println("Queue :" + q);
    }
}
