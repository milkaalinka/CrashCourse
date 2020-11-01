package OOPhomework;

public class Penguin extends NonFlyingBird {
    public void fly() {
        System.out.println("It's a penguin");
    }

    public Penguin(String feathers, int layEggs) {
        super(feathers,layEggs);
    }
}
