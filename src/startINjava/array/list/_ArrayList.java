package startINjava.array.list;

import java.util.ArrayList;

public class _ArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        String car1 = cars.get(3);
        System.out.println("car1: " + car1);

        cars.set(2, "Tesla");
        cars.remove(3);
        System.out.println("cars.size(): " + cars.size());

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        for (String car : cars) {
            System.out.println(car);
        }

        cars.clear();

    }
}
