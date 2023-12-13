package src.shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
     protected double length;
     protected double width;

     public Quadrilateral(double length, double width) {
          super(length, width);
          this.length = length;
          this.width = width;
     }
     public void setLength(double length) {
          this.length = length;
     }
     public void setWidth(double width) {
          this.width = width;
     }

     public abstract double getPerimeter();

     public abstract double getArea();
}

