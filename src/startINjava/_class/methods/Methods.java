package startINjava._class.methods;

public class Methods {
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        myStaticMethod();

        Methods myMethods = new Methods();
        myMethods.myPublicMethod();
        myMethods.fullThrottle();           // Call the fullThrottle() method
        myMethods.speed(200);      // Call the speed() method
    }
}
