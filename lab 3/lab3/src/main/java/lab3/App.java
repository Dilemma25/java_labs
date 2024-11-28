package lab3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HiddenWord pazzle = new HiddenWord("прикол");

        System.out.println(pazzle.getHint("Прдкло"));
        System.out.println(pazzle.getHint("ПрикО"));
        System.out.println(pazzle.getHint("ПрикоЛ"));
    }
}
