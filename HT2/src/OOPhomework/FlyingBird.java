package OOPhomework;

public class FlyingBird extends Bird{
    public void fly() {
        System.out.println("There are flying birds");
    }

    public FlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }
}
