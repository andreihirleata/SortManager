package com.sparta.models.util;

import java.util.Scanner;

public class InputProcessor {
    public static int processInt(String s,int bound) {
        System.out.println(s);
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        while (choice < 0 || choice > bound ) {
         choice = processInt("Please enter a valid choice.",bound);
        }
        return choice;
    }
}
