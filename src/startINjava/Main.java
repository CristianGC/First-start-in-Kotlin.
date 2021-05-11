package startINjava;

import startINjava._class.attributes.Attributes;
import startINjava.oop.*;

public class Main {
    public static void main(String[] args) {

        Apple myApple = new Apple();
        Mango myMango = new Mango();
        Banana myBanana = new Banana();

        Volvo myVolvo = new Volvo();
        Toyota myToyota = new Toyota();
        Audi myAudi = new Audi();

        Attributes myAttributes = new Attributes();

        //Accessing Attributes
        System.out.println(myAttributes.name);
        System.out.println(myAttributes.x);
        System.out.println(myAttributes.y);
        System.out.println(myAttributes.z);

        //Modify Attributes
        myAttributes.name = "myAttributes";
        myAttributes.x = 10;
        myAttributes.y = 10;
        //myAttributes.z = 10;

    }
}
