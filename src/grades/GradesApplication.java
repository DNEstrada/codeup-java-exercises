package src.grades;
import src.util.Input;

import java.util.Arrays;
import java.util.HashMap;

public class GradesApplication {
     static Input input = new Input();
     public static void main(String[] args) {
          HashMap<String, Student> students = new HashMap<>();

          Student daniel = new Student("Daniel");
          daniel.addGrade(90);
          daniel.addGrade(80);
          daniel.addGrade(70);
          Student nathan = new Student("Nathan");
          nathan.addGrade(80);
          nathan.addGrade(85);
          nathan.addGrade(70);
          Student casper = new Student("Casper");
          casper.addGrade(60);
          casper.addGrade(95);
          casper.addGrade(80);
          Student mark = new Student("Mark");
          mark.addGrade(95);
          mark.addGrade(75);
          mark.addGrade(85);

          students.put("DNEstrada", daniel);
          students.put("NathanPennington", nathan);
          students.put("CasperTheFriendlyGhost", casper);
          students.put("MarkSmith", mark);

          System.out.println("Welcome!\n\nHere are the GitHub usernames of our students:\n");
          String[] usernames = new String[students.size()];
          int i = 0;
          for ( String key : students.keySet() ) {
               usernames[i] = key;
               i++;
               System.out.print("|" + key + "| ");
          }
          System.out.println("\n\nWhat student would you like to see more information on?\n");
          String infoChoice = input.getString();
          int choice = 0;
          for (String key : students.keySet()) {
               if(infoChoice.equals(key)) {
                    choice += 1;
               }
          }
          if (choice == 0) {
               System.out.printf("\nSorry, no student found with the GitHub username of %s\n\nWould you like to see another student?\n", infoChoice);
          }
     }
}
