package com.company;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.sun.tools.doclint.Entity.or;

public class Main {

    public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    /*System.out.println("Task 56");
        System.out.println("Enter a,b,c,x,y:");
	    int a = Integer.parseInt(br.readLine());
	    int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        boolean d;
        if (((a*b) | (b*c) | (a*c)) <= (x*y)) d = true;
        else d = false;
        System.out.println(d);

        System.out.println("Task 3.1");
        System.out.println("Enter radius:");
        int radius = Integer.parseInt(br.readLine());
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimetr = "+perimeter);
        System.out.println("Area = "+area);*/

        System.out.println("Task 3.2");
        System.out.println("What is your name?");
        String name = br.readLine();
        System.out.println("Where do you live, "+ name+"?");
        String address = br.readLine();
        System.out.println("Hello "+name+" from "+address);

    }
}
