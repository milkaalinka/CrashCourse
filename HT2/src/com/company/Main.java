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
        System.out.println("Task 88");
        System.out.print("Enter positive number:");
        int n = Integer.parseInt(br.readLine());
        int square = n*n;
        System.out.println(Integer.toString(square).contains("3"));
        System.out.println("1"+ n +"1");
	   
    }
}
