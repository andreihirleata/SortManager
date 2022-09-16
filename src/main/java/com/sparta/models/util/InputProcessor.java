package com.sparta.models.util;



import java.util.InputMismatchException;
import java.util.Scanner;

import static com.sparta.models.sorters.MergeSort.logger;

public class InputProcessor {


    public static int processInt(String s,int bound) {
        try {
            System.out.println(s);
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            while (choice < 0 || choice > bound) {
                choice = processInt("Please enter a valid choice.", bound);
            }
            logger.debug("User input " + choice);
            return choice;
        } catch (InputMismatchException e) {
            logger.error(e.getMessage(), e);
            System.out.println("Invalid input - Defaulted to 1");
        }
    return 1;
    }

    public static String yesOrNo (String response) {
        Scanner sc = new Scanner(System.in);
        if(response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
            return "yes";
        } else if(response.equalsIgnoreCase("no") || response.equalsIgnoreCase("n")) {
            return "no";
        } else {
            System.out.println("Please enter \"yes\" or \"no\"");
            String choice = sc.nextLine();
            logger.debug("User input " + choice);
            return yesOrNo(choice);
        }
    }
}
