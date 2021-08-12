package main.lang;

public class ObjectEqualsEx {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if(v1.equals(v2)){
            System.out.println("같습니다");
        } else{
            System.out.println("다릅니다.");
        }

    }
}

class Value{
    int value;


    public Value(int value){
        this.value = value;

    }

//주소값은 다르지만 안에 값을 바꿔줘서 같게 만듦
    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if(obj instanceof  Value){
            Value value = (Value) obj; //obj를 value로 바꿔줘서 자부자 !
            if(value.value == this.value) {
                return true;
            }
        }
        return result;
    }
}