package src;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, ");
        System.out.print("World!");

        int myFavoriteNumber = 9;
        System.out.println(myFavoriteNumber);

        String myString = "stuff";
        System.out.println(myString);

        double myNumber = 3.14E00;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++); x is 5, it is incremented after it is run
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x); x is incremented then prints 6
//        System.out.println(x);

//        String class = "class";   not a statement

        String theNumberThree = "three";
        Object o = theNumberThree;
//        int three = (int) o;    having issues converting object to int

//        int three = (int) "three";    String cannot be converted to int

//        int x = 4;
//        x += 5; //x = x + 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x; //y = y * x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
//        x /= y; x = x / y;
//        System.out.println(x);

        y -= x;  //y = y - x;
        System.out.println(y);

//        byte num = 1024;  lossy conversion
        System.out.println(Integer.MAX_VALUE); // 2147483647, 4 bytes allocated
    }
}
