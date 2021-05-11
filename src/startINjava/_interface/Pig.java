package startINjava._interface;

public class Pig implements Animal, FirstInterface, SecondInterface{
    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }

    @Override
    public void myMethod() {
        System.out.println("Some text..");
    }

    @Override
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}
