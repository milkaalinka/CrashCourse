package OOPhomework;

public class Eagle extends FlyingBird {

    public void fly() {
        System.out.println("It's an eagle");
    }

    public Eagle(String feathers, int layEggs) {
        super(feathers, layEggs);
    }
}
