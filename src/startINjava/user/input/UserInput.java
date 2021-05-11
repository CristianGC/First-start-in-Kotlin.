package startINjava.user.input;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter Boolean: ");
        boolean useBoolean = myObj.nextBoolean();
        System.out.println("useBoolean is: " + useBoolean + "\n");

        System.out.print("Enter Byte: ");
        byte useByte = myObj.nextByte();
        System.out.println("useByte is: " + useByte + "\n");

        System.out.print("Enter Double: ");
        double useDouble= myObj.nextDouble();
        System.out.println("useDouble is: " + useDouble + "\n");

        System.out.print("Enter Float: ");
        float useFloat = myObj.nextFloat();
        System.out.println("useFloat is: " + useFloat + "\n");

        System.out.print("Enter Int: ");
        int useInt = myObj.nextInt();
        System.out.println("useInt is: " + useInt + "\n");

        System.out.print("Enter String: ");
        String useString = myObj.nextLine();
        System.out.println("useString is: " + useString + "\n");

        System.out.print("Enter Long: ");
        long useLong = myObj.nextLong();
        System.out.println("useLong is: " + useLong + "\n");

        System.out.print("Enter Short: ");
        short useShort = myObj.nextShort();
        System.out.println("useShort is: " + useShort + "\n");

    }
}
