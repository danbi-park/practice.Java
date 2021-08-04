package object2;

public class Ex01 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        deck.deckList();
        deck.shuffle();
        deck.deckList();

    }
}

class SutdaDeck{
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
    class SutdaCard{
        int num;
        boolean isKwang;
        public SutdaCard(){
            this(1, true);}

        SutdaCard(int num, boolean isKwang){
            this.num = num;
            this.isKwang = isKwang;
        }

        public String toString(){
            return num + (isKwang ? "K" : "");
        }
    }

    SutdaDeck(){
        for (int i = 0; i < cards.length; i++) {
            cards[i] = new SutdaCard(i%10 + 1, i<10&&(i+1==1||i+1==3||i+1==8)?true:false);


        }
    }
    public void deckList(){
        for (int i = 0; i < cards.length; i++) {
            if (i!=0) System.out.print(",");
            System.out.print(cards[i]);
            if((i+1)%10==0) System.out.println();
        }
    }


    void shuffle(){
        for (int i = 0; i < cards.length; i++) {
            int rand = (int) (Math.random() * cards.length);
            SutdaCard tmp = pick(i);
            cards[i] = cards[rand]; //하나를 임의로 받음
            cards[rand] = tmp;
        }
    }

    public SutdaCard pick(int index){
        return cards[index];
    }

    public SutdaCard pick(){

        SutdaCard tmp = new SutdaCard();
        int rand = (int) (Math.random() * cards.length);
        return cards[rand];
    }

}

