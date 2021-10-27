import java.util.ArrayList;
import java.util.Objects;

public class Box<T extends Fruit>{
    private ArrayList<T> fruits = new ArrayList<>();

    public Box() {
    }

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public void addFruits(ArrayList<T> newFruits) {
        if (newFruits != null) {
            fruits.addAll(newFruits);
        }
    }

    public Float getWeight() {
        Float boxWeight = 0.0f;
        if (this.fruits.isEmpty()) {
            return boxWeight;
        } else {
            // получить вес фрукта и всей коробки
            boxWeight = fruits.size() * fruits.get(0).getWeight();
        }
        return boxWeight;
    }

    public boolean compare(Box<? extends Fruit> nextBox) {
        return (this.getWeight().equals(nextBox.getWeight()));
    }

    public void putIntoTheBox(Box<T> box) {
        if (this.fruits != null) {
            box.addFruits(this.fruits);
            this.fruits.clear();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return fruits.equals(box.fruits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fruits);
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + fruits +
                '}';
    }
}
