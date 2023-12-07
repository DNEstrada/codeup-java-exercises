import java.util.Scanner;

public class MethodsExercises {
     public static void main(String[] args) {
//          System.out.println(addition(1, 2));
//          System.out.println(subtraction(2, 1));
//          System.out.println(multiplication(2, 3));
//          System.out.println(division(5, 0));
//          System.out.println(modulus(3, 2));
     getInteger(1, 10);
     }
     // 1.
     public static int addition(int x, int y) {
          return x + y;
     }
     public static int subtraction(int x, int y) {
          return x - y;
     }
     public static int multiplication(int x, int y) {
          return x * y;
     }
     public static float division(float x, float y) {
          return x / y; // divide by 0 returns infinity
     }
     public static int modulus(int x, int y) {
          return x % y;
     }
     // 2.
     public static int getInteger(int min, int max) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter a number between 1 and 10: ");
          int userInput = scanner.nextInt();
          if (userInput > min && userInput < max) {
               return userInput;
          } else {
               return getInteger(min, max);
          }
     }
}
