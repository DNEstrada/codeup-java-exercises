package src.shapes;
import src.util.Input;

public class CircleApp {
     public static void main(String[]args) {
          System.out.println("What is the radius of the circle?");
          Input input = new Input();
          Circle circle = new Circle(input.getDouble());
          System.out.printf("The area of the circle is %f\n", circle.getArea());
          System.out.printf("The circumference of the circle is %f\n", circle.getCircumference());
     }
}
