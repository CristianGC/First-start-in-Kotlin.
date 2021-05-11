package startINjava.packages.API;

import java.util.Scanner;
import java.math.*;

public class Packages {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("myString: ->");
        String myString = myScanner.nextLine();

        System.out.println("This is my package!");
        System.out.println("myString: " + myString);
    }
}
