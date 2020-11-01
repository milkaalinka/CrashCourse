package OOPhomework;

public class Kiwi extends NonFlyingBird{
    public void fly() {
        System.out.println("It's a kiwi");
    }

    public Kiwi(String feathers, int layEggs) {
        super(feathers,layEggs);
    }
}
