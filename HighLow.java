import java.util.Scanner;

public class HighLow {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          int randomInt = (int)(Math.random() * 100) + 1;
          System.out.println(randomInt);
          System.out.println("Pick a number between 1 and 100");
          try {
           int userInput = scanner.nextInt();
           numGuess(randomInt, userInput);
          } catch (Exception e){
               System.out.println("That is not a number");

          }
     }
     public static void numGuess(int randomInt, int userInput) {
          if (userInput < 1 || userInput > 100);
          if (userInput > randomInt) {
               System.out.println("LOWER");
          } else if (userInput < randomInt) {
               System.out.println("HIGHER");
          } else if (userInput == randomInt) {
               System.out.println("GOOD GUESS");
          }
     }
}
