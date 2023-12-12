package src;

public class ServerNameGenerator {
     public static String[] arr1 = {"busy", "dedicated", "smart", "big", "small", "dark", "complex", "deep", "detailed", "bright"};
     public static String[] arr2 = {"photon", "plant", "desk", "computer", "dock", "machine", "meta", "quantum", "linux", "night"};

     public static void main(String[] args) {
          String randAdj = randomElements(arr1);
          String randNoun = randomElements(arr2);
          String newName = randAdj + "-" + randNoun;
          System.out.println("Here is your server name:\n" + newName);
     }

     public static String randomElements (String[] arr) {
          int randNum = (int)(Math.random() * arr.length) + 1;
          return arr[randNum-1];
     }
}
