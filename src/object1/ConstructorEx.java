package object1;

public class ConstructorEx {
    public static void main(String[] args) {
        Bike autoBike = new Bike("black","auto");
        Bike threeBike = new Bike();
        threeBike.setColor("black");
        threeBike.setGearType("manual");
    }
}

class Bike {
    private String color;
    private String gearType;

    public Bike() {
        this("red","auto");
    }

    public Bike(String color, String gearType) {
        this.color = color;
        this.gearType = gearType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }
}