package src.shapes;

public class Square extends Rectangle {
     public double side;

     public Square(double side) {
          super(side, side);
     }

     public double getArea () {
          side = length;
          return side * side;
     }

     public double getPerimeter () {
          side = length;
          return side * 4;
     }
}
