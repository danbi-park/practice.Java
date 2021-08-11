package main.object1;

public class Ex01 {
    public static void main(String[] args) {
    Student s = new Student("홍길동",1,1,100,60,76);
    String str = s.info();
    System.out.println(str);
    }
}

class Student{
    private String name;
    private int ban, no, kor, eng, math;

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String info(){
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," +
                + getTotal() + "," + getAverage();
    }
    public int getTotal() {return kor+eng+math;}
    public float getAverage() {return (int)Math.round(getTotal()/3f * 10f) /10f;}
}
