package MahatTest_01;

public class Banana {
    private int weight;

    public Banana(int w) {
        weight = w;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Object other) {
        return (other instanceof Banana &&
                weight == ((Banana) other).weight);
    }




}

