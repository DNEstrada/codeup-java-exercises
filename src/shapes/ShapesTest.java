package src.shapes;

public class ShapesTest {
     static Measurable myShape;
     public static void main(String[] args) {
//          Rectangle box1 = new Rectangle(5, 4);
//          System.out.printf("Perimter is %f and Area is %f\n", box1.getPerimeter(), box1.getArea());
//          Rectangle box2 = new Square(5);
//          System.out.printf("Perimeter is %f and Area is %f", box2.getPerimeter(), box2.getArea());
          myShape = new Square(5, 5);
          System.out.printf("Perimter is %f and Area is %f\n", myShape.getPerimeter(5, 5), myShape.getArea(5, 5)); // it is looking for the getPerimeter in square but it is in Measurable
          myShape = new Rectangle(5, 10);
          System.out.printf("Perimeter is %f and Area is %f", myShape.getPerimeter(myShape.length, myShape.width), myShape.getArea(myShape.length, myShape.width));
//          System.out.println(myShape.getLength); // does not have getLength/Width defined, have to cast it as rectangle
//          ((Rectangle) myShape).sayHello());
     }
}
