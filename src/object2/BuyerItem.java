package object2;

import java.util.ArrayList;
import java.util.Arrays;

public class BuyerItem {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Tv tv = new Tv();
        Computer com = new Computer();
        Audio audio = new Audio();
        b.buy((Item)tv);
        b.buy((Item)com);
        b.buy((Item)audio);
        System.out.println("잔액: "+b.money);
        b.getArr();
        b.getList();
    }
}

class Buyer {
    int ea;
    int money = 1000;
    void buy(Item item){
        money -= item.price;
        items[ea++] = item;
        list.add(item);
    }
    Item[] items = new Item[20];
    ArrayList<Item> list = new ArrayList<>();
    void getArr(){
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                if(i!=0) System.out.print(",");
                System.out.print(items[i]);
            }
        }
        System.out.println();
    }
    void getList(){
        System.out.println(list.toString());
    }
}

class Item {
    int price;
    String model;
    public Item(int price, String model) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return model;
    }
}
class Tv extends Item {
    public Tv() {
        super(150,"Tv");
    }
}

class Computer extends Item {
    public Computer() {
        super(200,"Computer");
    }
}

class Audio extends Item {
    public Audio() {
        super(100,"Audio");
    }
}