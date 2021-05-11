package startINjava._interface;

public class Interfaces {
    public static void main(String[] args) {
        Animal myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();

        Pig myPig2 = new Pig();
        myPig2.animalSound();
        myPig2.sleep();
        myPig2.myMethod();
        myPig2.myOtherMethod();
    }
}
