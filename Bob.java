import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bob is a lackadaisical teenager. In conversation, his responses are very limited.");
        boolean continueConvo;
        do {
            continueConvo = true;
            System.out.println("\nWhat is your response?");
            String convo = scanner.nextLine();

            if (convo.endsWith("?")) {
                System.out.println("Sure");
            } else if (convo.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (convo.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (convo.equalsIgnoreCase("quit") || convo.equalsIgnoreCase("exit")) {
                continueConvo = false;
            } else {
                System.out.println("Whatever.");
            }
        } while (continueConvo);
    }
}
