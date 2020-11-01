package OOPhomework;

public class Swallow extends FlyingBird{
    public void fly() {
        System.out.println("It's a swallow");
    }

    public Swallow(String feathers, int layEggs) {
        super(feathers, layEggs);
    }
}
