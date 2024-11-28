package lab1;


public class App 
{
    public static void main( String[] args )
    {

        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Вася");

        Dog dog = new Dog("Доби");

        LoudDog ld = new LoudDog("ДОБИ");

        Kennel ken = new Kennel();

        ken.addPet(cat1);
        ken.addPet(cat2);
        ken.addPet(dog);
        ken.addPet(ld);

        ken.allSpeak();
    }
}
