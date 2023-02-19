/**
        * (The MAin Class). Design a class named Main to check how factory design is helpful for us
        * 1. here user just enter the number that are given according to that he will get his response
          means for what mobile phone he is looking for.
        * 2.Factory Design Pattern is helping like that now there is no need to change the whole code
          if we want to change or add some code then we can do it manually.
        * 3. Every class has its own implementation.So changes and insertion will not disturb other class.

        */

import factoryMethod.MobileAvailable;
import factoryMethod.MobileDetail;
import factoryMethod.MobileFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter 1 for Real ME: \n" +
                "Enter 2 for Samsung: \n" +
                "Enter 3 for Iphone:\n");
        Scanner userInput = new Scanner(System.in);

        int customerChoice = userInput.nextInt();


            if (customerChoice <= 0 && customerChoice > 3) {
                System.out.println("Invalid Choice");
            } else {
                MobileDetail mobileDetail = MobileFactory
                        .createMobile(MobileAvailable.values()[customerChoice - 1]);
                System.out.println(mobileDetail);
                mobileDetail.showMobileDetail();
            }



    }
}