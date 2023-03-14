public class Apple extends Fruit{
    public Apple() {
        super("Apple");
    }

    @Override
    public String getName() {
        return super.getName();
    }
    public void removeCore() {
        System.out.println("Core removed");
    }
}
