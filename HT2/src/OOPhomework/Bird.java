package OOPhomework;

import java.util.List;

public abstract class Bird {
    private String feathers;
    private int layEggs;
    private List<Bird>birds;

    public abstract void fly();

    public Bird(String feathers, int layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public String getFeathers() {
        return feathers;
    }

    public int getLayEggs() {
        return layEggs;
    }

    public List<Bird> getBirds() {
        return birds;
    }

    public void setBirds(List<Bird>birds) {
        this.birds = birds;
    }

}
