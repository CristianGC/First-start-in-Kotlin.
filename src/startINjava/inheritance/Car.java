package startINjava.inheritance;

final class Car extends Vehicle {
    private String modelName = "Mustang";

    public void moveN() {
        super.move("N");
    }

    public void moveS() {
        super.move("S");
    }

    public void moveW() {
        super.move("W");
    }

    public void moveE() {
        super.move("E");
    }
}
