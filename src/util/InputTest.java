package src.util;

public class InputTest {
     public static void main(String[] args) {
          Input input = new Input();
          System.out.println(input.getString()); // * new Input().getString();
          System.out.println("Do you want to quit");
          System.out.println(input.yesNo());
          System.out.println(input.getInt(1, 10));
          System.out.println(input.getInt());
          System.out.println(input.getDouble(1.1, 10.1));
          System.out.println(input.getDouble());
     }
}
