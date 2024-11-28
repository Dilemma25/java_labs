package lab1;

public abstract class Pet {
    private String myName;

    public Pet(String name) {
        this.myName = name;
    }

    public String getName() {
        return this.myName;
    }

    public abstract String speak();
}
