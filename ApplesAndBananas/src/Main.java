import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /**Uppgift 1 - Skapa en abstrakt klass Fruit och låt Banana och Apple extenda Fruit, skapa varsina metoder och skriv ut*/
        var apple = new Apple();
        var banana = new Banana();

        System.out.println(apple.getName());
        apple.removeCore();
        System.out.println(banana.getName());
        banana.removeSkin();

        System.out.println("\n");

        /**Uppgift 2 - Skapa en arraylist med fruit och skriv ut både name och metodanrop*/
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(apple);
        fruits.add(banana);

        for (Fruit fruit : fruits) {
            if (fruit instanceof Banana) {
                System.out.println("Hey, i am a " + fruit.getName());
                ((Banana) fruit).removeSkin();
            } else if (fruit instanceof Apple) {
                System.out.println("Hello there mate, i am an " + fruit.getName());
                ((Apple) fruit).removeCore();
            }
        }

    }
}
