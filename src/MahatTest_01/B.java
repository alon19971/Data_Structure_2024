package MahatTest_01;

public class B extends A {
    // Can access 'value' directly
    public B() {
        super(); // Implicit call to A's constructor
        System.out.println("Constructor B");
    }
}
