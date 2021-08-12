package main.object2;

public class MemberEx {
    public static void main(String[] args) {
        Member m = new Member();
        //m.age = -10;
        m.setAge(-10);
        System.out.println(m.getAge());
        m.setNo(-1);
        System.out.println(m.getNo());
    }
}

class Member{
    private int no;
    private String name,id,pw,mobile;
    private int age;

    public void setAge(int age){ //setter!
        if(age > 0) this.age = age;
        else System.out.println("나이가 맞지 않습니다.");
    }

    public int getAge(){  //getter
        return age;
    }

    public void setNo(int ss) {   //setter!
        if (no > 0) this.no = ss;
        else System.out.println("0이상의 숫자를 입력하세요");
    }

    public int getNo() {   //getter
        return no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
