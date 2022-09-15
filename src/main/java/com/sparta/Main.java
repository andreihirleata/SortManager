package com.sparta;


import com.sparta.models.util.InputProcessor;
import com.sparta.views.DisplayManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        boolean cont = true;
        Scanner sc = new Scanner(System.in);
        while(cont){
            DisplayManager.displaySort();
            System.out.println("Do you want to start with a new array ?");
            if(InputProcessor.yesOrNo(sc.nextLine()).equalsIgnoreCase("no")) {
                cont = false;
            }
        }
    }
}