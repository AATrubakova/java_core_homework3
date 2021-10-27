import java.util.ArrayList;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        System.out.println("Task1:");
        Integer[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Swapper<Integer> integerSwapper = new Swapper<>();
        integerSwapper.swapElementsArray(array, 2, 8);

        for(Integer i: array) {
            System.out.print(i +" ");
        }
        System.out.println(" ");

        String[] cats = {"Cat1","Cat2", "Cat3", "Cat4", "Cat5"};
        Swapper<String> stringSwapper = new Swapper<>();
        stringSwapper.swapElementsArray(cats, 0, 4);

        for(String s: cats) {
            System.out.print(s + " ");
        }
        System.out.println(" ");

        System.out.println("Task2:");
        Box<Apple> firstAppleBox = new Box<>(new ArrayList<>(Arrays.asList(new Apple(), new Apple(), new Apple(), new Apple())));
        Box<Apple> secondAppleBox = new Box<>(new ArrayList<>(Arrays.asList(new Apple())));
        Box<Apple> thirdAppleBox = new Box<>(new ArrayList<>());

        System.out.println("Коробка с яблоками 1: " + firstAppleBox);
        System.out.println("Коробка с яблоками 2: " + secondAppleBox);
        System.out.println("Коробка с яблоками 3: " + thirdAppleBox);

        Box<Orange> firstOrangeBox = new Box<>(new ArrayList<>(Arrays.asList(new Orange(), new Orange())));
        Box<Orange> secondOrangeBox = new Box<>(new ArrayList<>(Arrays.asList(new Orange())));
        Box<Orange> thirdOrangeBox = new Box<>(new ArrayList<>());

        System.out.println("Коробка с апельсинами 1: " + firstOrangeBox);
        System.out.println("Коробка с апельсинами 2: " + secondOrangeBox);
        System.out.println("Коробка с апельсинами 3: " + thirdOrangeBox);

        System.out.println("Вес коробок:");

        System.out.println("Коробка с яблоками 1: " + firstAppleBox.getWeight());
        System.out.println("Коробка с яблоками 2: " + secondAppleBox.getWeight());
        System.out.println("Коробка с яблоками 3: " + thirdAppleBox.getWeight());

        System.out.println("Коробка с апельсинами 1: " + firstOrangeBox.getWeight());
        System.out.println("Коробка с апельсинами 2: " + secondOrangeBox.getWeight());
        System.out.println("Коробка с апельсинами 3: " + thirdOrangeBox.getWeight());

        firstAppleBox.addFruits(new ArrayList<>(Arrays.asList(new Apple())));
        secondAppleBox.addFruits(new ArrayList<>(Arrays.asList(new Apple(), new Apple())));
        thirdAppleBox.addFruits(new ArrayList<>(Arrays.asList(new Apple(), new Apple(), new Apple())));

        System.out.println("Вес коробок:");

        System.out.println("Коробка с яблоками 1: " + firstAppleBox.getWeight());
        System.out.println("Коробка с яблоками 2: " + secondAppleBox.getWeight());
        System.out.println("Коробка с яблоками 3: " + thirdAppleBox.getWeight());

        System.out.println(secondAppleBox.compare(thirdAppleBox));
        System.out.println(thirdAppleBox.compare(thirdOrangeBox));

        firstOrangeBox.putIntoTheBox(thirdOrangeBox);
        System.out.println("Вес коробки с апельсинами 1: " + firstOrangeBox.getWeight());
        System.out.println("Вес коробки с апельсинами 3: " + thirdOrangeBox.getWeight());

        System.out.println(thirdAppleBox.compare(thirdOrangeBox));

    }
}
