package lab1;

public class LoudDog extends Dog {
    
    public LoudDog(String name) {
        super(name);
    }

    public String speak() {
        return String.format("%s %s", this.sound, this.sound);
    }
}
