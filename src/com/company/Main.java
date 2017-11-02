package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int loopItMyDude = 1;
        while(loopItMyDude == 1) {
            System.out.println("Please enter your code");
            Scanner kbin = new Scanner(System.in);
            String userInputtedCode = kbin.nextLine();
            Code response = new Code(userInputtedCode);
            response.hide(6, 15);

            System.out.println("Your encrypted code is: " + response.getCode());
            System.out.println("Would you like to decrypt your code \n Y/N? ");
            String YN = kbin.nextLine();

            if (YN.equalsIgnoreCase("Y")) {
                response.recover(6, 15);
                System.out.println("Your original code is " + response.getCode());
                System.out.println("\n Would you like to encrypt another string Y/N? ");
                String userContinue = kbin.nextLine();

                if (userContinue.equalsIgnoreCase("Y")) {

                    loopItMyDude = 1;
                } else {

                    loopItMyDude = 0;
                }


            } else {

                System.out.println("OK, Have a nice day!");
                break;
            }
        }
    }
}
