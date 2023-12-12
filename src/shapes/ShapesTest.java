package src.shapes;

public class ShapesTest {
     public static void main(String[] args) {
          Rectangle box1 = new Rectangle(5, 4);
          System.out.printf("Perimter is %f and Area is %f\n", box1.getPerimeter(), box1.getArea());
          Rectangle box2 = new Square(5);
          System.out.printf("Perimeter is %f and Area is %f", box2.getPerimeter(), box2.getArea());
     }
}
