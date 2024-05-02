package MahatTest_01;

public class Tablet_01 {
    String name;    // The name of the manufacturer
    String kind;    // Model of the tablet
    char system;    // Character type of 'operating system'
    //                 'W' - Windows, 'A' - Android, 'I' - 'ios'
    double size;    // Size of the tablet
    double price;   // Price of the tablet


    public Tablet_01(String name, String kind, char system, double size, double price) {
        this.name = name;
        this.kind = kind;
        this.system = system;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public char getSystem() {
        return system;
    }

    public void setSystem(char system) {
        this.system = system;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tablet: {" +
                "name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ",Operation system=" + system +
                ", size=" + size +
                ", price=" + price + "$" +
                '}';
    }


    // Checks if the triggered object is equal to the other object
    public boolean isSame(Tablet_01 other) {
        return Tablet_01.this.getName().equals(other.getName()) &&
                Tablet_01.this.getKind().equals(other.getKind()) &&
                Tablet_01.this.getSize() == other.getSize();
    }



}
