package src;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in); // usually at the top
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f. \n", pi);

        scanner.useDelimiter("\n"); // have to hit enter after each word, otherwise hangs w/ multiple words
        System.out.println("Enter an integer");
        int inputInt = scanner.nextInt();

        System.out.println("Enter 3 words");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.printf("%s %s %s \n", firstWord, secondWord, thirdWord); // 2 words causes console to hang, more than 3 omits after third word

        scanner.nextLine(); // takes the Enter from the previous prompt in order to properly accept the sentence prompt
        System.out.println("Enter a sentence");
//        String sentenceNext = scanner.next(); Only grabs first word
        String sentenceNext = scanner.nextLine();
        System.out.println(sentenceNext);

        System.out.println("Enter the length of the classroom");
//        float classroomLength = parseFloat(scanner.next());
        int classroomLength = scanner.nextInt();
//        * int lengthAsInt = Integer.parseInt(length);
//        * double lengthAsInt = Double.parseDouble(length);
        System.out.println("Enter the width of the classroom");
//        float classroomWidth = parseFloat(scanner.next());
        int classroomWidth = scanner.nextInt();
//        * int widthAsInt = Integer.parseInt(width);
        System.out.println("The area of the classroom is " + (classroomLength * classroomWidth) + " and the perimeter is " + ((classroomLength*2)+(classroomWidth*2)));
//        * double areaOfRoom = lengthAsInt * widthAsInt;
//        * double perimeterOfRoom = (2*lengthAsInt) + (2*widthAsInt);
//        * System.out.printf("Area of room: %f%nPerimeter of room: %.2f",areaOfRoom,perimeterOfRoom);

        System.out.println("Enter the height of the classroom");
//        float classroomHeight = parseFloat(scanner.next());
        int classroomHeight = scanner.nextInt();
        System.out.println("The volume of the classroom is " + (classroomLength * classroomWidth * classroomHeight));
    }
}
