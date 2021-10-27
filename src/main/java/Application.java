public class Application {
    public static void main(String[] args) {

        Integer[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Swapper<Integer> integerSwapper = new Swapper<>();
        integerSwapper.swapElementsArray(array, 3, 7);

        for(Integer i: array) {
            System.out.print(i +" ");
        }
        System.out.println();

        String[] cats = {"Cat1","Cat2", "Cat3", "Cat4", "Cat5"};
        Swapper<String> stringSwapper = new Swapper<>();
        stringSwapper.swapElementsArray(cats, 0, 4);

        for(String s: cats) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
