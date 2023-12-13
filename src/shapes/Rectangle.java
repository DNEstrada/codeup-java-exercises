package src.shapes;

public class Rectangle extends Quadrilateral implements Measurable {

     public Rectangle(double length, double width) {
          super(length, width);
     }
//     protected double length;
//     protected double width;
//
//     public Rectangle (double length, double width) {
//          this.length = length;
//          this.width = width;
//     }
//
//     public double getArea () {
//          return this.length * this.width;
//     }
//
//     public double getPerimeter () {
//          return (2 * length) + (2 * width);
//     }

     @Override
     public double getPerimeter() {
          return 0;
     }

     @Override
     public double getArea() {
          return 0;
     }
}
