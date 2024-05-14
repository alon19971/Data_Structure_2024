package MahatTest_01;

public class Question_06 {
    public static void main(String[] args) {


        System.out.println("**********");
        Apple a1 = new Apple(10);
        Apple a2 = new Apple(10);
        Banana b1 = new Banana(10);
        Object b2 = new Banana(10);

//        System.out.println(a1.weight());                  // Compilation Error
//        System.out.println(((Banana)a2).getWeight());     // ClassCastException
//        System.out.println(a1.equals(a2));                // True
//        System.out.println(a2.equals(a1));                // True
//        System.out.println(b1.equals(b2));                // True
//        System.out.println(b2.equals(b1));                // True
//        System.out.println(a1.equals((Banana)b2));        // ClassCastException
//        System.out.println(a1.equals(a2));                // True
//        System.out.println(b1.equals((Apple)a2));         // Compilation Error
//        System.out.println(b1.equals((Banana)a2));        // ClassCastException


    }



}
