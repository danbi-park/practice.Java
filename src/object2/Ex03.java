package object2;

public class Ex03 {
    public static void main(String[] args) {
        Tvs t = new Tvs();
    }
}
class Product {
    private int price; // 제품의 가격
    private int bonusPoint; // 제품구매 시 제공하는 보너스점수
    Product() {}
    Product(int price) {
        this.price = price;
        bonusPoint =(int)(price/10.0);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }
}
class Tvs extends Product {
    Tvs() {}
    public String toString() {
        return "Tv";
    }
}