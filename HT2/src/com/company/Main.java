package com.company;
import OOPhomework.*;

import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static com.sun.tools.doclint.Entity.or;

public class Main {

    public static void main(String[] args) throws IOException {
        Eagle eagle = new Eagle("grey",3);
        Swallow swallow = new Swallow("black", 5);
        Penguin penguin = new Penguin("white", 2);
        Kiwi kiwi = new Kiwi("green",1);

        List<Bird> birdList = new ArrayList<>();
        birdList.add(eagle);
        birdList.add(swallow);
        birdList.add(penguin);
        birdList.add(kiwi);

        eagle.fly();
        swallow.fly();
        penguin.fly();
        kiwi.fly();

        /*for(Bird bird : birdList) {
            System.out.print(bird.getFeathers() + " ");
            System.out.println(bird.getLayEggs() + " ");
        }*/
    }
}
