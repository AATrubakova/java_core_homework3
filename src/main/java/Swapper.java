public class Swapper<T> {
    public void swapElementsArray(T[] array, int first, int second) {
        T temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
