package MahatTest_01;

public class C extends B {
    public C() {
        super(); // Implicit call to B's constructor (which will call to A's constructor)
        System.out.println("Constructor C");
    }

    public void displayValue(){
        // Accessing 'value' which is inherited from A through B
        System.out.println(value);
    }
}
