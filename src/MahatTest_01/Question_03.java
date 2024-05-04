package MahatTest_01;

public class Question_03 {

    public static void main(String[] args) {

        Shippable[] items = new Shippable[]{
                new Dress_03("Evening Dress", 1.2, 7.5),
                new Shirt_03("Casual Shirt", 0.5, 5.5),
                new Book_03("Effective Java", 1.5, 2.5)
        };

        Shipping_03 shipping = new Shipping_03("1234 Park Ave, Ariel", items);

        System.out.println(shipping.sum());

    }

}
