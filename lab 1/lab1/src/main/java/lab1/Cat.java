package lab1;

public class Cat extends Pet {
    private String sound = "meow";
    
    public Cat(String name) {
        super(name);
    }

    public String speak() {
        return this.sound;
    }
}
