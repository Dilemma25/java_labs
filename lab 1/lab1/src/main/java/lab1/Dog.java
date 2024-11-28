package lab1;

public class Dog extends Pet {
    protected String sound = "gaf";
    
    public Dog(String name) {
        super(name);
    }

    public String speak() {
        return this.sound;
    }
}
