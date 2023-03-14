public class Banana extends Fruit{
    public Banana() {
        super("Banana");
    }

    @Override
    public String getName() {
        return super.getName();
    }
    public void removeSkin() {
        System.out.println("Skin removed");
    }
}
