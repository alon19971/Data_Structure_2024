package MahatTest_01;

public class Clothes_03 implements Shippable {
    private String description;
    private double weight;
    private double price;

    public Clothes_03(String description, double weight, double price) {
        this.description = description;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public double getPrice(){
        return this.price;
    }


}

