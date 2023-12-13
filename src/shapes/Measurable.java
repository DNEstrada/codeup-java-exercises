package src.shapes;

public interface Measurable {
     default double getPerimeter() {
          return (2 * length) + (2 * width);
     }
     default double getArea() {
          return length * width;
     }
}
