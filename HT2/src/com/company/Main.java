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
    }
}
