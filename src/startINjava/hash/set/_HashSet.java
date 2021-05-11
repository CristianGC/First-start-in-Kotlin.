package startINjava.hash.set;

import java.util.HashSet;

public class _HashSet {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Tesla");
        cars.add("Mazda");

        System.out.println(cars);

        if (cars.contains("Mazda")) {
            cars.remove("Volvo");
        }

        System.out.println("cars.size: " + cars.size());

        for (String i : cars) {
            System.out.println(i);
        }

    }
}
