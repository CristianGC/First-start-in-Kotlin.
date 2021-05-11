package startINjava.constructors;

public class Constructors {

    public String name;
    private float x;
    private float z;
    private float y;

    public Constructors(){
    }

    public Constructors(String name){
        this.name = name;
    }

    public Constructors(float x, float z, float y){
        this.x = x;
        this.z = z;
        this.y = y;
    }

    public Constructors(float x, float z){
        this.x = x;
        this.z = z;
    }

    float getX(){
        return this.x;
    }

    float getZ(){
        return this.z;
    }

    float getY(){
        return this.y;
    }

    public static void main(String[] args) {
        Constructors myObj = new Constructors("Constructors");
        System.out.println(myObj.name);
    }
}
