package src.shapes;

public interface Measurable {
     default double getPerimeter(double length, double width) {
          return (2 * length) + (2 * width);
     }
     default double getArea(double length, double width) {
          return length * width;
     }
}
