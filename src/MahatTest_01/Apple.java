package MahatTest_01;

public class Apple {
    private int weight;

    public Apple(int w) {
        weight = w;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Apple other) {
        return ((other != null &&
                weight == ((Apple) other).weight));
    }
}
