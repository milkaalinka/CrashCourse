package OOPhomework;

public class NonFlyingBird extends Bird {
    public void fly() {
        System.out.println("There are non flying birds");
    }

    public NonFlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }
}
