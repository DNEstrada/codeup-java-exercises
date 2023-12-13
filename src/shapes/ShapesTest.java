package src.shapes;

public class ShapesTest {
     public static void main(String[] args) {
//          Rectangle box1 = new Rectangle(5, 4);
//          System.out.printf("Perimter is %f and Area is %f\n", box1.getPerimeter(), box1.getArea());
//          Rectangle box2 = new Square(5);
//          System.out.printf("Perimeter is %f and Area is %f", box2.getPerimeter(), box2.getArea());
          Measurable myShape; // does not have getLength/Width defined
          Square square = new Square(5, 10);
          System.out.printf("Perimter is %f and Area is %f\n", square.getPerimeter(), square.getArea()); // it is looking for the getPerimeter in square but it is in Measurable
          Rectangle rectangle = new Rectangle(2, 15);
          System.out.printf("Perimeter is %f and Area is %f", rectangle.getPerimeter(), rectangle.getArea());
          System.out.println(myShape.getLength);
     }
}
