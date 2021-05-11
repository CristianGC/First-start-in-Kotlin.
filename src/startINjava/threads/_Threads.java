package startINjava.threads;

/**
 * extends Thread
 * implements Runnable
 */
public class _Threads extends Thread{
    public static int amount = 0;
    public static void main(String[] args) {
        _Threads obj =  new _Threads();
        obj.start();

        // Wait for the thread to finish
        while(obj.isAlive()) {
            System.out.println("Waiting...");
        }

        // Update amount and print its value
        System.out.println("_Threads: " + amount);
        amount++;
        System.out.println("_Threads: " + amount);
        amount++;

        System.out.println("_Threads: " + amount);

        System.out.println("This code is outside of the thread");
    }

    public void run() {
        amount++;
        System.out.println("This code is running in a thread");
    }
}
