package src.util;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
     private Scanner scanner;

     public Input () {
          this.scanner = new Scanner(System.in);
     }

     public String getString() {
//          System.out.println("Please enter a String");
          return this.scanner.nextLine();
     }

     public boolean yesNo() {
          String input = scanner.next().toLowerCase();
          if (input.equals("y") || input.equals("yes")) { // * return the comparison, don't need if statement
               return true;
          } else {
               return false;
          }
     }

     public int getInt(int min, int max) {
          System.out.printf("Please enter an integer between %d and %d\n", min, max);
          int input = scanner.nextInt();
          if (input >= min && input <= max) {
               return input;
          } else {
               return getInt(min, max);
          }
     }

     public int getInt() {
          String userInput = getString();
          try {
               Integer.valueOf(userInput);
          } catch(NumberFormatException e) {
               System.out.println("Bad input");
               return getInt();
          }
          int userNum = Integer.parseInt(userInput);
          return Integer.parseInt(userInput);
     }

     public double getDouble(double min, double max) {
          System.out.printf("Please enter a decimal number between %f and %f\n", min, max);
          String userInput = scanner.nextLine();
//          System.out.println("Please enter an decimal number");
          try {
               Double.valueOf(userInput);
          } catch(NumberFormatException e) {
               System.out.println("You did not enter a valid number. Please try again");
               return getDouble();
          }
          double userNum = Double.parseDouble(userInput);
          if (userNum >= min && userNum <= max) {
               return userNum;
          } else {
               System.out.println("you did not enter a number betwee " + min + " and " + max + ". Try again.");
               return getDouble(min, max);
          }

     }

     public double getDouble() {
          String userInput = scanner.nextLine();
//          System.out.println("Please enter an decimal number");
          try {
               Double.valueOf(userInput);
          } catch(NumberFormatException e) {
               System.out.println("You did not enter a valid number. Please try again");
               return getDouble();
          }
          double userNum = Double.parseDouble(userInput);
          return userNum;
     }
}
