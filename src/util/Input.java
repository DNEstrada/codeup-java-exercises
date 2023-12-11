package src.util;

import java.util.Scanner;

public class Input {
     private Scanner scanner;

     public Input () {
          this.scanner = new Scanner(System.in);
     }

     public String getString() {
          System.out.println("Please enter a String");
          return this.scanner.next().toLowerCase();
     }

     public boolean yesNo() {
          String input = scanner.next();
          if (input.equals("y") || input.equals("yes")) {
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
          System.out.println("Please enter an integer");
          int input = scanner.nextInt();
          return input;
     }

     public double getDouble(double min, double max) {
          System.out.printf("Please enter a decimal number between %f and %f\n", min, max);
          double input = scanner.nextDouble();
          if (input >= min && input <= max) {
               return input;
          } else {
               return getDouble(min, max);
          }
     }

     public double getDouble() {
//          System.out.println("Please enter an decimal number");
          double input = scanner.nextDouble();
          return input;
     }
}
