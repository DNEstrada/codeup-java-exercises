import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        1.a.
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        1.b.
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i = i * i;
//        } while (i < 1000000);

//        1.c.
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }

//        for (int i = 0; i <= 100; i+=2) {
//            System.out.println(i);
//        }

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (long i = 2; i < 1000000; i = i * i) {
//            System.out.println(i);
//        }

//        2.
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        3.
//        System.out.println("What number would you like to go up to?");
//        int intInput = scanner.nextInt();
//
//        System.out.println("Here is your table!\n");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for (int i = 1; i <= intInput; i++) {
//            System.out.printf("%d      | %d       | %d\n", i, i * i, i * i * i);
//        }
//        System.out.println("Do you want to continue? y/n");
//        String continuePrompt = scanner.next().toLowerCase();
//        if (continuePrompt.equals("y")) {
//            for (int i = intInput + 1; i <= intInput * 2; i++) {
//                System.out.printf("%d      | %d       | %d\n", i, i * i, i * i * i);
//            }
//        }

//        4.
        System.out.println("Please enter a numerical grade from 0 to 100");
        int numGrade = scanner.nextInt();
        if (numGrade >= 88 && numGrade <= 100) {
            System.out.println("A");
        } else if (numGrade >= 80 && numGrade <= 87) {
            System.out.println("B");
        } else if (numGrade >= 67 && numGrade <= 79) {
            System.out.println("C");
        } else if (numGrade >= 60 && numGrade <= 66) {
            System.out.println("D");
        } else if (numGrade >= 0 && numGrade <= 59) {
            System.out.println("F");
        }
        System.out.println("Do you want to continue? y/n");
        String continuePrompt = scanner.next().toLowerCase();
        if (continuePrompt.equals("y")) {
            System.out.println("Please enter a numerical grade from 0 to 100");
            numGrade = scanner.nextInt();
            if (numGrade >= 88 && numGrade <= 100) {
                System.out.println("A");
            } else if (numGrade >= 80 && numGrade <= 87) {
                System.out.println("B");
            } else if (numGrade >= 67 && numGrade <= 79) {
                System.out.println("C");
            } else if (numGrade >= 60 && numGrade <= 66) {
                System.out.println("D");
            } else if (numGrade >= 0 && numGrade <= 59) {
                System.out.println("F");
            }
        }
    }
}
