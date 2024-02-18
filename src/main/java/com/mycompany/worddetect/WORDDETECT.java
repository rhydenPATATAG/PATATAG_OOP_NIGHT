package com.mycompany.worddetect;

import java.util.Scanner;

public class WORDDETECT {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the message to detect if JEJE! or uWu:");
        String message = scanner.nextLine();
        
        boolean foundMisplacedCapital = false;
      
       
        for (int i = 1; i < message.length(); i++) {
            if (Character.isUpperCase(message.charAt(i)) && 
                Character.isLetter(message.charAt(i - 1)) && 
                Character.isLowerCase(message.charAt(i - 1))) {
                foundMisplacedCapital = true;
                break;
            }
        }
        
        
        if (foundMisplacedCapital) {
            System.out.println("JEJE!");
        } else {
            System.out.println("uWu");
        }
        
        scanner.close();
    }

    public static class worddetect {
    } 
}
