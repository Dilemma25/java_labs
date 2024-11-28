package lab1;

import java.util.ArrayList;

public class Kennel {
    private ArrayList<Pet> petList;

    public Kennel() {
        this.petList = new ArrayList<Pet>();
    }

    public void addPet(Pet pet) {
        this.petList.add(pet);
    }

    void allSpeak() {
        for (Pet pet : petList) {
            System.out.println(String.format("%s: %s", pet.getName(), pet.speak()));
        };
    }
}
