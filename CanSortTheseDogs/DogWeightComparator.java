public class DogWeightComparator implements java.util.Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
	return Double.compare(o1.getWeight(),o2.getWeight());
    }
}
