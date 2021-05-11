package startINjava.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class _Iterator {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Iterator<String> it = cars.iterator();

        System.out.println(it.next());

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);

        Iterator<Integer> it2 = numbers.iterator();
        while (it.hasNext()) {
            Integer i = it2.next();
            if (i < 10) {
                it2.remove();
            }
        }
        System.out.println(numbers);
    }
}
