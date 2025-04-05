package example.strategy;

public class Clothing {
    private String name;
    private String type; // top, bottom, outer 등
    private int price;

    public Clothing(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " [" + type + "] - " + price + "원";
    }
}
