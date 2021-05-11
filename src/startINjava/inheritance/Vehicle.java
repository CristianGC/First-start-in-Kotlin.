package startINjava.inheritance;

public class Vehicle {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Tuut, tuut!");
    }

    final protected void move(String move) {
        System.out.println("move, " + move + "!");
    }
}
