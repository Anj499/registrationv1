package com.api;

import java.util.Scanner;
import java.util.function.Predicate;

public class A {
    public static void main(String[]args){
        //Predicate Functional Interface
        //It take input & produce boolean value output
        //Predicate<Integer> val= x->x>300;
       // Predicate<String> val= x->x.equals("mike");
       // boolean result= val.test(100);
       // boolean result= val.test("mike");
       // System.out.println(result);

                // Create a scanner object to get user input
                Scanner scanner = new Scanner(System.in);

                // Prompt the user to enter a string
                System.out.println("Enter a string: ");
                String input = scanner.nextLine();

                // Call the function to check if the input is a palindrome
                if (isPalindrome(input)) {
                    System.out.println(input + " is a palindrome.");
                } else {
                    System.out.println(input + " is not a palindrome.");
                }
            }

            // Function to check if a string is a palindrome
            public static boolean isPalindrome(String str) {
                // Remove spaces and convert to lowercase for case-insensitive comparison
                String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

                // Get the length of the string
                int length = cleanStr.length();

                // Check if the string is the same forwards and backwards
                for (int i = 0; i < length / 2; i++) {
                    if (cleanStr.charAt(i) != cleanStr.charAt(length - i - 1)) {
                        return false; // If any character does not match, it's not a palindrome
                    }
                }
                return true; // If all characters match, it is a palindrome
            }
        }


