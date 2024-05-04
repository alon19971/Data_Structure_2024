package MahatTest_01;

public class Shipping_03 {
    private String address; // The address for shipping
    Shippable[] items; // Items to be shipped (of interface - Shippable)

    public Shipping_03(String address, Shippable[] items) {
        this.address = address;
        this.items = items;
    }

    public double sum(){
        double sum = 0;
        for (Shippable item : items){
            sum += item.getPrice();
        }
        return sum;
    }
}

