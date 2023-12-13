package src.shapes;

public class Square extends Quadrilateral implements Measurable {

     public Square(double length, double width) {
          super(length, width);
     }

     public double side;
//
//     public Square(double side) {
//          super(side, side);
//     }
//
     public double getArea () {
          side = length;
          return side * side;
     }

     public double getPerimeter () {
          side = length;
          return side * 4;
     }
}
