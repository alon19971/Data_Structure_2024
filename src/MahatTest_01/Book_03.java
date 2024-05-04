package MahatTest_01;

public class Book_03 implements Shippable {

    private String title;
    private String name; // The name of the book
    private String author; // The name of the author of the book
    private double price; // The price of the book
    private double weight;

    public Book_03(String title, double weight, double price) {
        this.title = title;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return "Book: " + title;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return this.price;
    }

}
