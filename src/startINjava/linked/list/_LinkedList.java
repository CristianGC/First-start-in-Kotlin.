package startINjava.linked.list;

import java.util.LinkedList;

public class _LinkedList {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        cars.addFirst("FF");
        cars.addLast("GG");
        cars.removeFirst();
        cars.removeLast();

        System.out.println("cars.getFirst: " +  cars.getFirst());
        System.out.println("cars.getLast: " +  cars.getLast());
    }
}
