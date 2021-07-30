package object1;

public class Constructor {
    public static void main(String[] args) {
        String[] cardType = {"SPADE", "CLOVER", "DIAMOND", "HEARD"};
        Card[] cards = new Card[52];
        for (int i = 0; i < cards.length; i++) {
            cards[i] = new Card(i%13+1,cardType[i/13]);
//      cards[i].setNumber(i%13);
//      cards[i].setKind(cardType[i/13]);
            System.out.println(cards[i]);
        }
    }
}

class Card{
    private int number;
    private String kind;
    static int width=100;

    static int height=150;
    //  public Card(){}
    public Card(int number, String kind){
        this.number = number;
        this.kind = kind;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if(number>0 && number<14) {
            this.number = number;
        } else {
            System.out.println("숫자의 범위를 넘어섭니다");
        }
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return number+"/"+kind;
    }
}
