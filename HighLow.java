import java.util.Scanner;

public class HighLow {
     public static void main(String[] args) {
          playGame();
     }
     public static void playGame() {
          Scanner scanner = new Scanner(System.in);
          int randomInt = (int)(Math.random() * 100) + 1;
          System.out.println("Pick a number between 1 and 100");
          try {
               int userInput = scanner.nextInt();
               guessRound(randomInt, userInput);
          } catch (Exception e){
               System.out.println("That is not a number");
               playGame();
          }
     }
     public static void guessRound(int randomInt, int userInput) {
          Scanner scanner = new Scanner(System.in);
          boolean guessResult = numGuess(randomInt, userInput);
          while (guessResult == false) {
               System.out.println("Try again");
               userInput = scanner.nextInt();
               guessRound(randomInt, userInput);
          }
          System.out.println("Play again? y/n");
          String continuePrompt = scanner.next();
          if (continuePrompt.equals("y")) {
               playGame();
          } else System.exit(0);
     }
     public static boolean numGuess(int randomInt, int userInput) {
          if (userInput > randomInt) {
               System.out.println("LOWER");
               return false;
          } else if (userInput < randomInt) {
               System.out.println("HIGHER");
               return false;
          } else if (userInput == randomInt) {
               System.out.println("GOOD GUESS");
               return true;
          } else return false;
     }
}