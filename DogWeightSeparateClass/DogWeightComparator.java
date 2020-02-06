class DogWeightComparator implements java.util.Comparator<Dog> {
    @Override
    public int compare(Dog d1, Dog d2) {
        return Double.compare(d1.getWeight(), d2.getWeight());
    }
}