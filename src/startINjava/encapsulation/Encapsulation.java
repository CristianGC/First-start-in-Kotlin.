package startINjava.encapsulation;

public class Encapsulation {

    // private = restricted access
    private String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {

        Encapsulation myEncapsulation = new Encapsulation();
        myEncapsulation.setName("Encapsulation");

        System.out.println(myEncapsulation.getName());

    }
}
