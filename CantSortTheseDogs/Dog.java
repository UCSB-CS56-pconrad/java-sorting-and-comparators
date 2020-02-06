public class Dog {

    private String name;
    private double weight;

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public Dog(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return "[" + name + "," + weight + "]";
    }
}
